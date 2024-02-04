package StepDefinition;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.RegisterPage;

public class Register_Functionality {
	
	private RegisterPage register = new RegisterPage(BaseTest.getDriver());
	
	@Given("user is in Register page")
	public void user_is_in_register_page() {
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
		register.enterPassword(confirm_password);
		Thread.sleep(3000);
		register.enterConfirmPassword(confirm_password);
	     
	}

	@And("click reigster button")
	public void click_reigster_button() throws InterruptedException {
		Thread.sleep(3000);
	    register.clickRegister();
	}

	@Then("user should get registered and navigates to home page")
	public void user_should_get_registered_and_navigates_to_home_page() throws InterruptedException {
		Thread.sleep(3000);
	    register.Alertmessage();
	}
	@Then("user should get mismatch password message")
	public void user_should_get_mismatch_password_message() {
	    register.error_message();
	}




}
