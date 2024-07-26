package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_EatingOnSite_PositiveValue;


public class TC_AddExpense_EatingOnSite_PositiveValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_EatingOnSite_PositiveValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();


    AddExpense_EatingOnSite_PositiveValue bs = new AddExpense_EatingOnSite_PositiveValue();
    bs.AddExpenseEatingOnSitePositiveValue();



  }
}


