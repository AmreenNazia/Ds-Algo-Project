package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public  class RegisterPage   {

	private WebDriver driver;

	private  By Getstarted_btn = By.xpath("//button[text()='Get Started']");
	private By Register_link = By.xpath(" //a[@href='/register']");
	private By Register_Usrname = By.id("id_username");
	private By Register_pwd = By.id("id_password1");
	private By Register_confirm_pwd = By.id("id_password2");
	private By Register_btn = By.xpath("//input[@type='submit']");
	private By alert_message = By.xpath("//div[@role='alert']");
	private By home = By.xpath("//a[@href='/home']");
	String user_name;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	public void Getstarted() throws InterruptedException {
		Actions action = new Actions(driver);
		 JavascriptExecutor js	 = (JavascriptExecutor) driver;
		 WebElement first_item = new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get Started']")));
			js.executeScript("arguments[0].scrollIntoView(true);", first_item);
			action.moveToElement(first_item).click().perform();
	}
	public void Register_link() {

		driver.findElement(Register_link).click();
	}
	public void enterUsername(String username) {
		  user_name = username;
		driver.findElement(Register_Usrname).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(Register_pwd).sendKeys(password);
	}
	public void enterConfirmPassword(String confirm_password) {

		driver.findElement(Register_confirm_pwd).sendKeys(confirm_password);
	}
	public void clickRegister() {
		
		driver.findElement(Register_btn).click();
//		driver.findElement(home).click();
		
	}
	

	public void Alertmessage() throws InterruptedException {
		
		
 	
		String actual = driver.findElement(alert_message).getText();
		String expected = "New Account Created. You are logged in as "+user_name;
		 
		 Assert.assertEquals(actual, expected);
			driver.findElement(home).click();
			System.out.println("Registered Successfully");
		}
 		
		
	public void error_message()
	{
		String exp1 = "password_mismatch:The two password fields didn’t match.";
		WebElement m = driver.findElement(By.xpath("//div[@role='alert']"));
		String error_msg = m.getText();
	      System.out.println("Error message is: "+error_msg);
	      if(error_msg.equalsIgnoreCase(exp1))
	      {
	    	  System.out.println("Verification success");
	      }
	      else
	      {
	    	  System.out.println("Verification failed");
	      }
 
}
}
