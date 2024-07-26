package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.Add_Edit_Delete_BatchExpense;


public class TC_Add_Edit_Delete_BatchExpense extends BaseClass {


  @Test(priority = 2)
  public static void AddEditDeleteBatchExpenseCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    Add_Edit_Delete_BatchExpense bs = new Add_Edit_Delete_BatchExpense();
    bs.AddEditDeleteBatchExpense();



  }
}


