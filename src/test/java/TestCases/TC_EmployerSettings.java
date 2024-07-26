package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.EmployerSettings;

public class TC_EmployerSettings extends BaseClass {

  @Test(priority = 2)
  public static void EmployerSettings() throws IOException, InterruptedException {

    TC_LoginPage.LoginPage();


    EmployerSettings bs = new EmployerSettings();
    bs.EmployerSettings_Method();
    bs.ChooseFile();
    bs.P12CertificateUpload();
    bs.P12CertificateDelete();


  }

}
