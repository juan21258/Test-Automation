package execution;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Punto7 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		// Open webpage
		driver.get("http://sahitest.com/demo/index.htm");
		// Maximize browser	 
		driver.manage().window().maximize();
		//PARTE A
		driver.findElement(By.linkText("Window Open Test")).click();
		//PARTE B
		Set<String> tab_handles = driver.getWindowHandles();
	    int number_of_tabs = tab_handles.size();
	    int new_tab_index = number_of_tabs-1;
	    driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Link Test")).click();
	}
}
