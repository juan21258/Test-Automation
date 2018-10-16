package wordpress.test;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import code.wordpress.LoginPage;

public class verifyValidLogin {

	@Test
	public void verifyLogin() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login = new LoginPage(driver);
		login.loginToWordpress("Juan", "qwerty");
		login.clickOnLoginButton();
		driver.quit();
	}
}