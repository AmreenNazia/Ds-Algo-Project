package Driverfactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.SafariDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest  {

	public static WebDriver driver;
	static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {

	 
			if(browser.equalsIgnoreCase("chrome"))
			{

				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				tlDriver.set(new ChromeDriver(options)); 
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver()); 
			}
			else if(browser.equalsIgnoreCase("safari"))
			{
				WebDriverManager.safaridriver().setup();
				tlDriver.set(new SafariDriver()); 
			}
			else if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions options = new EdgeOptions();
				options.addArguments("headless");
				tlDriver.set(new EdgeDriver(options)); 
			}
			else {
				System.out.println("please pass the correct broswer " + browser);

			}
		
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();

		return getDriver();


	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}

