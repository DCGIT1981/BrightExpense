package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.EmployeeImport;

public class TC_EmployeeImport extends BaseClass {

  @Test(priority = 2)
  public static void EmployeeImport() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    EmployeeImport bs = new EmployeeImport();
    bs.EmployeeImportChecking();

  }
}
