package PageObjects_ReusableMethods;






import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import TestCases.BaseClass;

public class ERRReport extends BaseClass{
	
	@Test
	
	public void ERRReportCheck() throws IOException, InterruptedException {
		
		
		

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


		Thread.sleep(2000);	


		WebElement ExpenseSubmissionsPageSearchBar = driver.findElement(By.xpath("//input[@name='searchText']"));
		ExpenseSubmissionsPageSearchBar.sendKeys("000040");
		System.out.println("Successfully passed value in the search bar on the Expense Submissions page");


		Thread.sleep(2000);


		WebElement ExpenseSubmissionsPageSearchIcon = driver.findElement(By.xpath("//a[@class='e-input-group-icon e-icons e-search']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ExpenseSubmissionsPageSearchIcon).perform();
		ExpenseSubmissionsPageSearchIcon.click();
		System.out.println("Successfully clicked on the search icon on the Expense Submissions page");



		Thread.sleep(3000);
		
		
		WebElement ExpenseSubmissionRecordReferenceNumber = driver.findElement(By.xpath("//a[text()=' 000040 ']"));
		actions.moveToElement(ExpenseSubmissionRecordReferenceNumber).perform();
		ExpenseSubmissionRecordReferenceNumber.click();
		System.out.println("Successfully clicked on the Reference Number of a Expense Submission record");
		
		
		WebElement ERRReportPrintButton = driver.findElement(By.xpath("//button[text()='Print']"));
		actions.moveToElement(ERRReportPrintButton).perform();
		ERRReportPrintButton.click();
		System.out.println("Successfully clicked on the Print button of ERR Report");
		
		
		
		WebElement ERRReportCSVButton = driver.findElement(By.xpath("//span[text()=' download ']"));
		actions.moveToElement(ERRReportCSVButton).perform();
		ERRReportCSVButton.click();
		System.out.println("Successfully clicked on the CSV download button of ERR Report");
		
		
		Thread.sleep(3000);
		WebElement ERRReportCSVDownloadDismissButton = driver.findElement(By.xpath("//span[text()=' Dismiss ']"));
		actions.moveToElement(ERRReportCSVDownloadDismissButton).perform();
		ERRReportCSVDownloadDismissButton.click();
		System.out.println("Successfully clicked on the Dismiss button of CSV download pop-up of ERR Report");
		
		
		
		
		WebElement ERRReportTakePrintButton = driver.findElement(By.xpath("//span[text()=' print ']"));
		actions.moveToElement(ERRReportTakePrintButton).perform();
		ERRReportTakePrintButton.click();
		System.out.println("Successfully clicked on the ERR Report Print button to take print");
		
		




		

		
	}
	
	























































}
