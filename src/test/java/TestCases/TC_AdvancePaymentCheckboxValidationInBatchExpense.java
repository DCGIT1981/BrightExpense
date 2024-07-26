package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AdvancePaymentCheckboxValidationInBatchExpense;

public class TC_AdvancePaymentCheckboxValidationInBatchExpense extends BaseClass {


  @Test(priority = 2)
  public static void AdvancePaymentCheckboxValidationInBatchExpense()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AdvancePaymentCheckboxValidationInBatchExpense bs =
        new AdvancePaymentCheckboxValidationInBatchExpense();
    bs.AdvancePaymentCheckboxValidationInBatchExpenseMethod();


  }
}
