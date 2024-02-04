package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.GraphPage;
import utility.ExcelReader;

public class Graph_Functionaliy {
	
	private GraphPage gp = new GraphPage(BaseTest.getDriver());

	@Given("user clicks the main getstarted button")
	public void user_clicks_the_main_getstarted_button() {
	     gp.startpage();
	}

	@Then("user clicks the signin button")
	public void user_clicks_the_signin_button() {
	    gp.signin();
	}

	@Then("user enter valid creditial")
	public void user_enter_valid_creditial() {
	   gp.username();
	   gp.password();
	}

	@Then("user click login and enter to the home page")
	public void user_click_login_and_enter_to_the_home_page() {
	     gp.login();
	}

	@Given("user select graph from the drop down")
	public void user_select_graph_from_the_drop_down() {
	    gp.selectgraphdrop();
	}

	@Then("user click Graph field")
	public void user_click_graph_field() {
	    gp.clickgrap();
	}

	@Then("user click tryhere button")
	public void user_click_tryhere_button() {
	     gp.clicktry();
	}

	@When("user fills the Text area using Sheet_Name {string} and Row_number {int}")
	public void user_fills_the_text_area_using_sheet_name_and_row_number(String Sheet_Name, Integer Row_number) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheet_Name);
		testdata.get(Row_number).get("TestCode");
		   String text = testdata.get(Row_number).get("TestCode");
		  gp.fillTextArea(text);
	}

	@Then("user click run button")
	public void user_click_run_button() throws InterruptedException {
	    gp.click_Run();
	}

	@Then("user get the output text")
	public void user_get_the_output_text() {
	     gp.output();
	}

	@Then("user click signout")
	public void user_click_signout() {
	     gp.signot();
	}

	@Then("user click Graph representation field")
	public void user_click_graph_representation_field() {
	    gp.clickgraphrep();
	}

	@When("user fill the Text area using Sheet_Name {string} and row_number {int}")
	public void user_fill_the_text_area_using_sheet_name_and_rownumber(String Sheet_Name, Integer row_number) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheet_Name);
		testdata.get(row_number).get("TestCode");
		   String text = testdata.get(row_number).get("TestCode");
		  gp.fillTextArea(text);
	}
}
