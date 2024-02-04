package AppHooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Driverfactory.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
 
import utility.ConfigReader;

public class ApplicationHooks {
	
	private static  BaseTest basetest;
	private static WebDriver driver;
	private static ConfigReader configReader;
	  static Properties prop;
	
	 
	 
	 
	@Before(order = 0)
	public void get_property() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		
		
	}
	
	 
	 
	 
	@Before(order = 1)
	public void launchBrowser() throws Throwable {
		String browser =  prop.getProperty("browser");
		String url = prop.getProperty("testurl");
		basetest = new BaseTest();
		driver = basetest.init_driver(browser);
		driver.navigate().to(url);
	}
	
	 
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	 
	 
	@After(order = 1)
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			Date d = new Date();
			System.out.println(d.toString());
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourcePath, new File((System.getProperty("user.dir")+"/ScreenShorts")+"/image"+sdf.format(d)+".png"));
		}
	}

}
