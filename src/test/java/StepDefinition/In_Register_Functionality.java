package StepDefinition;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.RegisterPage;

public class In_Register_Functionality 
{
	private RegisterPage register = new RegisterPage(BaseTest.getDriver());
	
	@Given("Open the browser")
	public void open_the_browser() 
	{
		BaseTest.getDriver().get("https://dsportalapp.herokuapp.com/");	 
	}

	@And("I click on getstarted and navigates to reigster page")
	public void i_click_on_getstarted_and_navigates_to_reigster_page() 
	{
		register.Getstarted();
	}

	@And("I click on Register")
	public void i_click_on_register() 
	{
		register.Register_link();
	}

	@When("I enters username as {string} and as {string} and as {string}")
	public void i_enters_username_as_and_as_and_as(String username, String password, String confirm_password) throws InterruptedException 
	{
		Thread.sleep(3000);
		register.enterUsername(username);
		Thread.sleep(3000);
		register.enterPassword(password);
		Thread.sleep(3000);
		System.out.println(password);
		System.out.println(confirm_password);
		register.enterConfirmPassword(confirm_password);
	}

	@And("I click reigster button")
	public void i_click_reigster_button() throws InterruptedException 
	{
		Thread.sleep(3000);
		register.clickRegister();
	}

	@Then("my registeration is unsuccessfull and with error mismatch message")
	public void my_registeration_is_unsuccessfull_and_with_error_mismatch_message() throws InterruptedException 
	{
		Thread.sleep(3000);
		register.error_message();
	}



}
