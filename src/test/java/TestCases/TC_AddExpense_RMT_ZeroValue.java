package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_RemoteWorkingDailyAllowance_ZeroValue;


public class TC_AddExpense_RMT_ZeroValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_RemoteWorkingDailyAllowance_ZeroValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();
    AddExpense_RemoteWorkingDailyAllowance_ZeroValue bs =
        new AddExpense_RemoteWorkingDailyAllowance_ZeroValue();

    bs.AddExpenseRemoteWorkingDailyAllowanceZeroValue();
  }
}


