package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public  class RegisterPage   {

	private WebDriver driver;

	private  By Getstarted_btn = By.xpath("//button[text()='Get Started']");
	private By Register_link = By.xpath(" //a[@href='/register']");
	private By Register_Usrname = By.id("id_username");
	private By Register_pwd = By.id("id_password1");
	private By Register_confirm_pwd = By.id("id_password2");
	private By Register_btn = By.xpath("//input[@type='submit']");
	private By alert_message = By.xpath("//div[@role='alert']");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	public void Getstarted() {

		driver.findElement(Getstarted_btn).click();
	}
	public void Register_link() {

		driver.findElement(Register_link).click();
	}
	public void enterUsername(String username) {

		driver.findElement(Register_Usrname).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(Register_pwd).sendKeys(password);
	}
	public void enterConfirmPassword(String confirm_password) {

		driver.findElement(Register_confirm_pwd).sendKeys(confirm_password);
	}
	public boolean clickRegister() {

		driver.findElement(Register_btn).click();
		return driver.findElement(alert_message).isDisplayed();

	}

	public boolean alertmessage() {
		return driver.findElement(alert_message).isDisplayed();

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

