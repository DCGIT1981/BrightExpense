package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_RemoteWorkingDailyAllowance_PositiveValue;


public class TC_AddExpense_RMT_PositiveValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_RemoteWorkingDailyAllowance_PositiveValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_RemoteWorkingDailyAllowance_PositiveValue bs =
        new AddExpense_RemoteWorkingDailyAllowance_PositiveValue();

    bs.AddExpenseRemoteWorkingDailyAllowancePositiveValue();

  }
}


