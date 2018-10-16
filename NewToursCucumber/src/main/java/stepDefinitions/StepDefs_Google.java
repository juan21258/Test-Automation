package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.When;

public class StepDefs_Google {
	String url = "http://newtours.demoaut.com/";
	@When("^abro la aplicacion en el Navegador (Chrome|Firefox|Explorer)$")
	public void abro_la_aplicacion_en_el_Navegador_Chrome(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();;
			driver.get(url);
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
		}else if(browser.equalsIgnoreCase("explorer")) {
			System.setProperty("webdriver.ie.driver", 
					"C:\\Drivers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();;
			driver.get(url);
		}
	}
}
