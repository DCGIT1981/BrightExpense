package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_TravelUnvouched_NegativeValue;


public class TC_AddExpense_TravelUnvouched_NegativeValue extends BaseClass {


  @Test(priority = 2)
  public static void AddExpense_TravelUnvouched_NegativeValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_TravelUnvouched_NegativeValue bs = new AddExpense_TravelUnvouched_NegativeValue();
    bs.AddExpenseTravelUnvouchedNegativeValue();



  }
}
