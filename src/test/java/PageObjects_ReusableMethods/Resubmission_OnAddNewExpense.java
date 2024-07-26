package PageObjects_ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestCases.BaseClass;

public class Resubmission_OnAddNewExpense extends BaseClass{
	
	
	@Test
	public void Resubmission_On_Add_New_Expense() throws IOException, InterruptedException {
		
		
		

		By ItemsPerPageDropdown = By.xpath("//span[@class='e-input-group-icon e-ddl-icon e-search-icon']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ItemsPerPageDropdown)).click();
		System.out.println("Successfully clicked on the Items per page dropdown of the Employers page");



		By ItemsPerPageValueSelect = By.xpath("//li[@data-value='100']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ItemsPerPageValueSelect)).click();
		System.out.println("Successfully selected the Items per page value of the Employers page");


		By EmployersPageSearchBar = By.xpath("//input[@name='searchText']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployersPageSearchBar)).sendKeys("Bright Expense AVD_08.11.2023");
		System.out.println("Successfully passed value in the search bar on the Employers page");



		By EmployersPageSearchIcon = By.xpath("//a[@class='e-input-group-icon e-icons e-search']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployersPageSearchIcon)).click();
		System.out.println("Successfully clicked on the search icon on the Employers page");


		By EmployersPageSearchClose = By.xpath("//span[@class='e-input-group-icon e-icons e-close ng-star-inserted']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployersPageSearchClose)).click();
		System.out.println("Successfully clicked on the search cross icon on the Employers page");

		By EmployerNameClick = By.xpath("//a[contains(text(),' Bright Expense_16.02.2024 ')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployerNameClick)).click();
		System.out.println("Successfully clicked on the name of an Employer");


		//Employers page


		Thread.sleep(4000);	


		WebElement ExpenseSubmissionsPageSearchBar = driver.findElement(By.xpath("//input[@name='searchText']"));
		ExpenseSubmissionsPageSearchBar.sendKeys("Submitted");
		System.out.println("Successfully passed value in the search bar on the Expense Submissions page");


		Thread.sleep(4000);


		WebElement ExpenseSubmissionsPageSearchIcon = driver.findElement(By.xpath("//a[@class='e-input-group-icon e-icons e-search']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ExpenseSubmissionsPageSearchIcon).perform();
		ExpenseSubmissionsPageSearchIcon.click();
		System.out.println("Successfully clicked on the search icon on the Expense Submissions page");



		Thread.sleep(3000);
		
		
		WebElement ExpenseSubmissionRecord = driver.findElement(By.xpath("(//a[@class='hyperText ng-star-inserted'])[1]"));
		actions.moveToElement(ExpenseSubmissionRecord).perform();
		ExpenseSubmissionRecord.click();
		System.out.println("Successfully clicked on the hyperlink of an Expense Submission record");
		
		
		//Expense Submissions page
		
		Thread.sleep(3000);
		
		String ExpensePageHeader = driver.findElement(By.xpath("//h1[@class='m-0']")).getText();
		String SubmissionReferenceNumber = ExpensePageHeader.replaceAll("[^0-9]", " ");
		System.out.println("Submission Reference number is: "+SubmissionReferenceNumber.trim());
		
		
		
		//Add Expense
		
		WebElement AddExpenseButton = driver.findElement(By.xpath("//span[text()=' Expense']"));
		actions.moveToElement(AddExpenseButton).perform();
		AddExpenseButton.click();
		System.out.println("Successfully clicked on the Add Expense button");
		
		
		Thread.sleep(4000);
		
		
		WebElement EmployeeCheckbox = driver.findElement(By.xpath("//input[@id='Saby O SULLIVAN']"));
		EmployeeCheckbox.click();
		
		System.out.println("Successfully checked the checkbox of an Employee");
		

		Thread.sleep(4000);
		WebElement ExpenseDatePopUp1 = driver.findElement(By.xpath("//input[@id='formColExpenseDate_input']"));
		String ExpenseDateValuePopUp1 = ExpenseDatePopUp1.getAttribute("value");

		if(ExpenseDateValuePopUp1 != null) {
			int ExpenseDateValLenPopUp1 = ExpenseDateValuePopUp1.length();

			for(int i =0; i < ExpenseDateValLenPopUp1; i++) {
				ExpenseDatePopUp1.sendKeys(Keys.BACK_SPACE);
			}ExpenseDatePopUp1.sendKeys("10/02/2024");
		}
		System.out.println("Successfully passed value in the Expense Date textbox of the Add Expense pop-up");



		Thread.sleep(3000);
		WebElement ExpenseCategoryDropdown = driver.findElement(By.id("formColCategory"));
		actions.moveToElement(ExpenseCategoryDropdown).perform();
		ExpenseCategoryDropdown.click();
		System.out.println("Successfully clicked on the Expense Category dropdown of the Add Expense pop-up");



		Thread.sleep(3000);
		WebElement ExpenseCategoryValuePass_TravelAndSubsistence = driver.findElement(By.xpath("//li[contains(text(),'Travel')]"));
		actions.moveToElement(ExpenseCategoryValuePass_TravelAndSubsistence).perform();
		ExpenseCategoryValuePass_TravelAndSubsistence.click();
		System.out.println("Successfully passed a value on the Expense Category dropdown of the Add Expense pop-up");


		Thread.sleep(3000);
		WebElement ExpenseSubCategoryDropdown = driver.findElement(By.id("formColSubCategory"));
		actions.moveToElement(ExpenseSubCategoryDropdown).perform();
		ExpenseSubCategoryDropdown.click();
		System.out.println("Successfully clicked on the Expense Sub Category dropdown of the Add Expense pop-up");



		Thread.sleep(3000);
		WebElement ExpenseSubCategoryValuePass_EmergencyTravel = driver.findElement(By.xpath("//li[contains(text(),'Emergency Travel')]"));
		actions.moveToElement(ExpenseSubCategoryValuePass_EmergencyTravel).perform();
		ExpenseSubCategoryValuePass_EmergencyTravel.click();
		System.out.println("Successfully passed a value on the Expense Sub Category dropdown of the Add Expense pop-up");



		Thread.sleep(1000);
		WebElement Amount = driver.findElement(By.xpath("//input[@formcontrolname='formcolAmount']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Amount);
		Amount.sendKeys("100.05");
		System.out.println("Successfully passed a positive value on the Amount textbox of the Add Expense pop-up");
		
		
		
		Thread.sleep(2000);
		WebElement AdvancedPaymentReconciliationCheckbox = driver.findElement(By.xpath("//input[@name='formcolADPReloc']"));
		AdvancedPaymentReconciliationCheckbox.click();
		System.out.println("Successfully checked the Advance Payment checkbox");



		Thread.sleep(1000);
		WebElement SaveButton = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]"));
		SaveButton.click();
		System.out.println("Successfully clicked on the Save button on the Add Expenses pop-up");



		//Add Expense
		
		Thread.sleep(4000);
		String ActualWarningMessage = driver.findElement(By.xpath("//label[@class='mt-3 fw-normal']")).getText();
		String ExpectedWarningMessage = "This submission has already been submitted to ROS. If you make any changes you will need to Resubmit.";
		Assert.assertEquals(ActualWarningMessage, ExpectedWarningMessage);
		System.out.println(ActualWarningMessage);
		
		
		
		
		Thread.sleep(3000);
		WebElement WarningMessageDismissButton = driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]"));
		actions.moveToElement(WarningMessageDismissButton).perform();
		WarningMessageDismissButton.click();
		System.out.println("Successfully dismissed the Warning Message");
		
		
		Thread.sleep(3000);
		WebElement ExpensesPageBackButton = driver.findElement(By.xpath("//span[text()=' Back']"));
		actions.moveToElement(ExpensesPageBackButton).perform();
		ExpensesPageBackButton.click();
		System.out.println("Successfully clicked on the Back button on the Expenses page");
		
		
		
		Thread.sleep(3000);
		WebElement ExpenseSubmissionPageSearchClose = driver.findElement(By.xpath("//span[@class='e-input-group-icon e-icons e-close ng-star-inserted']"));
		actions.moveToElement(ExpenseSubmissionPageSearchClose).perform();
		ExpenseSubmissionPageSearchClose.click();
		System.out.println("Successfully clicked on the search cross icon on the Expense Submission page");
		
		
		Thread.sleep(3000);
		ExpenseSubmissionsPageSearchBar.sendKeys(SubmissionReferenceNumber.trim());
		System.out.println("Successfully passed a value in the Expense Submissions page search bar");
		
		
		
		Thread.sleep(3000);
		ExpenseSubmissionsPageSearchIcon.click();
		System.out.println("Successfully clicked on the search icon in the Expense Submissions page");
		
		
		
		Thread.sleep(3000);
		WebElement ExpenseSubmissionRecordStatus = driver.findElement(By.xpath("//div[@class='ng-star-inserted']/following::p"));
		String ActualStatus = ExpenseSubmissionRecordStatus.getText();
		String ExpectedStatus = "Resubmit";
		Assert.assertEquals(ActualStatus, ExpectedStatus);
		System.out.println("The status of the Expense Submission record has been changed to "+ActualStatus);
		
		
		
		
		
		
		




	




		



		


	
	
	

}}
