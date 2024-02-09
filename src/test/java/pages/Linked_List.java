package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linked_List
{
	private WebDriver driver;

	By Getstarted_btn = By.xpath("//button[text()='Get Started']");
	private By linkedlist_get_started = By.xpath("//a[@href='linked-list']");
	By login_button = By.xpath("//input[@type='submit']");
	private By introduction = By.xpath("//a[@href='introduction']");
	private By practice_questions = By.xpath("//a[text()='Practice Questions']");
	private By try_here_button = By.xpath("//a[text()='Try here>>>']");
	private By run_button = By.xpath("//button[text()='Run']");
	private By llist_output = By.xpath("//pre[@id='output']/..");
	private By creating_linked_list = By.xpath("//a[@href='creating-linked-list']");
	private By types_of_llist = By.xpath("//a[@href='types-of-linked-list']");
	private By linkedlist_in_python = By.xpath("//a[@href='implement-linked-list-in-python']");
	private By traversal = By.xpath("//a[@href='traversal']");
	private By insertion = By.xpath("//a[@href='insertion-in-linked-list']");
	private By deletion = By.xpath("//a[@href='deletion-in-linked-list']");

	private By llist_signout = By.xpath("//a[text()='Sign out']");

	public Linked_List(WebDriver driver)
	{	
		this.driver = driver;
	}
	public void credential_login_button()
	{	
		 
		driver.findElement(login_button).click();
	}
	public void linkedlist_started()
	{
		driver.findElement(linkedlist_get_started).click();
	}
	public void linked_list_introduction()
	{
		driver.findElement(introduction).click();
	}
	public void practice_questions_link()
	{
		driver.findElement(practice_questions).click();
	}
	public void linkedlist_try_here_button()
	{
		driver.findElement(try_here_button).click();
	}
	public void linkedlist_text_editor(String text)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		WebElement text_area = driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]"));
		action.moveToElement(text_area).click().sendKeys(text).perform();	
	}
	public void editor_run_button()
	{
		driver.findElement(run_button).click();
	}
	public void list_output()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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
			String output1 = driver.findElement(llist_output).getText();
			System.out.println("The output is: "+output1);
		}
	}
	public void creating_linkedlist()
	{
		driver.findElement(creating_linked_list).click();
	}
	public void types_of_linkedlist()
	{
		driver.findElement(types_of_llist).click();
	}
	public void implement_llist_in_python()
	{
		driver.findElement(linkedlist_in_python).click();
	}
	public void llist_traversal()
	{
		driver.findElement(traversal).click();
	}
	public void llist_insertion()
	{
		driver.findElement(insertion).click();
	}
	public void llist_deletion()
	{
		driver.findElement(deletion).click();
	}
	public void signout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(llist_signout).click();
	}

}
