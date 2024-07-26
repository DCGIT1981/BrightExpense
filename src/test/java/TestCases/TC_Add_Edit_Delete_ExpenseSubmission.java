package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Add_Edit_Delete_ExpenseSubmission;

public class TC_Add_Edit_Delete_ExpenseSubmission extends BaseClass {


  @Test(priority = 2)
  public static void ExpenseSubmissionPage() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();



    Add_Edit_Delete_ExpenseSubmission bs = new Add_Edit_Delete_ExpenseSubmission();
    bs.AddEditDeleteExpenseSubmission();



  }
}
