package PageObjects_ReusableMethods;

import org.openqa.selenium.By;
import static Resources.PropertyReader.ApplicationConfigReader;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestCases.BaseClass;



public class LoginPage extends BaseClass{
	
	
	@Test
	public void Login_Page() throws IOException, InterruptedException {
	
	driver.get(ApplicationConfigReader("URL"));
	Thread.sleep(2000);

	System.out.println("Successfully invoked the Browser and hit the provided URL");

	String ProvidedUserName = "avik.dey@relate-infotech.com";
	String ProvidedPassword = "Ferg-123";

	driver.findElement(By.id("signInName")).sendKeys("avik.dey@relate-infotech.com");
	System.out.println("Successfully provided the User ID in the Email Address text box");

	driver.findElement(By.id("password")).sendKeys("Ferg-123");
	System.out.println("Successfully provided the password in the Password text box");

	WebElement KeepMeSignedInCheckbox = driver.findElement(By.xpath("//input[@id='rememberMe']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", KeepMeSignedInCheckbox);
	System.out.println("Successfully clicked on the 'Keep me signed in' checkbox");


	String uid = "avik.dey@relate-infotech.com";
	String pwd="Ferg-123";


	if(ProvidedUserName!=uid ||ProvidedPassword!=pwd )
	{
		System.out.println(driver.findElement(By.xpath("//div[@class='error pageLevel']")).getText());
	}
	else
	{
		if(ProvidedUserName!=uid && ProvidedPassword!=pwd )
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='error pageLevel']")).getText());
		}
	}	

	WebElement save = driver.findElement(By.id("next"));
	js.executeScript("arguments[0].click();", save);

	// validation re-direction of employers page

	String PageName_Employers =
			driver.findElement(By.xpath("//h1[text()='Employers']")).getText();



	if(PageName_Employers.contains("Employers")) {

		Assert.assertEquals(PageName_Employers, "Employers");
		System.out.println("Successfully logged into the Bright Expense application with more than one Employer having page header as:"+ " "+PageName_Employers); }

	else {
		String PageName_ExpenseSubmission =
				driver.findElement(By.xpath("//h1[text()='Expense Submissions']")).getText();
		System.out.println("Successfully logged into the Bright Expense application having only one Employer having header as:" + " " + PageName_ExpenseSubmission);
	}

	//Log in Page

	

	}}









