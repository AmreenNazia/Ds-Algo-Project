package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



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
	public void clickRegister() {

		driver.findElement(Register_btn).click();
		System.out.println(driver.findElement(alert_message).getText());

	}

	public void alertmessage() {
		System.out.println(driver.findElement(alert_message).getText());

	}
}

