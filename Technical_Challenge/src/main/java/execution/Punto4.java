package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Punto4 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\geckodriver.exe");
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/clicks.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//PARTE A
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		//PARTE B
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("/html/body/form/input[2]"));
		action.doubleClick(link).perform();
		//PARTE C
		WebElement elementLocator = driver.findElement(By.xpath("/html/body/form/input[4]"));
		action.contextClick(elementLocator).perform();
	}
}
