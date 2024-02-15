package StepDefinition;

 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driverfactory.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.Array;
import pages.RegisterPage;
import pages.Signin;
import utility.ExcelReader;

public class Array_functionality extends BaseTest{
	private WebDriver driver = getDriver();
	private RegisterPage register = new RegisterPage(BaseTest.getDriver());
	private Signin si = new Signin(BaseTest.getDriver());
	Array arr = new Array(BaseTest.getDriver());
	ExcelReader er = new ExcelReader();

@When("user enters <username> and <password>")
public void user_enters_username_and_password(DataTable credentials) throws InterruptedException {
	List<List<String>> data = credentials.cells();
	driver.findElement(By.id("id_username")).sendKeys(data.get(0).get(0));
	Thread.sleep(1000);
	driver.findElement(By.id("id_password")).sendKeys(data.get(0).get(1));
}

@Given("user is in the array page")
public void user_is_in_the_array_page() {
	arr.array_started();
}

@When("user clicks Arrays in python link")
public void user_clicks_arrays_in_python_link() {
	arr.array_in_python();
}

@Then("user clicks on practice questions")
public void user_clicks_on_practice_questions() {
	arr.practice_question_link();
}

@When("user clicks on search the array link and enters the python code with {string} and RowNumber {int}")
public void user_clicks_on_search_the_array_link_and_enters_the_python_code_with_and_row_number(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	ArrayList<String> list = new ArrayList<String>();
	if(SheetName.equals("Python Array"))
	{
		 
		List<Map<String,String>>testData = er.getData((System.getProperty("user.dir")+"/src/test/java/utility/python1.xlsx"), SheetName);
		 
		for(int i = 0 ; i < testData.size() ; i++)
		{
			String text = testData.get(i).get("Array program");
			list.add(text);	   
		}
		 

	}	
	arr.search_the_array(list);		
}

@Then("user clicks on run button and checks the output and clicks submit")
public void user_clicks_on_run_button_and_checks_the_output_and_clicks_submit() throws InterruptedException {
	Thread.sleep(500); 
	arr.practice_run();
//	Thread.sleep(1000);
	arr.practice_submit();
//	Thread.sleep(1000);
	arr.signout();
}

@When("user clicks on Max Consecutive Ones and enters the python code with {string} and RowNumber {int}")
public void user_clicks_on_max_consecutive_ones_and_enters_the_python_code_with_and_row_number(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	ArrayList<String> list = new ArrayList<String>();
	if(SheetName.equals("Python Array"))
	{
		 
		List<Map<String,String>>testData = er.getData((System.getProperty("user.dir")+"/src/test/java/utility/python1.xlsx"), SheetName);	
		 
		for(int i = 0 ; i < testData.size() ; i++)
		{
			String text = testData.get(i).get("Array program");
			list.add(text);	   
		}
		 
	}
	arr.max_consecutive_ones(list);
}

@When("user clicks on Even Number of Digits and enters the python code with {string} and RowNumber {int}")
public void user_clicks_on_even_number_of_digits_and_enters_the_python_code_with_and_row_number(String SheetName, Integer intRowNumber1) throws InvalidFormatException, IOException, InterruptedException {
	ArrayList<String> list = new ArrayList<String>();
	if(SheetName.equals("Python Array"))
	{
		 
		List<Map<String,String>>testData = er.getData((System.getProperty("user.dir")+"/src/test/java/utility/python1.xlsx"), SheetName);
		 
		for(int i = 0 ; i < testData.size() ; i++)
		{
			String text = testData.get(i).get("Array program");
			list.add(text);	   
		}
		 
	}
	arr.even_number_of_digits(list);
}

@When("user clicks on Squares of Sorted Array and user enters the python code with {string} and RowNumber {int}")
public void user_clicks_on_squares_of_sorted_array_and_user_enters_the_python_code_with_and_row_number(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	ArrayList<String> list = new ArrayList<String>();
	if(SheetName.equals("Python Array"))
	{
		 
		List<Map<String,String>>testData = er.getData((System.getProperty("user.dir")+"/src/test/java/utility/python1.xlsx") , SheetName);	
		 
		for(int i = 0 ; i < testData.size() ; i++)
		{
			String text = testData.get(i).get("Array program");
			list.add(text);	   
		}
	 
	}
	arr.squares_of_sorted_array(list);
}

@Then("the user clicks on try here button")
public void the_user_clicks_on_try_here_button() {
	arr.try_here_button();
}

@When("user is in texteditor and user enters the python code with {string} and RowNumber {int}")
public void user_is_in_texteditor_and_user_enters_the_python_code_with_and_row_number(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	 
	List<Map<String,String>>testData = er.getData((System.getProperty("user.dir")+"/src/test/java/utility/python1.xlsx"), SheetName);	
	String text = testData.get(RowNumber).get("Code");
	 
	arr.text_editor(text);
}
@When("user clicks on run to check the output")
public void user_clicks_on_run_to_check_the_output() {
	arr.run();
}

@Then("user clicks on signout")
public void user_clicks_on_signout() throws InterruptedException {
	 
	arr.signout();
}

@When("user clicks Arrays Using List link")
public void user_clicks_arrays_using_list_link() {
	arr.array_using_list();
}

@When("user clicks on Basic Operations in Lists link")
public void user_clicks_on_basic_operations_in_lists_link() {
	arr.basic_operations_in_list();
}

@When("user clicks on Applications of Array link")
public void user_clicks_on_applications_of_array_link() {
	arr.applications_of_array();}
}
