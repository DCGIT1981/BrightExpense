package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Add_Edit_Delete_Expense;


public class TC_Add_Edit_Delete_Expense extends BaseClass {

  @Test(priority = 2)
  public static void AddEditDeleteExpense() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();


    Add_Edit_Delete_Expense bs = new Add_Edit_Delete_Expense();
    bs.AddEditDeleteExpense();



  }
}
