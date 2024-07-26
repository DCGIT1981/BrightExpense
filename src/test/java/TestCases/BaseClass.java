package TestCases;

import static Resources.PropertyReader.ApplicationConfigReader;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;



	@BeforeMethod
	public void startbrowser() throws IOException {
		if (ApplicationConfigReader("Browser").contains("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			if(ApplicationConfigReader("Browser").contains("headless")) {
				options.addArguments("--headless", "--window-size=1920,1080");
			}

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();

		}

		else if (ApplicationConfigReader("Browser").contains("Edge")) {
			EdgeOptions options = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			if(ApplicationConfigReader("Browser").contains("headless")) {
				options.addArguments("--headless", "--window-size=1920,1080");
			}

			driver = new EdgeDriver(options);
			driver.manage().window().maximize();
		}

		else if (ApplicationConfigReader("Browser").contains("Firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			if(ApplicationConfigReader("Browser").contains("headless")) {
				options.addArguments("--headless", "--window-size=1920,1080");
			} 
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();

		}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get(ApplicationConfigReader("URL"));



	}

	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);

	}


	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file =
				new File(System.getProperty("user.dir") + "//Screenshots//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//Screenshots//" + testCaseName + ".png";
	}

	
	  @AfterMethod
	 
	 public void teardown() {
	  
	 driver.quit(); }
	 



}


