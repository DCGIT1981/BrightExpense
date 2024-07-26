package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SmallBenefitsExemption_NegativeValue;


public class TC_AddExpense_SBE_NegativeValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_SmallBenefitsExemption_NegativeValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();
    AddExpense_SmallBenefitsExemption_NegativeValue bs =
        new AddExpense_SmallBenefitsExemption_NegativeValue();
    bs.AddExpenseSmallBenefitsExemptionNegativeValue();
  }
}


