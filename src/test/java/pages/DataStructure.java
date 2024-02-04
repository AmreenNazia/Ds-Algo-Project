package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class DataStructure {
	By Getstarted_btn_main = By.xpath("//button[text()='Get Started']");
	By signin_link1 = By.xpath("//a[text()='Sign in']");
	By sign_username1 = By.name("username");
	By sign_password1 = By.name("password");
	By login_button1 = By.xpath("//input[@value='Login']");
	By Getstarted_btn_DataStrctr = By.xpath("//a[@href='data-structures-introduction']");
	By Time_cmp = By.xpath("//a[@href='time-complexity']");
	By Try_btn = By.xpath("//a[@href=\"/tryEditor\"]");
	By Text_Area = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]");
	By Run_Btn = By.xpath("//button[text()='Run']");
	private By click_Textarea = By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	private By click_run = By.xpath("//button[text()='Run']");
	private By output_message = By.id("output");
	private By sign_out = By.xpath("//a[@href='/logout']"); 


	private WebDriver driver;


	public DataStructure(WebDriver driver) {
	this.driver = driver;
	}


	public void GetStarted_Main() {

	driver.findElement(Getstarted_btn_main).click();
	}

	public void  signin() throws InterruptedException
	{

	driver.findElement(signin_link1).click();

	} 
	public void  User_Password(){
	driver.findElement(sign_username1).sendKeys("Testadmin");
	driver.findElement(sign_password1).sendKeys("Ninja@567");

	}
	public void login()
	{
	driver.findElement(login_button1).click();

	}
	public void Getstarted_btn_DataStrctr()
	{
	driver.findElement(Getstarted_btn_DataStrctr).click();

	    }

	public void Time_cmp()
	{
	driver.findElement(Time_cmp).click();


	}
	public  void Try_btn()
	{
	driver.findElement(Try_btn).click();

	}
	public void Text_Area() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(click_Textarea).click();

	}
	public void fillTextArea(String text)   {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));  
	driver.findElement(click_Textarea).sendKeys(text);

	}
	public void click_Run() throws InterruptedException  {

	driver.findElement(click_run).click();

	}
	public void output() {
		 String message;
		try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        System.out.println(driver.switchTo().alert().getText());
	        alert.accept();
	    } catch (Exception e) {
	         message = driver.findElement(output_message).getText();
	         System.out.println("The output is :" +message);
	    }
		 
		 
		 }
	public void signout()
	{
		driver.navigate().back();
		driver.findElement(sign_out).click();
	}
	}


 
