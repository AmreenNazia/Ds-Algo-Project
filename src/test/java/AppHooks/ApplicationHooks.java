package AppHooks;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 

import Driverfactory.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ConfigReader;

public class ApplicationHooks {
	
	private  BaseTest basetest;
	private WebDriver driver;
	private ConfigReader configReader;
	  Properties prop;
	
	@Before(order = 0)
	public void get_property() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		
		
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		String browsername = prop.getProperty("browser");
		String url = prop.getProperty("testurl");
		basetest = new BaseTest();
		driver = basetest.init_driver(browsername);
		driver.navigate().to(url);
	}
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}

}
