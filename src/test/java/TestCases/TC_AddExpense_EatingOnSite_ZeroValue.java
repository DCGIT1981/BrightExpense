package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_EatingOnSite_ZeroValue;

public class TC_AddExpense_EatingOnSite_ZeroValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_EatingOnSite_ZeroValue() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_EatingOnSite_ZeroValue bs = new AddExpense_EatingOnSite_ZeroValue();

    bs.AddExpenseEatingOnSiteZeroValue();

  }
}


