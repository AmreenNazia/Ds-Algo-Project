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

public class GraphPage {

public WebDriver driver;


	By GetStartedbutton =By.xpath("//button[text()='Get Started']");
	 	
	 	By clicksigin= By.xpath("//a[text()='Sign in']");
	 	By signusername = By.id("id_username");
		By signpassword = By.id("id_password");
		By loginbutton = By.xpath("//input[@value='Login']");
		By clickdropdown =By.xpath("//a[text()='Data Structures']");
		By selectgraph=By.xpath("(//a[@class='dropdown-item'])[6]");
		By clickgraph=By.xpath("(//a[text()='Graph'])[2]");
		By clicktryhere=By.xpath("//a[@href='/tryEditor']");
		By clickgraphrep=By.xpath("//a[text()='Graph Representations']");
		By textbox= By.xpath("(//textarea)[2]");
		By runby=By.xpath("//button[@type='button']");
		By output=By.xpath("//pre[@id='output']");
		By signoutbutton=By.xpath("//a[text()='Sign out']");
		private By click_Textarea = By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
		
		
		public GraphPage(WebDriver driver) {


			   this.driver=driver;
			   
		   }

		
		 public void startpage() {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			 Actions action = new Actions(driver);
			 JavascriptExecutor js	 = (JavascriptExecutor) driver;
			 WebElement first_item = new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get Started']")));
				js.executeScript("arguments[0].scrollIntoView(true);", first_item);
				action.moveToElement(first_item).click().perform();
				
			}
		public void signin() {
				
			
			driver.findElement(clicksigin).click();
				
			}


			
		public void username() {
			
		
		driver.findElement(signusername).sendKeys("Testadmin");
			
			
		}
			
		public void password() {
			

			driver.findElement(signpassword).sendKeys("Ninja@567");
			
			
		}

		public void login() {
			
			driver.findElement(loginbutton).click();
		}	


public void selectgraphdrop()
{
	
	driver.findElement(clickdropdown).click();
	driver.findElement(selectgraph).click();
	
}



public void clickgrap() {
	driver.findElement(clickgraph).click();


}



public void clicktry() {
	
		driver.findElement(clicktryhere).click();


	}


public void clickgraphrep() {
	
driver.findElement(clickgraphrep).click();
}


public void textbox() throws InterruptedException {
	 
	driver.findElement(textbox).click();
}

 
 
public void fillTextArea(String text) throws InterruptedException   {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
	 
	driver.findElement(textbox).sendKeys(text);

}
public void click_Run() throws InterruptedException  {
	  
	driver.findElement(runby).click();
	 
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
         message = driver.findElement(output).getText();
         System.out.println("The output is :" +message);
    }
	 
	 
	 }
public void back() {
	driver.navigate().back();
	driver.navigate().back();
}
	


	

	






public void signot() {
	
	
	driver.navigate().back();
	driver.findElement(signoutbutton).click();
	
}








}





















