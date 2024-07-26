package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SmallBenefitsExemption_ZeroValue;

public class TC_AddExpense_SBE_ZeroValue extends BaseClass {

  @Test(priority = 2)
  public static void AddExpense_SmallBenefitsExemption_ZeroValue()
      throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();
    AddExpense_SmallBenefitsExemption_ZeroValue bs =
        new AddExpense_SmallBenefitsExemption_ZeroValue();
    bs.AddExpenseSmallBenefitsExemptionZeroValue();



  }
}


