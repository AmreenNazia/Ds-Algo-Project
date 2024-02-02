package Driverfactory;
 
import java.time.Duration;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.SafariDriver;

 
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  {

	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public static ThreadLocal<Url> url = new ThreadLocal<>();
	 
	
	public WebDriver init_driver(String browser) {
		
	if(browser.equalsIgnoreCase("chrome"))
	{
		 
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver()); 
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
		tlDriver.set(new EdgeDriver());
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

