package StepDefinition;

import java.io.IOException;

import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.QueuePage;
import utility.ExcelReader;
 

public class QueueFunctionality {
	
	
	private QueuePage qp = new QueuePage(BaseTest.getDriver());
	
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    qp.start();
	    qp.link();
	}

	@When("user submits login details")
	public void user_submits_login_details() {
	    qp.user();
	    qp.pass();
	}

	@Then("user navigate to the data structure page")
	public void user_navigate_to_the_data_structure_page() {
	    qp.log();
	}

	@Given("user click the GetStarted button and navigate to queue page")
	public void user_click_the_get_started_button_and_navigate_to_queue_page() {
	    qp.startpage();
	}

	@Then("user click the implimentation using list page")
	public void user_click_the_implimentation_using_list_page() {
	    qp.implimentpython();
	}

	@Then("user click the Tryhere")
	public void user_click_the_tryhere() throws InterruptedException {
	    qp.clicktryme();
	}

	@When("user has to fills the Text area with SheetName {string} and RowNumber {int}")
	public void user_has_to_fills_the_text_area_with_sheet_name_and_row_number(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData("/Users/amreennaziasyed/eclipse-workspace/DSALGO/ds-algo/src/test/java/utility/python.xlsx", SheetName);
		testdata.get(RowNumber).get("TestCode");
		String text = testdata.get(RowNumber).get("TestCode");
		 System.out.println(text);
		  qp.fillcode(text);
	}

	@Then("user get the output")
	public void user_get_the_output() {
	     qp.getoutput();
	}

	@Then("user navigate back and click signout")
	public void user_navigate_back_and_click_signout() throws InterruptedException {
	    qp.signoutclick();
	}

	@Then("user click the implimentation using collection queue page")
	public void user_click_the_implimentation_using_collection_queue_page() {
	    qp.implimentpython();
	}

	@When("user fill Text area with Sheet_Name {string} and RowNumber {int}")
	public void user_fill_text_area_with_sheet_name_and_row_number(String Sheet_Name, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData("/Users/amreennaziasyed/eclipse-workspace/DSALGO/ds-algo/src/test/java/utility/python.xlsx", Sheet_Name);
		testdata.get(RowNumber).get("TestCode");
		String text = testdata.get(RowNumber).get("TestCode");
		 System.out.println(text);
		  qp.fillcode(text);
	}

	@Then("user click the implimentation using array")
	public void user_click_the_implimentation_using_array() {
	     qp.implementarray();
	}

	@When("user fills the Text area using SheetName {string} and Row_Number {int}")
	public void user_fills_the_text_area_using_sheet_name_and_row_number(String SheetName, Integer Row_Number) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData("/Users/amreennaziasyed/eclipse-workspace/DSALGO/ds-algo/src/test/java/utility/python.xlsx", SheetName);
		testdata.get(Row_Number).get("TestCode");
		String text = testdata.get(Row_Number).get("TestCode");
		 System.out.println(text);
		  qp.fillcode(text);
	}

	@Then("user click the implimentation using Queue operations")
	public void user_click_the_implimentation_using_queue_operations() {
	    qp.queueope();
	}
	@When("user fill the Text area with using Sheet_Name {string} and Row_Number {int}")
	public void user_fill_the_text_area_with_using_sheet_name_and_row_number(String Sheet_Name, Integer Row_Number) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData("/Users/amreennaziasyed/eclipse-workspace/DSALGO/ds-algo/src/test/java/utility/python.xlsx", Sheet_Name);
		testdata.get(Row_Number).get("TestCode");
		String text = testdata.get(Row_Number).get("TestCode");
		 System.out.println(text);
		  qp.fillcode(text);
	}



}
