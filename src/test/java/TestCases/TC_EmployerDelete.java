package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.EmployerDelete;


public class TC_EmployerDelete extends BaseClass {



  @Test(priority = 2)
  public static void EmployerDeleteCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    EmployerDelete bs = new EmployerDelete();
    bs.Employer_Delete();



  }
}
