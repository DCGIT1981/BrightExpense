package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Grant_CancelSupportAccess;

public class TC_Grant_CancelSupportAccess extends BaseClass {


  @Test(priority = 2)
  public static void Grant_CancelSupportAccessCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();


    Grant_CancelSupportAccess bs = new Grant_CancelSupportAccess();
    bs.GrantAndCancelSupportAccessMethod();
    bs.GrantAccess();

  }
}
