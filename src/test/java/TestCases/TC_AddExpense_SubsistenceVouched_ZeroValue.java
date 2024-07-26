package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SubsistenceVouched_ZeroValue;


public class TC_AddExpense_SubsistenceVouched_ZeroValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_SubsistenceVouched_ZeroValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();
    AddExpense_SubsistenceVouched_ZeroValue bs = new AddExpense_SubsistenceVouched_ZeroValue();
    bs.AddExpenseSubsistenceVouchedZeroValue();



  }
}
