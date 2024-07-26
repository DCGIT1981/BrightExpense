package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.ExpenseImport;

public class TC_ExpenseImport extends BaseClass {

  @Test(priority = 2)
  public static void ExpenseImport() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    ExpenseImport bs = new ExpenseImport();
    bs.ExpenseImportChecking();


  }
}
