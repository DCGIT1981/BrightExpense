package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.AddExpense_SubsistenceUnvouched_PositiveValue;


public class TC_AddExpense_SubsistenceUnvouched_PositiveValue extends BaseClass {



  @Test(priority = 2)
  public static void AddExpense_SubsistenceUnvouched_PositiveValue()
      throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    AddExpense_SubsistenceUnvouched_PositiveValue bs =
        new AddExpense_SubsistenceUnvouched_PositiveValue();
    bs.AddExpenseSubsistenceUnvouchedPositiveValue();



  }
}


