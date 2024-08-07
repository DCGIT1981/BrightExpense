package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.ExtentReportNG;

public class Listeners extends BaseClass implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReportNG.getreport();
	
	public void onTestStart(ITestResult result)
	{
		test=extent.createTest(result.getMethod().getMethodName());
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, "Test Passed");
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		
		test.log(Status.FAIL, result.getThrowable());
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	
		}
		
		String filePath = null;
		try {
			filePath = getScreenshot(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
		
		
		
		
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
		
	}
}
