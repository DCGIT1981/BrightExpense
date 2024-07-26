package PageObjects_ReusableMethods;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import java.time.Duration;
import TestCases.BaseClass;

public class AdvancePaymentCheckboxValidationInBatchExpense extends BaseClass{
	
	
	@Test
	public void AdvancePaymentCheckboxValidationInBatchExpenseMethod() throws InterruptedException, IOException {
		
		
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
		ExpenseSubmissionsPageSearchBar.sendKeys("000005");
		System.out.println("Successfully passed value in the search bar on the Expense Submissions page");


		Thread.sleep(2000);


		WebElement ExpenseSubmissionsPageSearchIcon = driver.findElement(By.xpath("//a[@class='e-input-group-icon e-icons e-search']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ExpenseSubmissionsPageSearchIcon).perform();
		ExpenseSubmissionsPageSearchIcon.click();
		System.out.println("Successfully clicked on the search icon on the Expense Submissions page");



		Thread.sleep(3000);




		WebElement ExpenseSubmissionsSearchClose = driver.findElement(By.xpath("//span[@class='e-input-group-icon e-icons e-close ng-star-inserted']"));
		actions.moveToElement(ExpenseSubmissionsSearchClose).perform();
		ExpenseSubmissionsSearchClose.click();
		System.out.println("Successfully clicked on the search cross icon on the Expense Submissions page");



		By ManualSubmissionButton = By.xpath("//span[@class='d-flex align-items-center']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ManualSubmissionButton)).click();
		System.out.println("Successfully clicked on the Add Manual Submission button on the Expense Submissions page");

		//Expense Submissions page




		Thread.sleep(2000);
		WebElement PaymentDate = driver.findElement(By.xpath("//input[@id='formColPaymentDate_input']"));

		String PaymentDateValue = PaymentDate.getAttribute("value");


		if(PaymentDateValue != null) {
			int PaymentDateValLen = PaymentDateValue.length();

			for(int i =0; i < PaymentDateValLen; i++) {
				PaymentDate.sendKeys(Keys.BACK_SPACE);
			}}

		Thread.sleep(2000);

		PaymentDate.sendKeys("01/01/2024");

		Thread.sleep(2000);
		System.out.println("Successfully passed value in the Payment Date text box on the Batch Expenses page");



		//Add a Batch Expense row1


		WebElement ExpenseDate1 = driver.findElement(By.xpath("//input[@id='gridexpenseDate']"));
		String ExpenseDateValue = ExpenseDate1.getAttribute("value");

		if(ExpenseDateValue != null) {
			int ExpenseDateValLen = ExpenseDateValue.length();

			for(int i =0; i < ExpenseDateValLen; i++) {
				ExpenseDate1.sendKeys(Keys.BACK_SPACE);
			}
		}

		Thread.sleep(2000);
		ExpenseDate1.sendKeys("10/01/2024");
		System.out.println("Successfully passed value in the Expense Date textbox on the Batch Expenses page");



		WebElement EmployeeDropdown1 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[1]"));
		actions.moveToElement(EmployeeDropdown1).perform();
		EmployeeDropdown1.click();
		System.out.println("Successfully clicked on the Employee dropdown on the Batch Expenses page");


		WebElement EmployeeValueSelect1 = driver.findElement(By.xpath("//li[contains(text(),'Hindol MURPHY')]"));
		actions.moveToElement(EmployeeValueSelect1).perform();
		EmployeeValueSelect1.click();
		System.out.println("Successfully selected a value from the Employee dropdown on the Batch Expenses page");





		Thread.sleep(2000);
		WebElement CategoryDropdown1 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[2]"));
		CategoryDropdown1.click();
		actions.moveToElement(CategoryDropdown1).perform();
		CategoryDropdown1.click();
		System.out.println("Successfully clicked on the Category dropdown on the Batch Expenses page");








		WebElement CategoryValueSelect1 = driver.findElement(By.xpath("//li[contains(text(),'Travel')]")); 
		CategoryValueSelect1.click(); 
		System.out.println("Successfully selected a value from the Category dropdown on the Batch Expenses page");


		Thread.sleep(2000); 
		WebElement SubCategoryDropdown1 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[3]"));
		actions.moveToElement(SubCategoryDropdown1).perform();
		SubCategoryDropdown1.click(); 
		System.out.println("Successfully clicked on the SubCategory dropdown on the Batch Expenses page");


		WebElement SubCategoryValueSelect1 = driver.findElement(By.xpath("//li[contains(text(),'Advance Payment')]")); 
		actions.moveToElement(SubCategoryValueSelect1).perform();
		SubCategoryValueSelect1.click(); 
		System.out.println("Successfully selected a value from the SubCategory dropdown on the Batch Expenses page");



		Thread.sleep(2000); 
		WebElement AmountTextbox1 = driver.findElement(By.xpath("//input[@id='gridamount']"));
		actions.moveToElement(AmountTextbox1).perform();
		AmountTextbox1.sendKeys("123.34");
		System.out.println("Successfully passed a value in the Amount textbox on the Batch Expenses page");
		
		
		
		Thread.sleep(2000);
		WebElement ADPCheckBox = driver.findElement(By.xpath("//input[@class='advPayRecChck e-input e-field']"));
		
		if(ADPCheckBox.isEnabled()) {
			
			System.out.println("The application is not working fine");
			
		} else {
			System.out.println("The application is working fine");
		}
		
		
		
		
		

		Thread.sleep(2000);
		WebElement SaveIcon1 = driver.findElement(By.xpath("//span[@class='e-btn-icon e-update e-icons']"));
		actions.moveToElement(SaveIcon1).perform(); 
		SaveIcon1.click();
		System.out.println("Successfully saved a Batch Expense row");
		
		
	


		//Add a Batch Expense row1


}}
