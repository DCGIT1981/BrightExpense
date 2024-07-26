package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Resubmission_OnDeleteAnExpense;

public class TC_Resubmission_OnDeleteAnExpense extends BaseClass {

  @Test(priority = 2)
  public static void Resubmission_On_Delete_An_Expense() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    Resubmission_OnDeleteAnExpense bs = new Resubmission_OnDeleteAnExpense();
    bs.Resubmission_On_Delete_An_Expense();


  }
}
