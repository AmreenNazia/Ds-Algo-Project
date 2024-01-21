package StepDefinition;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.RegisterPage;

public class Register_Functionality   {

	private RegisterPage register = new RegisterPage(BaseTest.getDriver());
	 
	 
	@Given("Browser is open")
	public   void browser_is_open() {

		 BaseTest.getDriver().get("https://dsportalapp.herokuapp.com/");
		 
		 
	}

	@And("user click on getstarted and navigates to reigster page")
	public  void user_click_on_getstarted_and_navigates_to_reigster_page() {

		 
		register.Getstarted();

	}	
	@And("user clicks on Register")
	public void user_clicks_on_register() {

		register.Register_link();
	}

	@When("^user enters (.*) and(.*) and (.*)$")
	public void user_enters_username_and_password_and_confirm_password(String username, String password, String confirm_password) throws InterruptedException {
		Thread.sleep(3000);
		register.enterUsername(username);
		Thread.sleep(3000);
		register.enterPassword(password);
		Thread.sleep(3000);
		System.out.println(password);
		System.out.println(confirm_password);
		register.enterConfirmPassword(confirm_password);
	}

	@When("click reigster button")
	public void click_reigster_button() throws InterruptedException {
		Thread.sleep(3000);
		register.clickRegister();

	}

	@Then("user registeration is unsuccessfull and with error mismatch message")
	public void user_registeration_is_unsuccessfull_and_with_error_mismatch_message() throws InterruptedException {
		Thread.sleep(3000); 
		register.alertmessage();
	}

 
 
}


