package tour.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import code.tours.LoginTour;

public class verifyTourLogin {

	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		LoginTour login = new LoginTour(driver);
		login.loginToTours("Juan", "qwerty");
		login.clickOnLoginButton();
		driver.quit();
	}
}