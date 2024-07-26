 package PageObjects_ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestCases.BaseClass;

public class Resubmission_OnDeleteAnExpense extends BaseClass{
	
	
	@Test
	public void Resubmission_On_Delete_An_Expense() throws IOException, InterruptedException {
		
		
		
		

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
		
		
		
		//Delete Expense
		
		Thread.sleep(4000);
		WebElement ExpenseDeleteIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-delete e-icons e-icon-left'])[1]"));
		actions.moveToElement(ExpenseDeleteIcon).perform();
		ExpenseDeleteIcon.click();
		System.out.println("Successfully clicked on the delete icon of an Expense record to delete that record");
		
				
		
		//Delete Expense
		
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
		
		
		
		Thread.sleep(4000);
		WebElement ExpenseDeleteConfirmationPopUp = driver.findElement(By.xpath("//button[text()=' Delete ']"));
		actions.moveToElement(ExpenseDeleteConfirmationPopUp).perform();
		ExpenseDeleteConfirmationPopUp.click();
		System.out.println("Successfully clicked on the Delete confirmation button to delete an Expense record");
		
		
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
