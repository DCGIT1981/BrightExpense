package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_TravelVouched_NegativeValue;


public class TC_AddExpense_TravelVouched_NegativeValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_TravelVouched_NegativeValue()
      throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();
    AddExpense_TravelVouched_NegativeValue bs = new AddExpense_TravelVouched_NegativeValue();
    bs.AddExpenseTravelVouchedNegativeValue();



  }
}
