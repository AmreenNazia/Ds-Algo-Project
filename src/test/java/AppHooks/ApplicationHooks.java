package AppHooks;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
 
 

import java.io.File;



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
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;

import utility.ConfigReader;


public class ApplicationHooks {

	private   BaseTest basetest;
	private static    WebDriver driver;
	private  ConfigReader configReader;
	static Properties prop;


	 
	@BeforeMethod
	@Before(order = 0)
	public void get_property() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

	}


	 
	@BeforeMethod
	@Before(order = 1)
	public void launchBrowser() throws Throwable {
		String browser = ConfigReader.getBrowserType();
		String url = prop.getProperty("testurl");
		basetest = new BaseTest();
		driver = basetest.init_driver(browser);
		System.out.println(driver);
		driver.navigate().to(url);
	}


	 
	 
	public static  void quitBrowser() {

		 
			driver.quit();
		 
	}

	@AfterTest
	@After(order = 1)
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			Date d = new Date();
			System.out.println(d.toString());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourcePath, new File((System.getProperty("user.dir")+"/ScreenShots")+"/image"+sdf.format(d)+".png"));
		}
	}

}
