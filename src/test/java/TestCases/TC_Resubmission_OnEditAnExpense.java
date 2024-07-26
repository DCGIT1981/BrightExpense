package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Resubmission_OnEditAnExpense;

public class TC_Resubmission_OnEditAnExpense extends BaseClass {

  @Test(priority = 2)
  public static void Resubmission_On_Edit_An_Expense() throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();

    Resubmission_OnEditAnExpense bs = new Resubmission_OnEditAnExpense();
    bs.Resubmission_On_Edit_An_Expense();

  }
}
