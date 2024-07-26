package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.SubmissionAlertsCheckboxes;

public class TC_SubmissionAlertsCheckboxes extends BaseClass {



  @Test(priority = 2)
  public static void Submission_Alerts_Checkboxes() throws IOException, InterruptedException {


    TC_LoginPage.LoginPage();

    SubmissionAlertsCheckboxes bs = new SubmissionAlertsCheckboxes();
    bs.Submission_Alerts_Checkboxes();

  }
}
