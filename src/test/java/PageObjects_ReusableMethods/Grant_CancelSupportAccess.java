package PageObjects_ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestCases.BaseClass;

public class Grant_CancelSupportAccess extends BaseClass{
	
	
	@Test
	public  void GrantAndCancelSupportAccessMethod() throws InterruptedException, IOException {
		
		
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
		
		
		WebElement SettingsIcon = driver.findElement(By.xpath("//span[@class='material-symbols-outlined md-22 mx-3']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", SettingsIcon);
		System.out.println("Successfully clicked on the Settings icon");
		
		
		WebElement GrantAccountAccessTab = driver.findElement(By.xpath("//div[contains(text(),'Grant Account Access')]"));
		js.executeScript("arguments[0].click();", GrantAccountAccessTab);
		System.out.println("Successfully clicked on the Grant Account Access tab on the Settings page");
		
		
		//Settings page
	}
		
		public void GrantAccess(){
			
			try {
				
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement GrantAccessButton = driver.findElement(By.xpath("//button[@class='btn-primary m-0 ng-star-inserted']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", GrantAccessButton);
		System.out.println("Successfully clicked on the Grant Access button on the Grant Account Access tab");
		
		
		WebElement GrantAccessConfirmationButton = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0']"));
		js.executeScript("arguments[0].click();", GrantAccessConfirmationButton);
		System.out.println("Successfully clicked on the Grant Access confirmation button");
		
		
		String ActualLabel = driver.findElement(By.xpath("//label[@class='py-2 px-8 supportRequestInform ng-star-inserted']")).getText();
		String ExpectedLabel = "Support Request Created";
		Assert.assertEquals(ActualLabel, ExpectedLabel);
		System.out.println("Successfully granted Support Access to an Employer");
		
		
			}catch (NoSuchElementException e) {
				
				WebElement CancelAccess = driver.findElement(By.xpath("//button[@class='btn-outline-primary m-0 ng-star-inserted']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", CancelAccess);
				System.out.println("Successfully clicked on the Cancel Support Access button");
				
				
				WebElement CancelAccessConfirmationButton = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0']"));
				CancelAccessConfirmationButton.click();
				System.out.println("Successfully clicked on the Cancel Support Access confirmation button");
				
				
				
				String ActualButtonText = driver.findElement(By.xpath("//button[@class='btn-primary m-0 ng-star-inserted']")).getText();
				String ExpectedButtonText = "Grant Access";
				Assert.assertEquals(ActualButtonText, ExpectedButtonText);
				System.out.println("Successfully cancelled the Support Access of an Employer");
				
				
				
			
			}

		

		}


		
		
		
}
	



