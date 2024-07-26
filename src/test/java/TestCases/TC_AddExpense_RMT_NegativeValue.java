package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_RemoteWorkingDailyAllowance_NegativeValue;


public class TC_AddExpense_RMT_NegativeValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_RemoteWorkingDailyAllowance_NegativeValue()
      throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();

    AddExpense_RemoteWorkingDailyAllowance_NegativeValue bs =
        new AddExpense_RemoteWorkingDailyAllowance_NegativeValue();


    bs.AddExpenseRemoteWorkingDailyAllowanceNegativeValue();
  }
}


