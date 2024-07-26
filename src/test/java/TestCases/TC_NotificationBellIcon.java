package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.NotificationBellIcon;

public class TC_NotificationBellIcon extends BaseClass {


  @Test(priority = 2)
  public static void NotificationBellIconCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    NotificationBellIcon bs = new NotificationBellIcon();
    bs.NotificationBellIconCheck();



  }
}
