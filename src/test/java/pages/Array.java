package pages;

import java.time.Duration;

import java.util.ArrayList;

import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Array 
{
	private WebDriver driver;

	By Getstarted_btn = By.xpath("//button[text()='Get Started']");
	private By array_get_started = By.xpath("//a[@href='array']");
	private By Array_link1 = By.xpath("//a[text()='Arrays in Python']");
	private By run_button = By.xpath("//button[text()='Run']");
	private By signout_button = By.xpath("//a[text()='Sign out']");
	private By output = By.xpath("//pre[@id='output']");
	private By Array_link2 = By.xpath("//a[text()='Arrays Using List']");
	private By Array_link3 = By.xpath("//a[text()='Basic Operations in Lists']");
	private By Array_link4 = By.xpath("//a[text()='Applications of Array']");
	private By prac_questions = By.xpath("//a[text()='Practice Questions']");
	private By search_array = By.xpath("//a[text()='Search the array']");
	private By max_consecutive = By.xpath("//a[text()='Max Consecutive Ones']");
	private By find_even_digits = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	private By sorted_array = By.xpath("//a[text()='Squares of  a Sorted Array']");
	private By practice_run_button = By.xpath("//button[text()='Run']");
	private By practice_submit_button = By.xpath("//input[@class='button']");
	private By practice_output = By.xpath("//pre[@id='output']/..");
	private By try_here = By.xpath("//a[text()='Try here>>>']");
	private By text_area = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[4]");

	public Array(WebDriver driver)
	{
		this.driver = driver;
	}

	public void array_started()
	{
		driver.findElement(array_get_started).click();
	}
	public void array_in_python()
	{
		driver.findElement(Array_link1).click();
	}
	public void array_using_list()
	{
		driver.findElement(Array_link2).click();
	}
	public void basic_operations_in_list()
	{
		driver.findElement(Array_link3).click();
	}
	public void applications_of_array()
	{
		driver.findElement(Array_link4).click();
	}
	public void try_here_button()
	{	
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		WebElement try_button = driver.findElement(By.xpath("//a[text()='Try here>>>']"));
		action.moveToElement(try_button).click().perform();
	}
	public void text_editor(String text)
	{
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		WebElement text_area = driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[4]"));
		action.moveToElement(text_area).click().sendKeys(text).perform();	
	}
	public void TextIndentation(WebDriver driver, WebElement pythonElement, int row, int space,boolean flag)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions action = new Actions(driver);
		// Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		for(int i=1;i<=row;i++) 
		{
			action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
			if(i==6)
			{
				action.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).perform();
			} 
			if(i==7)
			{
				action.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).perform();
			} 
			 
			for(int j=1;j<=space;j++) 
			{
				if(i==1 && flag) 
				{
					action.sendKeys(Keys.BACK_SPACE).perform();
				}

				else 
				{
					action.sendKeys(Keys.DELETE).perform();
				}
			}
		}
	}

	public void run()
	{
	 
		driver.findElement(run_button).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try
		{
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			wait.until(ExpectedConditions.alertIsPresent());
			String alert_text = alert.getText();
			System.out.println("The alert message is: "+alert_text);
			alert.accept();
		}
		catch(TimeoutException eTO)
		{
			String output1 = driver.findElement(output).getText();
			System.out.println("The output is: "+output1);
		}
	}
	public void practice_question_link()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(prac_questions).click();
	}
	public void search_the_array(ArrayList<String> list) throws InterruptedException
	{
		 
		driver.findElement(search_array).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		 
		WebElement text_area = driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea"));

		action.moveToElement(text_area).click();
		text_area.sendKeys(Keys.COMMAND + "a");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		text_area.sendKeys(Keys.DELETE);
		for (String s : list)
		{
			String listString = s + "\n";
			action.sendKeys(listString).perform();

		}	
		Array a = new Array(driver);
		a.TextIndentation(driver, text_area, 6, 6, true);
	}

	public void practice_run()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(practice_run_button).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try
		{
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			wait.until(ExpectedConditions.alertIsPresent());
			String alert_text = alert.getText();
			System.out.println("The alert message is: "+alert_text);
			alert.accept();
		}
		catch(TimeoutException eTO)
		{
			System.out.println("The output is: "+driver.findElement(practice_output).getText());
		}
	}
	public void practice_submit() throws InterruptedException
	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(practice_submit_button).sendKeys(Keys.RETURN);
		Thread.sleep(1000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expected = "Error occurred during submission";
		String expected1 = " Some Tests failed. Please review code";
		String expected2 = " No tests were collected";
		String actual = driver.findElement(practice_output).getText();
		System.out.println("The actual message: "+actual);

		boolean result = actual.equals(expected) || actual.equals(expected1) || actual.equals(expected2);
		try 
		{
			Assert.assertTrue(result);
			System.out.println("The boolean value is true & Verification pass");
		} 
		catch (AssertionError e) 
		{
			System.out.println("The boolean vallue is false");
			throw e;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
	}
	public void max_consecutive_ones(ArrayList<String> list)
	{
		 
		driver.findElement(max_consecutive).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		 
		 
		WebElement text_area = driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea"));
		action.moveToElement(text_area).click();
		text_area.sendKeys(Keys.COMMAND + "a");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		text_area.sendKeys(Keys.DELETE);
		for (String s : list)
		{
			String listString = s + "\n";
			action.sendKeys(listString).perform();

		}	
		Array a = new Array(driver);
		a.TextIndentation(driver, text_area, 6, 6, true);
	}
	public void even_number_of_digits(ArrayList<String> list)
	{
		 
		driver.findElement(find_even_digits).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		 
		 
		WebElement text_area = driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea"));
		action.moveToElement(text_area).click();
		text_area.sendKeys(Keys.COMMAND + "a");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		text_area.sendKeys(Keys.DELETE);
		for (String s : list)
		{
			String listString = s + "\n";
			action.sendKeys(listString).perform();

		}	
		Array a = new Array(driver);
		a.TextIndentation(driver, text_area, 6, 6, true);
	}
	public void squares_of_sorted_array(ArrayList<String> list) throws InterruptedException
	{
		 
		driver.findElement(sorted_array).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	 
		Actions action = new Actions(driver);
		 
		 
		WebElement text_area = driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea"));
		action.moveToElement(text_area).click();
		text_area.sendKeys(Keys.COMMAND + "a");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		text_area.sendKeys(Keys.DELETE);
		for (String s : list)
		{
			String listString = s + "\n";
			action.sendKeys(listString).perform();

		}	
		Array a = new Array(driver);
		a.TextIndentation(driver, text_area, 6, 6, true);
	}
	public void signout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.navigate().back();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(signout_button).click();
	}
}