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


public class Select_All_Employee_Checkbox_in_Add_Expense_PopUp extends BaseClass{
	
	@Test
	public void SelectAllEmployeeCheckboxInAddExpensePopUp() throws InterruptedException, IOException{
		
		
		

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
		ExpenseSubmissionsPageSearchBar.sendKeys("000005");
		System.out.println("Successfully passed value in the search bar on the Expense Submissions page");


		Thread.sleep(4000);
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
		actions.moveToElement(CategoryDropdown1).perform();
		CategoryDropdown1.click();
		System.out.println("Successfully clicked on the Category dropdown on the Batch Expenses page");


		WebElement CategoryValueSelect1 = driver.findElement(By.xpath("//li[contains(text(),'Travel')]"));
		actions.moveToElement(CategoryValueSelect1).perform();
		CategoryValueSelect1.click();
		System.out.println("Successfully selected a value from the Category dropdown on the Batch Expenses page");


		Thread.sleep(2000);
		WebElement SubCategoryDropdown1 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[3]"));
		actions.moveToElement(SubCategoryDropdown1).perform();
		SubCategoryDropdown1.click();
		System.out.println("Successfully clicked on the SubCategory dropdown on the Batch Expenses page");


		WebElement SubCategoryValueSelect1 = driver.findElement(By.xpath("//li[contains(text(),'Site Based Employees')]"));
		actions.moveToElement(SubCategoryValueSelect1).perform();
		SubCategoryValueSelect1.click();
		System.out.println("Successfully selected a value from the SubCategory dropdown on the Batch Expenses page");


		Thread.sleep(2000);
		WebElement AmountTextbox1 = driver.findElement(By.xpath("//input[@id='gridamount']"));
		actions.moveToElement(AmountTextbox1).perform();
		AmountTextbox1.sendKeys("123.34");
		System.out.println("Successfully passed a value in the Amount textbox on the Batch Expenses page");
		
		
		Thread.sleep(2000);
		WebElement ADPCheckBox4 = driver.findElement(By.xpath("//input[@class='advPayRecChck e-input e-field']"));
		ADPCheckBox4.click();
		System.out.println("Successfully checked the Advance Payment checkbox");
		
		

		Thread.sleep(2000);
		WebElement SaveIcon1 = driver.findElement(By.xpath("//span[@class='e-btn-icon e-update e-icons']"));
		actions.moveToElement(SaveIcon1).perform();
		SaveIcon1.click();
		System.out.println("Successfully saved a Batch Expense row");


		//Add a Batch Expense row1


		Thread.sleep(4000);
		WebElement DeleteIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-delete e-icons'])[1]"));
		actions.moveToElement(DeleteIcon).perform();
		DeleteIcon.click();
		System.out.println("Successfully deleted a Batch Expense row");



		Thread.sleep(2000);
		String ExpenseSubmissionReferenceNumber = driver.findElement(By.xpath("//h1[contains(text(),'Expenses')]")).getText().replaceAll("[^0-9]", " ");
		System.out.println("The newly generated Submission Reference number is: "+ExpenseSubmissionReferenceNumber.trim());



		Thread.sleep(5000);
		WebElement BackButton = driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
		actions.moveToElement(BackButton).perform();
		BackButton.click();
		System.out.println("Successfully clicked on the Back button on the Batch Expenses page");



		//Add Expense Travel And Subsistence

		Thread.sleep(4000);
		WebElement AddExpenseButton = driver.findElement(By.xpath("(//span[@class='d-flex align-items-center'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", AddExpenseButton);
		System.out.println("Successfully clicked on the Add Expense button");
		
		
		
		Thread.sleep(4000);
		/*List<WebElement> AllEmployees = driver.findElements(By.xpath("//li[@class='e-list-item e-level-1']"));
		Thread.sleep(4000);
		for (WebElement SelectEmployee : AllEmployees) {
			System.out.println(SelectEmployee.getText());
			if(SelectEmployee.getText().contains("Debashis BYRNE")) {
				
				SelectEmployee.click();
			}
		}*/
		
		
		WebElement SelectAllEmployeeCheckbox = driver.findElement(By.xpath("//input[@class='form-check-input']"));
		SelectAllEmployeeCheckbox.click();
		System.out.println("Successfully checked the Select All Employee checkbox");
		

		
		Thread.sleep(4000);
		WebElement ExpenseDatePopUp1 = driver.findElement(By.xpath("//input[@id='formColExpenseDate_input']"));
		String ExpenseDateValuePopUp1 = ExpenseDatePopUp1.getAttribute("value");

		if(ExpenseDateValuePopUp1 != null) {
			int ExpenseDateValLenPopUp1 = ExpenseDateValuePopUp1.length();

			for(int i =0; i < ExpenseDateValLenPopUp1; i++) {
				ExpenseDatePopUp1.sendKeys(Keys.BACK_SPACE);
			}ExpenseDatePopUp1.sendKeys("10/01/2024");
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
		js.executeScript("arguments[0].click();", Amount);
		Amount.sendKeys("100.05");
		System.out.println("Successfully passed a positive value on the Amount textbox of the Add Expense pop-up");
		
		
		Thread.sleep(2000);
		WebElement AdvancedPaymentReconciliationCheckbox = driver.findElement(By.xpath("//input[@name='formcolADPReloc']"));
		AdvancedPaymentReconciliationCheckbox.click();


		
		Thread.sleep(1000);
		WebElement SaveButton = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]"));
		SaveButton.click();
		System.out.println("Successfully clicked on the Save button on the Add Expense pop-up");



		//Add Expense Travel & Subsistence
		
		
		Thread.sleep(5000);
		WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		//actions.moveToElement(SubmitButton).perform();
		//SubmitButton.click();
		js.executeScript("arguments[0].click();", SubmitButton);
		System.out.println("Successfully clicked on the Submit button to submit a batch of expenses to ROS");
		
		
		
		Thread.sleep(2000);
		WebElement ExpenseSubmissionInformationMessage = driver.findElement(By.xpath("//label[text()=' Submission Successfully Queued']"));
		String ActualInformationMessage = ExpenseSubmissionInformationMessage.getText();
		String ExpectedInformationMessage = "Submission Successfully Queued";
		Assert.assertEquals(ActualInformationMessage, ExpectedInformationMessage);
		System.out.println("Submission Successfully Queued");
		
		
		Thread.sleep(2000);
		WebElement InformationMessageDismissButton = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		actions.moveToElement(InformationMessageDismissButton).perform();
		InformationMessageDismissButton.click();
		System.out.println("Successfully clicked on the Dismiss button and navigated to the Expense Submissions page");
		
		
		
		Thread.sleep(2000);
		ExpenseSubmissionsPageSearchBar.sendKeys(ExpenseSubmissionReferenceNumber.trim());
		System.out.println("Successfully passed value in the search bar on the Expense Submissions page");
		
		
		
		
		Thread.sleep(2000);
		actions.moveToElement(ExpenseSubmissionsPageSearchIcon).perform();
		ExpenseSubmissionsPageSearchIcon.click();
		System.out.println("Successfully clicked on the search icon on the Expense Submissions page");
		
		
		
		Thread.sleep(2000);
		WebElement ExpenseSubmissionRecordStatus = driver.findElement(By.xpath("//div[@class='ng-star-inserted']/following::p"));
		String ActualStatus = ExpenseSubmissionRecordStatus.getText();
		System.out.println("The status of the Expense Submission record is "+ActualStatus);


		
	}

}
