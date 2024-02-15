package StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driverfactory.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.Linked_List;
import pages.RegisterPage;
import pages.Signin;
import utility.ExcelReader;

public class Linkedlist_functionality extends BaseTest {
	
	
	private WebDriver driver = getDriver();
	private RegisterPage register = new RegisterPage(BaseTest.getDriver());
	private Signin si = new Signin(BaseTest.getDriver());
	private Linked_List ll = new Linked_List(BaseTest.getDriver());
	ExcelReader reader = new ExcelReader();
	
	@Given("user enters login page")
	public void user_enters_login_page() throws InterruptedException {
		Thread.sleep(1000);
		ll.Getstarted();
		ll.signin();
		
		 
	     
	}

	@When("user submits login credentials <username> and <password>")
	public void user_submits_login_credentials_username_and_password(DataTable credentials) throws InterruptedException {
		 
		List<List<String>> data = credentials.cells();
		driver.findElement(By.id("id_username")).sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys(data.get(0).get(1));		
	}

	@Then("user navigate to home_page")
	public void user_navigate_to_home_page() throws InterruptedException {
		ll.credential_login_button();
	}

	@Given("user is in Linkedlist page after loggedin")
	public void user_is_in_linkedlist_page_after_loggedin() {
		 ll.linkedlist_started();
	}

	@When("user clicks on Introduction")
	public void user_clicks_on_introduction() {
		ll.linked_list_introduction();
	}

	@When("user clicks on practice questions and then navigates back")
	public void user_clicks_on_practice_questions_and_then_navigates_back() throws InterruptedException {
		 
		ll.practice_questions_link();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@When("user fills the Text area with Sheetname {string} and Rownumber {int}")
	public void user_fills_the_text_area_with_sheetname_and_rownumber(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException, InterruptedException {
		 
		List<Map<String,String>>testData = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python1.xlsx"), Sheetname);	
		String text = testData.get(Rownumber).get("Code");
		Thread.sleep(3000);
		ll.linkedlist_text_editor(text);
	}

	@When("user clicks on Creating Linked List")
	public void user_clicks_on_creating_linked_list() {
		ll.creating_linkedlist();
	}

	@When("user clicks on Types of Linked List")
	public void user_clicks_on_types_of_linked_list() {
		ll.types_of_linkedlist();
	}

	@When("user clicks on Implementation of linked list in python")
	public void user_clicks_on_implementation_of_linked_list_in_python() {
		ll.implement_llist_in_python();
	}
	 
	@When("user clicks on Traversal")
	public void user_clicks_on_traversal() {
		 ll.llist_traversal();
	}
	@When("user clicks on Insertion")
	public void user_clicks_on_insertion() {
		 ll.llist_insertion();
	}

	@When("user clicks on Deletion")
	public void user_clicks_on_deletion() {
		 ll.llist_deletion();
	}


}
