package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SmallBenefitsExemption_PositiveValue;


public class TC_AddExpense_SBE_PositiveValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_SmallBenefitsExemption_PositiveValue()
      throws IOException, InterruptedException {
    TC_LoginPage.LoginPage();

    AddExpense_SmallBenefitsExemption_PositiveValue bs =
        new AddExpense_SmallBenefitsExemption_PositiveValue();

    bs.AddExpenseSmallBenefitsExemptionPositiveValue();

  }
}


