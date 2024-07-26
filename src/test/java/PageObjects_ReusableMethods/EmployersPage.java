package PageObjects_ReusableMethods;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestCases.BaseClass;


import java.io.IOException;
import java.time.Duration;






public class EmployersPage extends BaseClass{
	
	
	@Test
	
	public void EmployersPageCheck() throws InterruptedException, IOException {
		
		
		
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
		
		
		
		
		WebElement EmployerDeleteIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-delete e-icons e-icon-left'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(EmployerDeleteIcon).perform();
		EmployerDeleteIcon.click();
		System.out.println("Successfully clicked on the Delete icon of an Employer");	
		
		
		WebElement EmployerDeleteConfirmationPopUp = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0 popup-btn-delete']"));
		actions.moveToElement(EmployerDeleteConfirmationPopUp).perform();
		EmployerDeleteConfirmationPopUp.click();
		System.out.println("Successfully clicked on the Delete button of the Employer Delete Confirmation Pop-up");
		
		
		
		By EmployerCannotBeDeletedMessage = By.xpath("//label[@class='mt-3 fw-normal']");
		String ActualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(EmployerCannotBeDeletedMessage)).getText();
		String ExpectedMessage = "Unable to delete this Employer as ROS Submissions exist on it.";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		System.out.println(ActualMessage);
		
		
		
		WebElement EmployerCannotBeDeleted = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		actions.moveToElement(EmployerCannotBeDeleted).perform();
		EmployerCannotBeDeleted.click();
		System.out.println("Successfully clicked on the Dismiss button of the Unable to Delete Employer Status message");
		
		
		
		By EmployerNameClick = By.xpath("//a[contains(text(),' Bright Expense_16.02.2024 ')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployerNameClick)).click();
		System.out.println("Successfully clicked on the name of an Employer");
		
		
		
		
		
		//Employers page
				
		
	
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		

	
	

	


	



	




















}}