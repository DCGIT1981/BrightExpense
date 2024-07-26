package PageObjects_ReusableMethods;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;





import TestCases.BaseClass;

public class MySettings extends BaseClass{


	@Test
	public void MySettings_Method() throws IOException, InterruptedException {

		
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
		WebElement SettingsIcon = driver.findElement(By.xpath("//span[@class='material-symbols-outlined md-22 mx-3']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(SettingsIcon).perform();
		SettingsIcon.click();
		System.out.println("Successfully clicked on the Settings icon from the Expense Submissions page");



	}






	/*public void ChooseFile() throws InterruptedException, IOException 
	{


		Boolean P12FileChooseFileButton = driver.findElements(By.xpath("//button[@class='btn-upload btn-primary relative float-start']")).size()>0;



		if(P12FileChooseFileButton) {
			driver.findElement(By.xpath("//button[@class='btn-upload btn-primary relative float-start']")).click();
			System.out.println("Successfully clicked on the Choose File button of the My Settings tab");		}

		else {

			WebElement ROSCertificateDropdownButton = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
			ROSCertificateDropdownButton.click();
			System.out.println("Successfully clicked on the Certificate dropdown button of the My Settings tab");

			WebElement ROSCertificateUpdateButton = driver.findElement(By.xpath("//a[text()='Update']"));
			ROSCertificateUpdateButton.click();
			System.out.println("Successfully clicked on the Certificate Update button of the My Settings tab");

			driver.findElement(By.xpath("//button[@class='btn-upload btn-primary relative float-start']")).click();
			System.out.println("Successfully clicked on the Choose File button of the My Settings tab");

		}*/



	public void ChooseFile() {
		try {






			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement ROSCertificateDropdownButton = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
			ROSCertificateDropdownButton.click();
			System.out.println("Successfully clicked on the Certificate dropdown button of the My Settings tab");

			WebElement ROSCertificateUpdateButton = driver.findElement(By.xpath("//a[text()='Update']"));
			ROSCertificateUpdateButton.click();
			System.out.println("Successfully clicked on the Certificate Update button of the My Settings tab");
			
			
			driver.findElement(By.xpath("//button[@class='btn-upload btn-primary relative float-start']")).click();
			System.out.println("Successfully clicked on the Choose File button of the My Settings tab");


			
			
			
			



		} catch (NoSuchElementException e) {
			
			driver.findElement(By.xpath("//button[@class='btn-upload btn-primary relative float-start']")).click();
			




		}








	}







	public void P12CertificateUpload() throws InterruptedException, IOException {


	 		


		Thread.sleep(3000);
		Runtime.getRuntime().exec("C://D-DRIVE//JAVA//DotP12.exe");
		Thread.sleep(2000);
		System.out.println("Successfully selected a P12 file from the folder");


		WebElement PasswordTextBox = driver.findElement(By.xpath("//input[@formcontrolname='formMyDigitalCertificatePassVal']"));
		PasswordTextBox.sendKeys("24e66221");
		System.out.println("Successfully provided the password in the Password Text Box");


		Thread.sleep(2000);
		WebElement AgentTAINTextBox =  driver.findElement(By.xpath("//input[@name='formAgentTain']"));

		String AgentTAINTextBoxValue = AgentTAINTextBox.getAttribute("value");

		if(AgentTAINTextBoxValue != null) {
			int AgentTAINTextBoxValLen = AgentTAINTextBoxValue.length();

			for (int i = 0; i < AgentTAINTextBoxValLen; i++ ) {

				AgentTAINTextBox.sendKeys(Keys.BACK_SPACE);


			}
		}

		Thread.sleep(2000);

		AgentTAINTextBox.sendKeys("97601W");
		System.out.println("Successfully passed the Agent TAIN in the Agent TAIN textbox");



		Thread.sleep(2000);
		WebElement P12CertificateSaveButton = driver.findElement(By.xpath("//button[@class='e-custom btn-primary d-block m-0']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(P12CertificateSaveButton).perform();
		P12CertificateSaveButton.click();
		System.out.println("Successfully clicked on the save button to upload a P12 file");


		Thread.sleep(2000);
		WebElement StatusCloseButton = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0']"));
		actions.moveToElement(StatusCloseButton).perform();
		StatusCloseButton.click();
		System.out.println("Successfully clicked on the close button to close the Status Message");

	}

	
	public void P12CertificateDelete() {
		WebElement ROSCertificateDropdownButton = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ROSCertificateDropdownButton).perform();
		ROSCertificateDropdownButton.click();
		System.out.println("Successfully clicked on the Certificate dropdown button of the My Settings tab");


		WebElement ROSCertificateDeleteButton = driver.findElement(By.xpath("//a[text()='Delete']"));
		actions.moveToElement(ROSCertificateDeleteButton).perform();
		ROSCertificateDeleteButton.click();
		System.out.println("Successfully clicked on the Certificate Delete button of the My Settings tab");


		WebElement P12CertificateDeleteConfirmationButton = driver.findElement(By.xpath("//button[text()=' Delete ']"));
		actions.moveToElement(P12CertificateDeleteConfirmationButton).perform();
		P12CertificateDeleteConfirmationButton.click();
		System.out.println("Successfully clicked on the Delete confirmation button");


	}



	public void SubmissionAlertCheckboxes() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement SuccessfulROSSubmission = driver.findElement(By.xpath("//input[@id='successfulRosSubmission']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(SuccessfulROSSubmission).perform();
		SuccessfulROSSubmission.click();


		WebElement FailedROSSubmission = driver.findElement(By.xpath("(//input[@id='failedRosSubmission'])[1]"));
		actions.moveToElement(FailedROSSubmission).perform();
		FailedROSSubmission.click();


		WebElement DueROSSubmission = driver.findElement(By.xpath("(//input[@id='failedRosSubmission'])[2]"));
		actions.moveToElement(DueROSSubmission).perform();
		DueROSSubmission.click();



		SuccessfulROSSubmission.click();
		FailedROSSubmission.click();
		DueROSSubmission.click();


		System.out.println("Successfully clicked on the 'Turn on Email alerts for successful submissions' checkbox");
		System.out.println("Successfully clicked on the 'Turn on Email alerts for submission errors' checkbox");
		System.out.println("Successfully clicked on the 'Turn on Email alerts for late submissions' checkbox");



		Thread.sleep(2000);
		WebElement SubmissionAlertCheckboxesSaveButton = driver.findElement(By.xpath("//button[@class='e-custom btn-primary d-block m-0']"));
		actions.moveToElement(SubmissionAlertCheckboxesSaveButton).perform();
		SubmissionAlertCheckboxesSaveButton.click();
		System.out.println("Successfully clicked on the Submission Alert checkboxes Save button");


		Thread.sleep(2000);
		WebElement StatusCloseButton = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0']"));
		actions.moveToElement(StatusCloseButton).perform();
		StatusCloseButton.click();
		System.out.println("Successfully clicked on the close button to close the Status Message");





}}
































