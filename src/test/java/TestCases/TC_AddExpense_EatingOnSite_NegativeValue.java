package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_EatingOnSite_NegativeValue;


public class TC_AddExpense_EatingOnSite_NegativeValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_EatingOnSite_NegativeValue()
      throws IOException, InterruptedException {



    TC_LoginPage.LoginPage();



    AddExpense_EatingOnSite_NegativeValue bs = new AddExpense_EatingOnSite_NegativeValue();


    bs.AddExpenseEatingOnSiteNegativeValue();
  }
}


