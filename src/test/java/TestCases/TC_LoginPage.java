package TestCases;



import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects_ReusableMethods.LoginPage;


public class TC_LoginPage extends BaseClass {



  @Test(priority = 1)
  public static void LoginPage() throws IOException, InterruptedException {

    LoginPage lp = new LoginPage();
    lp.Login_Page();


  }
}


