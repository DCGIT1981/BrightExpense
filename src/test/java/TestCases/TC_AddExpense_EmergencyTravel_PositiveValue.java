package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_EmergencyTravel_PositiveValue;


public class TC_AddExpense_EmergencyTravel_PositiveValue extends BaseClass {


  @Test(priority = 2)
  public static void AddExpense_EmergencyTravel_PositiveValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_EmergencyTravel_PositiveValue bs = new AddExpense_EmergencyTravel_PositiveValue();
    bs.AddExpenseEmergencyTravelPositiveValue();

  }
}


