package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin {
	
	private WebDriver driver;
	
	By Getstarted_btn = By.xpath("//button[text()='Get Started']");
	By signin_link = By.xpath("//a[text()='Sign in']");
	By sign_username = By.id("id_username");
	By sign_password = By.id("id_password");
	By login_button = By.xpath("//input[@value='Login']");
	
	public Signin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebDriver signin()
	{
		driver.findElement(signin_link).click();
		return driver;
	}
	public WebDriver login()
	{
		driver.findElement(login_button).click();
		return driver;
	}
	public WebDriver alert()
	{
		String exp = "Invalid Username and Password";
		WebElement m = driver.findElement(By.xpath("//div[@role='alert']"));
		String err_msg = m.getText();
	      System.out.println("Error message is: "+err_msg);
	      if(err_msg.equalsIgnoreCase(exp))
	      {
	    	  System.out.println("Verification success");
	      }
	      else
	      {
	    	  System.out.println("Verification failed");
	      }
		return driver;
	}

}
