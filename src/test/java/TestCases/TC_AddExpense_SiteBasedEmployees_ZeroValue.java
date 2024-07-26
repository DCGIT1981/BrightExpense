package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SiteBasedEmployees_ZeroValue;


public class TC_AddExpense_SiteBasedEmployees_ZeroValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_SiteBasedEmployees_ZeroValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_SiteBasedEmployees_ZeroValue bs = new AddExpense_SiteBasedEmployees_ZeroValue();

    bs.AddExpenseSiteBasedEmployeesZeroValue();
  }
}


