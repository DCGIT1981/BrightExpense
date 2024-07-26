package PageObjects_ReusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	
	
	
	WebDriver ldriver;



	public SignOut(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[@class='inner-content']")
	WebElement UserProfileIcon;
	
	@FindBy(xpath="//input[@id='btn_logout']")
	WebElement SignOutButton;
	
	
	
	
	
	
	
	
	
	public void UserProfileIcon(WebDriver driver) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(UserProfileIcon).perform();
		UserProfileIcon.click();
		
	}
	
	public void SignOutButton(WebDriver driver) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(SignOutButton).perform();
		SignOutButton.click();
		
	}

}
