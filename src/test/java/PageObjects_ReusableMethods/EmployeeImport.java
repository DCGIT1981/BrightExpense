package PageObjects_ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import TestCases.BaseClass;

public class EmployeeImport extends BaseClass{
	
	@Test
	public  void EmployeeImportChecking() throws InterruptedException, IOException {
		
		
		

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
		By EmployeeImportButton = By.xpath("//span[contains(text(),'Employee Import')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployeeImportButton)).click();
		System.out.println("Successfully clicked on the Employee Import button");
		
		
		
		Thread.sleep(2000);
		By ChooseFileButton = By.xpath("//span[contains(text(),'Choose File')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ChooseFileButton)).click();
		System.out.println("Successfully clicked on the Choose File button");
		
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\D-DRIVE\\JAVA\\EmployeeImportFile.exe");
		Thread.sleep(2000);
		System.out.println("Successfully selected an Employee file from the folder");
		
		

		Thread.sleep(1000);
		By NextButton = By.xpath("//button[contains(text(),'Next')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextButton)).click();
		System.out.println("Successfully clicked on the Next button on the Employee Import page");
		
		
		
		
		Thread.sleep(5000);
		By SelectAllCheckbox = By.xpath("(//span[@class='e-frame e-icons'])[1]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectAllCheckbox)).click();
		System.out.println("Successfully clicked on the Select All Employees checkbox");
		
		
		
		
		Thread.sleep(2000);
		By ImportButton = By.xpath("//button[contains(text(),'Import')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ImportButton)).click();
		System.out.println("Successfully clicked on the Import button in the Employee Import page");
		
		
		
		Thread.sleep(2000);
		WebElement WarningMessage = driver.findElement(By.xpath("//label[@class='mt-3 fw-normal']"));
		String WarningMessageText = WarningMessage.getText();
		System.out.println(WarningMessageText);
		
		
		Thread.sleep(2000);
		By DuplicateEmployeeWarningMessage = By.xpath("//button[contains(text(),'Yes')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(DuplicateEmployeeWarningMessage)).click();
		System.out.println("Successfully clicked on the Yes button of the Duplicate Employee Warning Message");
		
		
		
		Thread.sleep(2000);
		WebElement StatusText = driver.findElement(By.xpath("//label[@class='mt-3 fw-normal']"));
		String Text = StatusText.getText();
		System.out.println(Text);
		
		
		
		Thread.sleep(2000);
		By CloseButton = By.xpath("//button[contains(text(),'Close')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(CloseButton)).click();
		System.out.println("Successfully clicked on the Close button of the Import Status Message");
		
		


	





		




		




}}
