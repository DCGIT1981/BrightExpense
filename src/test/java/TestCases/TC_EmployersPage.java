package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.EmployersPage;


public class TC_EmployersPage extends BaseClass {


  @Test(priority = 2)
  public static void EmployersPageCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();


    EmployersPage bs = new EmployersPage();
    bs.EmployersPageCheck();

  }
}


