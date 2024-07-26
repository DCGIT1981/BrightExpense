package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AdvancePaymentCheckboxValidationInAddExpensePopUp;

public class TC_AdvancePaymentCheckboxValidationInAddExpensePopUp extends BaseClass {

  @Test(priority = 2)
  public static void AdvancePaymentCheckboxValidationInAddExpensePopUp()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AdvancePaymentCheckboxValidationInAddExpensePopUp bs =
        new AdvancePaymentCheckboxValidationInAddExpensePopUp();
    bs.AdvancePaymentCheckboxValidationInAddExpensePopUpMethod();

  }
}
