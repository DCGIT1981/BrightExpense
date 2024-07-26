package PageObjects_ReusableMethods;



import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestCases.BaseClass;

public class NotificationBellIcon extends BaseClass{
	
	
	
	
	@Test
	public  void NotificationBellIconCheck() throws InterruptedException, IOException {

		

		
		
		
		WebElement NotificationBellIcon = driver.findElement(By.xpath("//span[@class='material-symbols-outlined md-28']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", NotificationBellIcon);
		
		System.out.println("Successfully navigated to the Notification List page from the Employers page");
		
		
		WebElement NotificationListPageCount = driver.findElement(By.xpath("//span[@class='e-pagecountmsg']"));
		
		String NotificationListPageTotalItems = NotificationListPageCount.getText();
		String NumberOnly= NotificationListPageTotalItems.replaceAll("[^0-9]", "");
		
		int num = Integer.parseInt(NumberOnly);
		System.out.println("The total count of records in the Notification List page is: "+num);
		
		
		
		
		
		System.out.println("Successfully extracted the total row count of the Notification List page");
		
		
		WebElement SubmissionsNavigationMenu = driver.findElement(By.xpath("(//span[@class='material-symbols-outlined p-2 md-18'])[2]"));
		
		js.executeScript("arguments[0].click();", SubmissionsNavigationMenu);
		System.out.println("Successfully navigated to the Expense Submissions page");
		
		
		List <WebElement> NotSubmittedStatus = driver.findElements(By.xpath("//p[@class='badge bg-amber m-0']"));
		System.out.println("The total count of 'Not Submitted' records in the Expense Submissions page is: "+NotSubmittedStatus.size());
		int NotSubmittedCount = NotSubmittedStatus.size();
		
		
		
		List <WebElement> ErrorStatus = driver.findElements(By.xpath("//p[@class='badge bg-danger m-0']"));
		System.out.println("The total count of 'Error' records in the Expense Submissions page is: "+ErrorStatus.size());
		int ErrorCount = ErrorStatus.size();
		
		
		
		
		int NotSubmittedPlusError = NotSubmittedCount+ErrorCount;
		
		
		
		
		
		
		
		
		
		
		Assert.assertEquals(num, NotSubmittedPlusError);
		System.out.println("The total count of records in the Notification List page matches with the total count of 'Not Submitted' and 'Error' records in the Expense Submission page");
		
		
		

		

}}
