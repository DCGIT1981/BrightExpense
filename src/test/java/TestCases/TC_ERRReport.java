package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.ERRReport;

public class TC_ERRReport extends BaseClass {


  @Test(priority = 1)
  public static void ERRReportCheck() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();

    ERRReport bs = new ERRReport();

    bs.ERRReportCheck();



  }
}
