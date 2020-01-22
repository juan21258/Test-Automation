package ExtentReport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest {
	@Test
	public void verifySeleniumBlog() {

		String extentReportFile = System.getProperty("user.dir")
				+ "\\extentReportFile.html";
		String extentReportImage = System.getProperty("user.dir")
				+ "\\extentReportImage.png";
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
		// Create object of extent report and specify the report file path.
		ExtentReports extent = new ExtentReports(extentReportFile, false);
		// Start the test using the ExtentTest class object.
		ExtentTest extentTest = extent.startTest("Title Test",
				"Verify WebSite Title");
		// Launch the FireFox browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		extentTest.log(LogStatus.INFO, "Browser Launched");
		// Open application.
		driver.get("https://www.techbeamers.com");
		extentTest.log(LogStatus.INFO, "Navigated to www.techbeamers.com");
		// get title.
		String title = driver.getTitle();
		boolean titleText;
		extentTest.log(LogStatus.INFO, "Get the WebSite title");
		// Verify title.
		System.out.println(title);
		if(title.contains("Lithium") == true) {
			extentTest.log(LogStatus.PASS, "Title verified");
			titleText = true;
		}
		else {
			extentTest.log(LogStatus.FAIL, "Get the WebSite title");
			extentTest.log(
					LogStatus.INFO,
					"Error info: The title is not correct");
			titleText = false;
		}
		// Close application.
		driver.quit();
		extentTest.log(LogStatus.INFO, "Browser closed");
		// close report.
		extent.endTest(extentTest);
		// writing everything to document.
		extent.flush();
		assertTrue(titleText);
	}
}
