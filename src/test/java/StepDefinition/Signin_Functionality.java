package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driverfactory.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.RegisterPage;
import pages.Signin;


public class Signin_Functionality extends BaseTest{

	private WebDriver driver = getDriver();
	private RegisterPage register = new RegisterPage(BaseTest.getDriver());
	private Signin si = new Signin(BaseTest.getDriver());

	@Given("User is in the signin page")
	public void user_is_in_the_signin_page() throws InterruptedException
	{
		
		BaseTest.getDriver().get("https://dsportalapp.herokuapp.com/");
		Thread.sleep(5000);
		register.Getstarted();
		Thread.sleep(5000);
		si.signin();

	}

	@When("user enters <v_username> and <v_password>")
	public  void user_enters_username_and_password(DataTable credentials) throws InterruptedException 
	{
		Thread.sleep(1000);
		List<List<String>> data = credentials.cells();
		driver.findElement(By.id("id_username")).sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys(data.get(0).get(1));
	}	
	
	@Then("user clicks on signin")
	public void user_clicks_on_signin() throws InterruptedException 
	{
		Thread.sleep(5000);
		si.login();
		Thread.sleep(5000);
	}


}
