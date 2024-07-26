package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.SignOut;

public class TC_SignOut extends BaseClass {

  @Test(priority = 2)
  public static void SignOut() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();
    SignOut bs = new SignOut(driver);

    bs.UserProfileIcon(driver);
    System.out.println("Successfully clicked on the User Profile Icon");
    bs.SignOutButton(driver);
    System.out.println("Successfully clicked on the Sign Out Button");


  }
}
