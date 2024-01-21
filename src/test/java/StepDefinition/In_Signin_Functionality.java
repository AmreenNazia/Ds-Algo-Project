package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driverfactory.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.RegisterPage;
import pages.Signin;

public class In_Signin_Functionality extends BaseTest
{
private WebDriver driver = getDriver();
private RegisterPage register = new RegisterPage(BaseTest.getDriver());
private Signin si = new Signin(BaseTest.getDriver());

	@Given("I am in the signin page")
	public void i_am_in_the_signin_page() throws InterruptedException 
	{
		BaseTest.getDriver().get("https://dsportalapp.herokuapp.com/");
		Thread.sleep(5000);
		register.Getstarted();
		Thread.sleep(5000);
		si.signin();
	}

	@When("user enters <inv_username> and <inv_password>")
	public void user_enters_inv_username_and_inv_password(DataTable credentials) throws InterruptedException 
	{
		Thread.sleep(1000);
		List<List<String>> data = credentials.cells();
		driver.findElement(By.id("id_username")).sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys(data.get(0).get(1));
	}

	@Then("I click on signin")
	public void i_click_on_signin() throws InterruptedException 
	{
		Thread.sleep(5000);
		si.login();
		Thread.sleep(5000);
	}

	@Then("I should not be signed in and get the alert message")
	public void i_should_not_be_signed_in_and_get_the_alert_message() 
	{
	    si.alert();
	}



}
