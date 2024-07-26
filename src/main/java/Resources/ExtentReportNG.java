package Resources;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportNG {

	public static ExtentReports extent;
	public static ExtentReports getreport()
	{
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repname="Test Report -"+timestamp+".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "//Test Reports//"+repname);
		reporter.config().setReportName("Web Automation Results for Bright Expense");
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimeStampFormat(timestamp);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Software Test Engineer", "Avik Dey");
		return extent;
		
		
		
	}
	
	
	
}
