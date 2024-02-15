package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class stack {
	 
	private WebDriver driver;
	By Getstarted_btn_main = By.xpath("//button[text()='Get Started']");
	By signin_link1 = By.xpath("//a[text()='Sign in']");
	By sign_username1 = By.id("id_username");
	By sign_password1 = By.id("id_password");
	By login_button1 = By.xpath("//input[@value='Login']");
	By Getstarted_btn_stack = By.xpath("//a[@href=\"stack\"]");
	By Oprtn_In_Stack = By.xpath("//a[@href=\"operations-in-stack\"]");
	By Try_btn = By.xpath("//a[@href=\"/tryEditor\"]");
	 
	private By click_Textarea = By.xpath("(//textarea)[2]");
	private By click_run = By.xpath("//button[text()='Run']");
	By Output_msg = By.id("output");
	By Implementation_btn = By.xpath("//a[@href='implementation']");
	By Application_btn = By.xpath("//a[text()='Applications']");
	By sign_out = By.xpath("//div[@class=\"navbar-nav\"]/ul/a[3]");
	
	
	
	public stack(WebDriver driver){
	this.driver = driver;
	}
	public void Getstarted_btn_main() {
		Actions action = new Actions(driver);
		 JavascriptExecutor js	 = (JavascriptExecutor) driver;
		 WebElement first_item = new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get Started']")));
			js.executeScript("arguments[0].scrollIntoView(true);", first_item);
			action.moveToElement(first_item).click().perform();
			
	}

	public void signin() throws InterruptedException
	{

	driver.findElement(signin_link1).click();
	}
	public void User_Password(){
	driver.findElement(sign_username1).sendKeys("Testadmin");
	driver.findElement(sign_password1).sendKeys("Ninja@567");
	}

	public void login(){
	driver.findElement(login_button1).click();
	}
	public void Getstarted_btn_stack() {

	driver.findElement(Getstarted_btn_stack).click();

	}
	public void Oprtn_In_Stack()
	{
	driver.findElement(Oprtn_In_Stack).click();
	}
	public void Implementation_btn() {
	driver.findElement(Implementation_btn).click();
	}
	public void Application_btn() {
	driver.findElement(Application_btn).click();
	}

	public void Try_btn()
	{
	driver.findElement(Try_btn).click();
	}

	public void click_Textarea() throws InterruptedException {
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(click_Textarea).click();
	}
	public void fillTextArea(String text) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(click_Textarea).sendKeys(text);

	}
	public void click_run() throws InterruptedException {

	driver.findElement(click_run).click();
	}
	public void output() {
	try {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	wait.until(ExpectedConditions.alertIsPresent());

	Alert alert = driver.switchTo().alert();

	System.out.println(driver.switchTo().alert().getText());

	alert.accept();

	} catch (Exception e) {

	System.out.println(driver.findElement(Output_msg).getText());
	}
	
	 

	}
	public void signout() {
	driver.navigate().back();
	driver.findElement(sign_out).click();
	}
	}


 
