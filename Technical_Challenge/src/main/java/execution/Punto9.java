package execution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Punto9 {

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/formTest.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//PARTE A
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//PARTE B
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,1300)");
	}
}
