package execution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Punto5 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\geckodriver.exe");
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/confirmTest.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//PARTE A
		driver.findElement(By.name("b1")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//PARTE B
		driver.findElement(By.name("b1")).click();
		alert.dismiss();
	}
}
