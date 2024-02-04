package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Driverfactory.BaseTest;
import io.cucumber.java.en.*;
import pages.Treepage;
import utility.ExcelReader;

public class TreeFunctionality {
	
	private Treepage tree = new Treepage(BaseTest.getDriver());
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
	   tree.Getstarted();
	   tree.signin();
	}

	@When("user submits login credentials")
	public void user_submits_login_credentials() {
		tree.Username_and_password();
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
	    tree.login();
	}

	@Given("user is in Tree page after logged in")
	public void user_is_in_tree_page_after_logged_in() {
	    tree.Tree();
	}

	@When("user clicks on  Overview of Tree")
	public void user_clicks_on_overview_of_tree() {
	    tree.click_0n_OverviewofTree();
	}

	@When("user click on Tryhere")
	public void user_click_on_tryhere() {
	    tree.click_on_Tryhere();
	}

	@When("user fills the Text area with SheetName {string} and Rownumber {int}")
	public void user_fills_the_text_area_with_sheet_name_and_rownumber(String SheetName, Integer Rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), SheetName);
		testdata.get(Rownumber).get("TestCode");
		   String text = testdata.get(Rownumber).get("TestCode");
		  tree.fillTextArea(text);
	}

	@When("user click on Run")
	public void user_click_on_run() throws InterruptedException {
	    tree.click_Run();
	    tree.output();
	}

	@Then("user clicks signout")
	public void user_clicks_signout() {
	    tree.signout();
	}

	@When("user clicks on  Terminologies")
	public void user_clicks_on_terminologies() {
	    tree.click_Terminologies();
	}

	@When("user sends Text area with Sheetname {string} and RowNumber {int}")
	public void user_sends_text_area_with_sheetname_and_row_number(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata =reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheetname);
		testdata.get(RowNumber).get("TestCode");
		   String text = testdata.get(RowNumber).get("TestCode");
		  tree.fillTextArea(text);
	}

	@When("user clicks on  Types of Trees")
	public void user_clicks_on_types_of_trees() {
	    tree.click_TypesOfTrees();
	}

	@When("user fills the with SheetName {string} and RowNUmber {int}")
	public void user_fills_the_with_sheet_name_and_row_n_umber(String SheetName, Integer RowNUmber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), SheetName);
		testdata.get(RowNUmber).get("TestCode");
		   String text = testdata.get(RowNUmber).get("TestCode");
		  tree.fillTextArea(text);
	}

	@When("user clicks on  Traversals-Illustration")
	public void user_clicks_on_traversals_illustration() {
	    tree.click_Traversals_illustration();
	}

	@When("user fills the Text area with sheetname {string} and RowNumber {int}")
	public void user_fills_the_text_area_with_sheetname_and_row_number(String sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), sheetname);
		testdata.get(RowNumber).get("TestCode");
		   String text = testdata.get(RowNumber).get("TestCode");
		  tree.fillTextArea(text);
	}

	@When("user clicks on  Binary Tree")
	public void user_clicks_on_binary_tree() {
	   tree.click_Binary_trees();
	}

	@When("user fills the Text area with Sheet_names {string} and RowNumber {int}")
	public void user_fills_the_text_area_with_sheet_names_and_row_number(String Sheet_names, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), Sheet_names);
		testdata.get(RowNumber).get("TestCode");
		   String text = testdata.get(RowNumber).get("TestCode");
		  tree.fillTextArea(text);
	}

	@When("user clicks on  Types of Binary Tree")
	public void user_clicks_on_types_of_binary_tree() {
	    tree.click_TypesOfBinaryTrees();
	}

	@When("user fills the Text area with SheetNAME {string} and RowNumber {int}")
	public void user_fills_the_text_area_with_sheet_name_and_row_number(String SheetNAME, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData((System.getProperty("user.dir")+"/src/test/java/utility/python.xlsx"), SheetNAME);
		testdata.get(RowNumber).get("TestCode");
		   String text = testdata.get(RowNumber).get("TestCode");
		  tree.fillTextArea(text);
	}
	@When("user clicks on  Implementation in python")
	public void user_clicks_on_implementation_in_python() {
	   tree.click_ImplementationInPython();
	}

	@When("user clicks on  Binary Tree Traversals")
	public void user_clicks_on_binary_tree_traversals() {
	    tree.click_BinaryTreeTraversals();
	}

	@When("user clicks on  Implementation of Binary Trees")
	public void user_clicks_on_implementation_of_binary_trees() {
	    tree.click_ImplementationOfBinaryTrees();
	}

	@When("user clicks on  Application of Binary Trees")
	public void user_clicks_on_application_of_binary_trees() {
	    tree.click_ApplicationOfBInaryTree();
	}

	@When("user clicks on Binary Search tree")
	public void user_clicks_on_binary_search_tree() {
	    tree.click_BinarySearchTrees();
	}

	@When("user clicks on implementation of BST")
	public void user_clicks_on_implementation_of_bst() {
	    tree.click_ImplementationOfBST();
	}




}
