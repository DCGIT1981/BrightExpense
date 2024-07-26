package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Resubmission_OnAddNewExpense;

public class TC_Resubmission_OnAddNewExpense extends BaseClass {

  @Test(priority = 2)
  public static void Resubmission_On_Add_New_Expense() throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();

    Resubmission_OnAddNewExpense bs = new Resubmission_OnAddNewExpense();
    bs.Resubmission_On_Add_New_Expense();


  }
}
