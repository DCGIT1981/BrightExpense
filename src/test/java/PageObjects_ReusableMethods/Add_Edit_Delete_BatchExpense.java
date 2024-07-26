package PageObjects_ReusableMethods;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import TestCases.BaseClass;

public class Add_Edit_Delete_BatchExpense extends BaseClass{


	@Test

	public void AddEditDeleteBatchExpense() throws InterruptedException, IOException {

		

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








		WebElement CategoryValueSelect1 = driver.findElement(By.xpath("//li[contains(text(),'Travel And Subsistence')]")); 
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
		WebElement ADPCheckBox = driver.findElement(By.xpath("//input[@class='advPayRecChck e-input e-field']"));
		ADPCheckBox.click();
		System.out.println("Successfully checked the Advance Payment checkbox");
		
		

		Thread.sleep(2000);
		WebElement SaveIcon1 = driver.findElement(By.xpath("//span[@class='e-btn-icon e-update e-icons']"));
		actions.moveToElement(SaveIcon1).perform(); 
		SaveIcon1.click();
		System.out.println("Successfully saved a Batch Expense row");
		
		
	


		//Add a Batch Expense row1



		//Add a Batch Expense row2


		WebElement ExpenseDate2 = driver.findElement(By.xpath("//input[@id='gridexpenseDate']")); 
		String ExpenseDateValue2 = ExpenseDate2.getAttribute("value");

		if(ExpenseDateValue2 != null) { 
			int ExpenseDateValLen = ExpenseDateValue2.length();

			for(int i =0; i < ExpenseDateValLen; i++) {
				ExpenseDate2.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000);
		ExpenseDate2.sendKeys("11/01/2024");
		System.out.println("Successfully passed value in the Expense Date textbox on the Batch Expenses page");



		WebElement EmployeeDropdown2 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[1]"));
		actions.moveToElement(EmployeeDropdown2).perform();
		EmployeeDropdown2.click(); 
		System.out.println("Successfully clicked on the Employee dropdown on the Batch Expenses page");


		WebElement EmployeeValueSelect2 = driver.findElement(By.xpath("//li[contains(text(),'Biplab ROY')]"));
		actions.moveToElement(EmployeeValueSelect2).perform();
		EmployeeValueSelect2.click(); 
		System.out.println("Successfully selected a value from the Employee dropdown on the Batch Expenses page");





		Thread.sleep(2000); 
		WebElement CategoryDropdown2 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[2]"));
		actions.moveToElement(CategoryDropdown2).perform();
		CategoryDropdown2.click(); 
		System.out.println("Successfully clicked on the Category dropdown on the Batch Expenses page");


		WebElement CategoryValueSelect2 = driver.findElement(By.xpath("//li[contains(text(),'Travel And Subsistence')]")); 
		actions.moveToElement(CategoryValueSelect2).perform();
		CategoryValueSelect2.click(); 
		System.out.println("Successfully selected a value from the Category dropdown on the Batch Expenses page");


		Thread.sleep(2000); 
		WebElement SubCategoryDropdown2 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[3]"));
		actions.moveToElement(SubCategoryDropdown2).perform();
		SubCategoryDropdown2.click(); System.out.println("Successfully clicked on the SubCategory dropdown on the Batch Expenses page");


		WebElement SubCategoryValueSelect2 = driver.findElement(By.xpath("//li[contains(text(),'Travel Vouched')]"));
		actions.moveToElement(SubCategoryValueSelect2).perform();
		SubCategoryValueSelect2.click(); 
		System.out.println("Successfully selected a value from the SubCategory dropdown on the Batch Expenses page");


		Thread.sleep(2000); 
		WebElement AmountTextbox2 = driver.findElement(By.xpath("//input[@id='gridamount']"));
		AmountTextbox2.click();


		String AmountTextbox2Value = AmountTextbox2.getAttribute("value");

		if(AmountTextbox2Value != null) {
			int AmountTextbox2ValLen = AmountTextbox2Value.length();

			for(int i =0; i < AmountTextbox2ValLen; i++) {
				AmountTextbox2.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000); 
		AmountTextbox2.sendKeys("212.65"); 
		System.out.println("Successfully passed a value in the Amount textbox on the Batch Expenses page");
		
		
		
		
		Thread.sleep(2000);
		WebElement ADPCheckBox1 = driver.findElement(By.xpath("//input[@class='advPayRecChck e-input e-field']"));
		ADPCheckBox1.click();
		System.out.println("Successfully checked the Advance Payment checkbox");






		Thread.sleep(2000); 
		WebElement SaveIcon2 = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-update e-icons'])[2]"));
		actions.moveToElement(SaveIcon2).perform(); SaveIcon2.click();
		System.out.println("Successfully saved a Batch Expense row");


		//Add a Batch Expense row2




		//Add a Batch Expense row3


		WebElement ExpenseDate3 = driver.findElement(By.xpath("//input[@id='gridexpenseDate']")); String
		ExpenseDateValue3 = ExpenseDate3.getAttribute("value");

		if(ExpenseDateValue3 != null) { 
			int ExpenseDateValLen = ExpenseDateValue3.length();

			for(int i =0; i < ExpenseDateValLen; i++) {
				ExpenseDate3.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000); 
		ExpenseDate3.sendKeys("12/01/2024"); 
		System.out.println("Successfully passed value in the Expense Date textbox on the Batch Expenses page");



		WebElement EmployeeDropdown3 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[1]"));
		actions.moveToElement(EmployeeDropdown3).perform();
		EmployeeDropdown3.click(); System.out.println("Successfully clicked on the Employee dropdown on the Batch Expenses page");


		WebElement EmployeeValueSelect3 = driver.findElement(By.xpath("//li[contains(text(),'Souvik ROY')]"));
		actions.moveToElement(EmployeeValueSelect3).perform();
		EmployeeValueSelect3.click(); System.out.println("Successfully selected a value from the Employee dropdown on the Batch Expenses page");





		Thread.sleep(2000); 
		WebElement CategoryDropdown3 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[2]"));
		actions.moveToElement(CategoryDropdown3).perform();
		CategoryDropdown3.click(); 
		System.out.println("Successfully clicked on the Category dropdown on the Batch Expenses page");


		WebElement CategoryValueSelect3 = driver.findElement(By.xpath("//li[contains(text(),'Remote Working Daily Allowance')]"));
		actions.moveToElement(CategoryValueSelect3).perform();
		CategoryValueSelect3.click(); System.out.println("Successfully selected a value from the Category dropdown on the Batch Expenses page");


		Thread.sleep(2000);
		WebElement DaysTextBox = driver.findElement(By.xpath("//input[@id='griddays']"));
		actions.moveToElement(DaysTextBox).perform(); DaysTextBox.sendKeys("15");
		System.out.println("Successfully passed a value in the Days textbox on the Batch Expenses page");





		Thread.sleep(2000); 
		WebElement AmountTextbox3 = driver.findElement(By.xpath("//input[@id='gridamount']"));
		AmountTextbox3.click();

		String AmountTextbox3Value = AmountTextbox3.getAttribute("value");

		if(AmountTextbox3Value != null) { 
			int AmountTextbox3ValLen = AmountTextbox3Value.length();

			for(int i =0; i < AmountTextbox3ValLen; i++) {
				AmountTextbox3.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000); 
		AmountTextbox3.sendKeys("255.75"); 
		System.out.println("Successfully passed a value in the Amount textbox on the Batch Expenses page");
		
		
		
		Thread.sleep(2000);
		WebElement ADPCheckBox3 = driver.findElement(By.xpath("//input[@class='advPayRecChck e-input e-field']"));
		ADPCheckBox3.click();
		System.out.println("Successfully checked the Advance Payment checkbox");
		

		
		
		Thread.sleep(2000); 
		WebElement SaveIcon3 = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-update e-icons'])[3]"));
		actions.moveToElement(SaveIcon3).perform(); SaveIcon3.click();
		System.out.println("Successfully saved a Batch Expense row");


		//Add a Batch Expense row3



		//Add a Batch Expense row4


		WebElement ExpenseDate4 = driver.findElement(By.xpath("//input[@id='gridexpenseDate']")); String
		ExpenseDateValue4 = ExpenseDate4.getAttribute("value");

		if(ExpenseDateValue4 != null) { 
			int ExpenseDateValLen = ExpenseDateValue4.length();

			for(int i =0; i < ExpenseDateValLen; i++) {
				ExpenseDate4.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000); 
		ExpenseDate4.sendKeys("13/01/2024"); 
		System.out.println("Successfully passed value in the Expense Date textbox on the Batch Expenses page");



		WebElement EmployeeDropdown4 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[1]"));
		actions.moveToElement(EmployeeDropdown4).perform();
		EmployeeDropdown4.click(); 
		System.out.println("Successfully clicked on the Employee dropdown on the Batch Expenses page");


		WebElement EmployeeValueSelect4 = driver.findElement(By.xpath("//li[contains(text(),'Debashis BYRNE')]"));
		actions.moveToElement(EmployeeValueSelect4).perform();
		EmployeeValueSelect4.click(); 
		System.out.println("Successfully selected a value from the Employee dropdown on the Batch Expenses page");





		Thread.sleep(2000); 
		WebElement CategoryDropdown4 = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[2]"));
		actions.moveToElement(CategoryDropdown4).perform();
		CategoryDropdown4.click(); 
		System.out.println("Successfully clicked on the Category dropdown on the Batch Expenses page");


		WebElement CategoryValueSelect4 = driver.findElement(By.xpath("//li[contains(text(),'Small Benefits Exemption')]"));
		actions.moveToElement(CategoryValueSelect4).perform();
		CategoryValueSelect4.click(); 
		System.out.println("Successfully selected a value from the Category dropdown on the Batch Expenses page");








		Thread.sleep(2000); 
		WebElement AmountTextbox4 = driver.findElement(By.xpath("//input[@id='gridamount']"));
		AmountTextbox4.click();


		String AmountTextbox4Value = AmountTextbox4.getAttribute("value");

		if(AmountTextbox4Value != null) { 
			int AmountTextbox4ValLen = AmountTextbox4Value.length();

			for(int i =0; i < AmountTextbox4ValLen; i++) {
				AmountTextbox4.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000); 
		AmountTextbox4.sendKeys("365.85"); 
		System.out.println("Successfully passed a value in the Amount textbox on the Batch Expenses page");
		
		
		
		Thread.sleep(2000);
		WebElement ADPCheckBox4 = driver.findElement(By.xpath("//input[@class='advPayRecChck e-input e-field']"));
		ADPCheckBox4.click();
		System.out.println("Successfully checked the Advance Payment checkbox");
		
		

		Thread.sleep(2000); 
		WebElement SaveIcon4 = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-update e-icons'])[4]"));
		actions.moveToElement(SaveIcon4).perform(); SaveIcon4.click();
		System.out.println("Successfully saved a Batch Expense row");


		//Add a Batch Expense row4




		Thread.sleep(2000);
		WebElement CancelIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-cancel-icon e-icons'])[5]"));
		actions.moveToElement(CancelIcon).perform(); 
		CancelIcon.click();
		System.out.println("Successfully cancelled a blank Batch Expense row");



		Thread.sleep(2000); 
		WebElement AddBatchExpenseRowButton = driver.findElement(By.xpath("//button[@id='addBatchEntry']"));
		actions.moveToElement(AddBatchExpenseRowButton).perform();
		AddBatchExpenseRowButton.click(); 
		System.out.println("Successfully clicked on the Add Expense button on the Batch Expenses page");




		Thread.sleep(2000); 
		WebElement EditIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-edit e-icons'])[1]")); 
		actions.moveToElement(EditIcon).perform(); EditIcon.click();
		System.out.println("Successfully clicked on the edit icon of a Batch Expense");



		Thread.sleep(2000); 
		WebElement EditAmount = driver.findElement(By.xpath("//input[@id='gridamount']")); String
		EditAmountValue = EditAmount.getAttribute("value");

		if(EditAmountValue != null) { 
			int EditAmountValLen = EditAmountValue.length();

			for(int i =0; i < EditAmountValLen; i++) {
				EditAmount.sendKeys(Keys.BACK_SPACE); } }

		Thread.sleep(2000); 
		EditAmount.sendKeys("234.45");
		System.out.println("Successfully edited the Amount of a Batch Expense");



		Thread.sleep(2000);
		WebElement EditSaveIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-update e-icons'])[1]"));
		actions.moveToElement(EditSaveIcon).perform(); 
		EditSaveIcon.click();
		System.out.println("Successfully clicked on the Save icon for editing a Batch Expense");



		Thread.sleep(4000); 
		WebElement DeleteIcon = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-delete e-icons'])[1]"));
		actions.moveToElement(DeleteIcon).perform(); 
		DeleteIcon.click();
		System.out.println("Successfully deleted a Batch Expense row");



		Thread.sleep(2000); 
		String ExpenseSubmissionReferenceNumber = driver.findElement(By.xpath("//h1[contains(text(),'Expenses')]")).getText().replaceAll("[^0-9]", " ");
		System.out.println("The newly generated Submission Reference number is: "+ExpenseSubmissionReferenceNumber.trim());


		Thread.sleep(2000); 
		WebElement BackButton = driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
		actions.moveToElement(BackButton).perform(); 
		BackButton.click(); 
		System.out.println("Successfully clicked on the Back button on the Batch Expenses page and navigated to the Expenses page");
		
		
		
		Thread.sleep(2000);
		WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		actions.moveToElement(SubmitButton).perform();
		SubmitButton.click();
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




































































