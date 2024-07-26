package PageObjects_ReusableMethods;

import java.io.IOException;

import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import java.time.Duration;
import TestCases.BaseClass;

public class EmployersImport extends BaseClass{
	
	@Test
	public void EmployersImportChecking() throws InterruptedException, IOException{

		
		

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
		
		
		//Employers page
		
		
		Thread.sleep(2000);
		By EmployersImportButton = By.xpath("//span[@class='d-flex align-items-center']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployersImportButton)).click();
		System.out.println("Successfully clicked on the Employers Import button");
		
		
		By ChooseFileButton = By.xpath("//button[@class='btn-upload btn-primary relative float-start']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ChooseFileButton)).click();
		System.out.println("Successfully clicked on the Choose File button");
		
		
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\D-DRIVE\\JAVA\\EmployersImportFile.exe");
		Thread.sleep(2000);
		System.out.println("Successfully selected an Employer file from the folder");
		
		
		
		Thread.sleep(2000);
		By NextButton = By.xpath("//button[contains(text(),'Next')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextButton)).click();
		System.out.println("Successfully clicked on the Next button");
		
		
		
		Thread.sleep(2000);
		By ImportButton = By.xpath("//button[contains(text(),'Import')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ImportButton)).click();
		System.out.println("Successfully clicked on the Import button");
		



}}
