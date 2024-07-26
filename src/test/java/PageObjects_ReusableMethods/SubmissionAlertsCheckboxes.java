package PageObjects_ReusableMethods;

import java.io.IOException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import java.time.Duration;
import TestCases.BaseClass;


public class SubmissionAlertsCheckboxes extends BaseClass{
	
	
	@Test
	public void Submission_Alerts_Checkboxes() throws IOException, InterruptedException{
		
		
		

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
		WebElement SettingsIcon = driver.findElement(By.xpath("//span[@class='material-symbols-outlined md-22 mx-3']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(SettingsIcon).perform();
		SettingsIcon.click();
		System.out.println("Successfully clicked on the Settings icon from the Expense Submissions page");
		
		
		
		WebElement TurnOnEmailAlertsForSuccessfulROSSubmissions = driver.findElement(By.xpath("//input[@id='successfulRosSubmission']"));
		TurnOnEmailAlertsForSuccessfulROSSubmissions.click();
		Thread.sleep(2000);
		TurnOnEmailAlertsForSuccessfulROSSubmissions.click();
		System.out.println("Successfully clicked on the 'Turn on Email alerts for successful submissions' checkbox");
		
		
		
		Thread.sleep(2000);
		WebElement TurnOnEmailAlertsForROSSubmissionErrors = driver.findElement(By.xpath("(//input[@id='failedRosSubmission'])[1]"));
		TurnOnEmailAlertsForROSSubmissionErrors.click();
		Thread.sleep(2000);
		TurnOnEmailAlertsForROSSubmissionErrors.click();
		System.out.println("Successfully clicked on the 'Turn on Email alerts for submission errors' checkbox");
		
		
		
		Thread.sleep(2000);
		WebElement TurnOnEmailAlertsForLateROSSubmissions = driver.findElement(By.xpath("(//input[@id='failedRosSubmission'])[2]"));
		TurnOnEmailAlertsForLateROSSubmissions.click();
		Thread.sleep(2000);
		TurnOnEmailAlertsForLateROSSubmissions.click();
		System.out.println("Successfully clicked on the 'Turn on Email alerts for late submissions' checkbox");
		
		
		
		Thread.sleep(2000);
		WebElement SubmissionAlertsSaveButton = driver.findElement(By.xpath("//button[@class='e-custom btn-primary d-block m-0']"));
		actions.moveToElement(SubmissionAlertsSaveButton).perform();
		SubmissionAlertsSaveButton.click();
		System.out.println("Successfully clicked on the save button of Submission Alerts");
		
		
		Thread.sleep(2000);
		WebElement StatusCloseButton = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0']"));
		actions.moveToElement(StatusCloseButton).perform();
		StatusCloseButton.click();
		System.out.println("Successfully clicked on the Status close button");
		

		
		

}}
