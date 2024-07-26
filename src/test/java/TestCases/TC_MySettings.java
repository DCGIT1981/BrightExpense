package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.MySettings;

public class TC_MySettings extends BaseClass {

  @Test(priority = 2)
  public static void MySettings() throws IOException, InterruptedException {


    TC_LoginPage.LoginPage();


    MySettings bs = new MySettings();
    bs.MySettings_Method();
    bs.ChooseFile();
    bs.P12CertificateUpload();
    bs.P12CertificateDelete();
    bs.SubmissionAlertCheckboxes();



  }
}
