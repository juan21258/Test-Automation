package execution;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Punto8 {

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		// Open webpage
		driver.get("https://www.wextensible.com/temas/xhtml-css/script.html#ejemplo-window");
		// Maximize browser	 
		driver.manage().window().maximize();
		//PARTE A
		WebElement calc = driver.findElement(By.linkText("calculadora"));
		calc.click();
		WebElement buttoncalc = driver.findElement(By.xpath("//*[@id=\"contenido\"]/article/div[4]/div[15]/div[3]/div[1]/input")); 
		buttoncalc.click();
		//PARTE B
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// perform operations on popup
		WebElement b1 = driver.findElement(By.xpath("//*[@id=\"calculadora\"]/input[5]"));
		b1.click();
		WebElement badd = driver.findElement(By.xpath("//*[@id=\"calculadora\"]/input[8]"));
		badd.click();
		WebElement b3 = driver.findElement(By.xpath("//*[@id=\"calculadora\"]/input[7]"));
		b3.click();
		WebElement bres = driver.findElement(By.xpath("//*[@id=\"calculadora\"]/input[26]"));
		bres.click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		//driver.close();
		buttoncalc.click();
	}
}
