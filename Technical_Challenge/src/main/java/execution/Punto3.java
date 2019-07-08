package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Punto3 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\geckodriver.exe");
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/iframesTest.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//PARTE A
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Link Test")).click();
		//PARTE B
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Link Test")).click();
		//PARTE C
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/input[2]")).click();
	}
}
