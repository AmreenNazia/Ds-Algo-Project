package pages;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

public class Treepage {
	
	

	
		private WebDriver driver;


		private By Getstarted_btn = By.xpath("//button[text()='Get Started']");
		private By signin_link = By.xpath("//a[@href='/login']");
		private By sign_username = By.id("id_username");
		private By sign_password = By.id("id_password");
		private By login_button = By.xpath("//input[@value='Login']");
		private By click_Tree = By.xpath("//a[@href='tree']");
		private By click_OvrwOfTrees  = By.xpath("//a[@href ='overview-of-trees']");
		private By click_Tryhere = By.xpath("//a[@href='/tryEditor']");
		private By click_Textarea = By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
		private By click_run = By.xpath("//button[text()='Run']");
		private By output_message = By.id("output");
		private By Terminologies  = By.xpath("//a[@href ='terminologies']");
		private By Types_of_trees  = By.xpath("//a[@href ='types-of-trees']");
		private By TreeTraversals = By.xpath("//a[@href='tree-traversals']");
		private By Travesals_illustration = By.xpath("//a[@href='traversals-illustration']");
		private By Binary_Tree = By.xpath("//a[@href='binary-trees']");
		private By Types_of_BinaryTrees = By.xpath("//a[@href='types-of-binary-trees']");
		private By Implementation_in_python = By.xpath("//a[@href='implementation-in-python']");
		private By Binary_tree_traversals = By.xpath("//a[@href='tree-traversals']");
		private By Implementation_of_Binary_Trees = By.xpath("//a[@href='implementation-of-binary-trees']");
		private By Applicaations_of_Binary_trees = By.xpath("//a[@href='applications-of-binary-trees']");
		private By Binary_Search_Trees = By.xpath("//a[@href='binary-search-trees']");
		private By Implementation_of_bst = By.xpath("//a[@href='implementation-of-bst']");
		private By sign_out = By.xpath("//a[@href='/logout']"); 


		public Treepage(WebDriver driver) {
			this.driver = driver;
		}

		 
		public void Getstarted() {

			driver.findElement(Getstarted_btn).click();
		}
		public void signin()
		{
			
			driver.findElement(signin_link).click();

		}
		public void Username_and_password() {
			driver.findElement(sign_username).sendKeys("Testadmin");
			driver.findElement(sign_password).sendKeys("Ninja@567");
		}

		public void login()
		{
			driver.findElement(login_button).click();

		}
		public void Tree() {

			driver.findElement(click_Tree).click();
		}
		public void click_0n_OverviewofTree() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(click_OvrwOfTrees).click();
		}
		public void click_Terminologies() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Terminologies).click();
		}
		public void click_TypesOfTrees() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Types_of_trees).click();
		}
		public void click_Tree_Traversals() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(TreeTraversals).click();
		}
		public void click_Traversals_illustration() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Travesals_illustration).click();
		}
		public void click_Binary_trees() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Binary_Tree).click();
		}
		public void click_TypesOfBinaryTrees() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Types_of_BinaryTrees).click();
		}
		public void click_ImplementationInPython() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Implementation_in_python).click();
		}
		public void click_BinaryTreeTraversals() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Binary_tree_traversals).click();
		}
		public void click_ImplementationOfBinaryTrees() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Implementation_of_Binary_Trees).click();
		}

		public void click_ApplicationOfBInaryTree() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Applicaations_of_Binary_trees).click();
		}
		public void click_BinarySearchTrees() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Binary_Search_Trees).click();
		}

		public void click_ImplementationOfBST() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(Implementation_of_bst).click();
		}

		public void click_on_Tryhere() {
			 
			driver.findElement(click_Tryhere).click();

		}
		public void click_on_Textarea() {
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
			try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alert = driver.switchTo().alert();
		        System.out.println(driver.switchTo().alert().getText());
		        alert.accept();
		    } catch (Exception e) {
		        System.out.println(driver.findElement(output_message).getText());
		    }
			 
			 
			 }
		public void signout()
		{
			driver.navigate().back();
			driver.findElement(sign_out).click();
		}
		         
		 
		}
			 
		


