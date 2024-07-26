package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Select_All_Employee_Checkbox_in_Add_Expense_PopUp;

public class TC_Select_All_Employee_Checkbox_in_Add_Expense_PopUp extends BaseClass {

  @Test(priority = 2)
  public static void SelectAllEmployeeCheckboxInAddExpensePopUp()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();
    Select_All_Employee_Checkbox_in_Add_Expense_PopUp bs =
        new Select_All_Employee_Checkbox_in_Add_Expense_PopUp();
    bs.SelectAllEmployeeCheckboxInAddExpensePopUp();


  }
}
