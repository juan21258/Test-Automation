package execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Punto1 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\geckodriver.exe");
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/linkTest.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//Parte A
		driver.findElement(By.linkText("linkByContent")).click();
		//Look
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Parte B
		driver.get("http://sahitest.com/demo/linkTest.htm");
		driver.findElement(By.linkText("linkByHtml")).click();
		//Look
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
}
