package stepDefinitions;

import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;

public class StepDefs_Login {
	String url = "http://newtours.demoaut.com/";
	WebDriver driver;
	@Given("I open my application")
	public void i_open_my_application() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	@Given("I login with following credentials")
	public void i_login_with_following_credentials(DataTable usercredentials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		//Write the code to handle Data Table
		
		Map<String, String> params = usercredentials.asMap(String.class, String.class);
		System.out.println(params.size());
		// Obtenemos todas las llaves del mapa.
	    Set<String> mapKeys = params.keySet();
	    int temp = 0;
		for (String key : mapKeys) {
			if(temp != 0) {driver.get(url);}
	        // Obtenemos el value.
	        String value = params.get(key);
	        // Imprimimos.
	        System.out.printf("Key: [ %s ], Value: [ %s ].\n", key, value);
	        driver.findElement(By.name("userName")).sendKeys(key);
		    driver.findElement(By.name("password")).sendKeys(value);
		    driver.findElement(By.name("login")).click();
		    temp = 1;
	     }
		 driver.close();		
	}
}
