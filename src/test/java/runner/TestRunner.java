package runner;

 
 

import org.testng.annotations.AfterClass;

 
import org.testng.annotations.BeforeClass;
 
import org.testng.annotations.DataProvider;
 
import org.testng.annotations.Parameters;

import AppHooks.ApplicationHooks;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.ConfigReader;
 
@CucumberOptions(features={
		"src/test/resources/Feature/Graph.feature",
		"src/test/resources/Feature/Register.feature",
		"src/test/resources/Feature/In_register.feature",
		"src/test/resources/Feature/Signin.feature",
		"src/test/resources/Feature/In_Signin.feature",
		"src/test/resources/Feature/DataStructure.feature",
		"src/test/resources/Feature/Queue.feature",
		"src/test/resources/Feature/Linked_List.feature",
		"src/test/resources/Feature/stack.feature"
		 
		
		
		 },
			   
		  glue = {"StepDefinition","AppHooks"},
monochrome = true,
plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		 
"html:target/HtmlReport/htmlreport.html"}

		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	 
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	@BeforeClass
	@Parameters({ "browser" })
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);

	}
	
	@AfterClass
	 public void tear() {
		 ApplicationHooks.quitBrowser();
	 }
	 
		
	}

    

 




