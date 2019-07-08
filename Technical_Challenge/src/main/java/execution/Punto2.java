package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Punto2 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\geckodriver.exe");
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/selectTest.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//Parte A
		driver.findElement(By.id("id1")).click();
		//Parte B
		Select drptwo = new Select(driver.findElement(By.id("s2Id")));
		drptwo.selectByVisibleText("o2");
		//PARTE C
		Select drpthree = new Select(driver.findElement(By.id("s3Id")));
		drpthree.selectByIndex(2);
		//PARTE D
		Select drpfour = new Select(driver.findElement(By.id("s4Id")));
		drpfour.selectByValue("o3val");
		//PARTE E
		driver.findElement(By.cssSelector("#s1")).sendKeys("Fax");
	}
}
