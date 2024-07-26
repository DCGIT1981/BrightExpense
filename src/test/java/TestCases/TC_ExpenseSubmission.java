package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.ExpenseSubmission;


public class TC_ExpenseSubmission extends BaseClass {


  @Test(priority = 2)

  public static void ExpenseSubmissionCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    ExpenseSubmission bs = new ExpenseSubmission();
    bs.ExpenseSubmissionMethod();

  }
}


