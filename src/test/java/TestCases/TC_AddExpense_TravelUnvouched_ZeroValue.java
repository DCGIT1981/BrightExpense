package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_TravelUnvouched_ZeroValue;


public class TC_AddExpense_TravelUnvouched_ZeroValue extends BaseClass {


  @Test(priority = 2)
  public static void AddExpense_TravelUnvouched_ZeroValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_TravelUnvouched_ZeroValue bs = new AddExpense_TravelUnvouched_ZeroValue();
    bs.AddExpenseTravelUnvouchedZeroValue();



  }
}
