package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.DataStructure;
import utility.ExcelReader;

public class DataStructure_Functionality {
	
	private DataStructure ds = new DataStructure(BaseTest.getDriver());
	
	@Given("user navigates to login_page")
	public void user_navigates_to_login_page() throws InterruptedException {
	    ds.GetStarted_Main();
	    ds.signin();
	}

	@When("user submits login_credentials")
	public void user_submits_login_credentials() {
	     ds.User_Password();
	}

	@Then("user navigates to home_page")
	public void user_navigates_to_home_page() {
	    ds.login();
	}

	@Given("user is in data structure page after logged in")
	public void user_is_in_data_structure_page_after_logged_in() {
	     ds.Getstarted_btn_DataStrctr();
	}

	@When("user clicks on Time complexity of data structure")
	public void user_clicks_on_time_complexity_of_data_structure() {
	   ds.Time_cmp();
	}

	@When("user clicks on Tryhere")
	public void user_clicks_on_tryhere() {
	    ds.Try_btn();
	}

	@When("user fill the Text area with Sheet_Name {string} and Row_Number {int}")
	public void user_fill_the_text_area_with_sheet_name_and_row_number(String Sheet_Name, Integer Row_Number) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheet_Name);
		testdata.get(Row_Number).get("TestCode");
		   String text = testdata.get(Row_Number).get("TestCode");
		  ds.fillTextArea(text);
	}

	@When("user clicks on Run")
	public void user_clicks_on_run() throws InterruptedException {
	     ds.click_Run();
	}

	@Then("user clicks output")
	public void user_clicks_output() {
	    ds.output();
	    ds.signout();
	}




}
