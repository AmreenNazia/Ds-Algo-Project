package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueuePage {
	public  WebDriver driver;
	
    By GetStarted =By.xpath("//button[text()='Get Started']");
 	
 	By signin_link = By.xpath("//a[text()='Sign in']");
 	By sign_username = By.id("id_username");
	By sign_password = By.id("id_password");
	By login_button = By.xpath("//input[@value='Login']");
	
 	By Queuestart=By.xpath("(//a[text()='Get Started'])[5]");
 	By click1=By.xpath("//a[text()='Implementation of Queue in Python']");
 	By Tryme=By.xpath("//a[@class='btn btn-info']");
 	By messagebox= By.xpath("(//textarea)[2]");
//	By messagebox=By.xpath("//div[@role='presentation']"); 	
 	By run=By.xpath("//button[@type='button']");
	By otp=By.xpath("//pre[@id='output']");
	By signout=By.xpath("//a[text()='Sign out']");
	By click2=By.xpath("//a[text()='Implementation using collections.deque']");
	By click3=By.xpath("//a[text()='Implementation using array']");
	By click4=By.xpath("//a[text()='Queue Operations']");
	private By click_Textarea = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[4]");
	//*[@id="answer_form"]/div/div/div[1]/textarea
	
	
	public QueuePage(WebDriver driver)
	{
		this.driver = driver;
	
	}

	
public void start() {
	
	driver.findElement(GetStarted).click();	
		
	}
public void link() {
		
	
	driver.findElement(signin_link).click();
		
	}


	
public void user() {
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
driver.findElement(sign_username).sendKeys("Testadmin");
	
	
}
	
public void pass() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(sign_password).sendKeys("Ninja@567");
	
	
}

public void log() {
	
	driver.findElement(login_button).click();
}	


public void startpage() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(Queuestart).click();
	
}

public void implimentpython() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(click1).click();
		
	}



public void implimentcollection()


{

driver.findElement(click2).click();

}

public void implementarray()


{

driver.findElement(click3).click();

}

public void queueope()
{
	
driver.findElement(click4).click();

}


public void clicktryme() throws InterruptedException {
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	Thread.sleep(3000);
		driver.findElement(Tryme).click();
		
}

public void click_on_Textarea() throws InterruptedException {
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	Thread.sleep(3000);
	driver.findElement(messagebox).click();
}
	

	
public void fillcode(String text) throws InterruptedException  {
	Thread.sleep(2000);
	 
    driver.findElement(messagebox).sendKeys(text);
  
    
	
}

	
	
	public void run_click(){


  driver.findElement(run).click();

  }



public void getoutput() {
	
	
	
	
	try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alert.accept();
    } catch (Exception e) {
        System.out.println(driver.findElement(otp).getText());
    }
	
}

public void signoutclick() throws InterruptedException

{
	
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(signout).click();
	

}





}













	
	














	
	
	
	
	
	
	
	
	
	
	
	
	
	
	










	




