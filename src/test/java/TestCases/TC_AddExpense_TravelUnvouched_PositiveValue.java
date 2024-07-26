package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_TravelUnvouched_PositiveValue;


public class TC_AddExpense_TravelUnvouched_PositiveValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_TravelUnvouched_PositiveValue()
      throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();

    AddExpense_TravelUnvouched_PositiveValue bs = new AddExpense_TravelUnvouched_PositiveValue();
    bs.AddExpenseTravelUnvouchedPositiveValue();



  }
}
