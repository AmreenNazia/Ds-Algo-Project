package Parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import AppHooks.ApplicationHooks;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.ConfigReader;

public class parallel {
	
	@CucumberOptions(features={"src/test/resources/Feature/Tree.feature",
			"src/test/resources/Feature/Tree_2.feature"
			
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
		public void teardown() {
			ApplicationHooks.quitBrowser();
		}
		 
		 
			
		}

	    

	}

 
