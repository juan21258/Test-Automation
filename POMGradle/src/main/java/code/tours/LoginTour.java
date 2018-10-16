package code.tours;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTour {
	//Inicializar variables
	WebDriver driver;
	By username = By.name("userName");
	By password = By.name("password");
	By loginButton = By.name("login");
	
	//Instanciar driver
	public LoginTour(WebDriver driver) {
		this.driver = driver;
	}
	
	//Datos para ingreso a la pagina, con usuario y contraseña
	public void loginToTours(String userid, String pass) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	public void typeUsername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
