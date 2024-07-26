package PageObjects_ReusableMethods;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.io.IOException;
import java.time.Duration;

import TestCases.BaseClass;

public class EmployerDelete extends BaseClass{
	
	
	@Test
	public void Employer_Delete() throws IOException, InterruptedException {
		
		
		
		
	
	
	Thread.sleep(2000);
	WebElement EmployerDeleteButton = driver.findElement(By.xpath("(//span[@class='e-btn-icon e-delete e-icons e-icon-left'])[2]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(EmployerDeleteButton).perform();
	EmployerDeleteButton.click();
	System.out.println("Successfully clicked on the Employer delete button");
	
	
	
	Thread.sleep(2000);
	WebElement EmployerDeleteConfirmationButton = driver.findElement(By.xpath("//button[@class='ng-star-inserted e-control e-btn e-lib e-custom btn-primary m-0 popup-btn-delete']"));
	actions.moveToElement(EmployerDeleteConfirmationButton).perform();
	EmployerDeleteConfirmationButton.click();
	System.out.println("Successfully clicked on the Employer delete confirmation button");
	
	
	
	
	By EmployerDeleteSuccessfulMessage = By.xpath("//label[@class='mt-3 fw-normal']");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	String ActualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(EmployerDeleteSuccessfulMessage)).getText();
	String ExpectedMessage = "Successful to Delete Employer";
	Assert.assertEquals(ActualMessage, ExpectedMessage);
	System.out.println(ActualMessage);
	
	
	
	
	
	
	
	
	Thread.sleep(2000);
	WebElement EmployerDeleteMessageDismissButton = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
	actions.moveToElement(EmployerDeleteMessageDismissButton).perform();
	EmployerDeleteMessageDismissButton.click();
	System.out.println("Successfully dismissed the Employer Delete status message");
	
	
	
	
	
	
	
	}
}

