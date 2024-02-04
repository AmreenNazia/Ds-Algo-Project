package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.stack;
import utility.ExcelReader;

public class stack_Functionality {
	
	private stack st = new stack(BaseTest.getDriver());
	@Given("user is in stack page after logged in")
	public void user_is_in_stack_page_after_logged_in() {
	    st.Getstarted_btn_stack();
	}

	@When("user clicks on operations in stack of stack")
	public void user_clicks_on_operations_in_stack_of_stack() {
	     st.Oprtn_In_Stack();
	}

	@When("user click on Tryhere Link")
	public void user_click_on_tryhere_link() {
	   st.Try_btn();
	}

	@When("user fills the Text area with Sheet_Name {string} and Row_Number {int}")
	public void user_fills_the_text_area_with_sheet_name_and_row_number(String Sheet_Name, Integer Row_Number) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheet_Name);
		testdata.get(Row_Number).get("TestCode");
		   String text = testdata.get(Row_Number).get("TestCode");
		  st.fillTextArea(text);
	}

	@When("user clicks on_Run")
	public void user_clicks_on_run() throws InterruptedException {
	     st.click_run();
	}

	@Then("user clicks out_put")
	public void user_clicks_out_put() {
	    st.output();
	    st.signout();
	}

	@When("user clicks on Implementation of stack")
	public void user_clicks_on_implementation_of_stack() {
	    st.Implementation_btn();
	}

	@When("user fills  Text area with Sheet_Name {string} and RowNumber {int}")
	public void user_fills_text_area_with_sheet_name_and_row_number(String Sheet_Name, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheet_Name);
		testdata.get(RowNumber).get("TestCode");
		   String text = testdata.get(RowNumber).get("TestCode");
		  st.fillTextArea(text);
	}

	@When("user clicks on Applications of stack")
	public void user_clicks_on_applications_of_stack() {
	    st.Application_btn();
	}

	@When("user fill the Text area with SheetName {string} and Row_Number {int}")
	public void user_fill_the_text_area_with_sheet_name_and_row_number(String SheetName, Integer Row_Number) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), SheetName);
		testdata.get(Row_Number).get("TestCode");
		   String text = testdata.get(Row_Number).get("TestCode");
		  st.fillTextArea(text);
	     
	}



}
