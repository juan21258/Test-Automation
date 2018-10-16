package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_NewTours {
	String url = "http://newtours.demoaut.com/";
	String user = "Karolina";
	String pass = "ace";
	WebDriver driver;
	
	@Given("The tours page")
	public void the_tours_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url); //abrir pagina
	}

	@When("I type the user and password information")
	public void i_type_the_user_and_password_information() {
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("Click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("It shows a new page")
	public void it_shows_a_new_page() {
		String current = driver.getCurrentUrl();
		Boolean isDone = current != url;
		assertTrue(isDone);
		driver.close();
	}
}