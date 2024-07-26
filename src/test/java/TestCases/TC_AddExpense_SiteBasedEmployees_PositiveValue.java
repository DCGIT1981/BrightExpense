package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SiteBasedEmployees_PositiveValue;


public class TC_AddExpense_SiteBasedEmployees_PositiveValue extends BaseClass {


  @Test(priority = 2)
  public static void AddExpense_SiteBasedEmployees_PositiveValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_SiteBasedEmployees_PositiveValue bs =
        new AddExpense_SiteBasedEmployees_PositiveValue();
    bs.AddExpenseSiteBasedEmployeesPositiveValue();


  }
}


