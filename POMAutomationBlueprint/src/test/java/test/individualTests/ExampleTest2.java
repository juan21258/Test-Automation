package test.individualTests;

import pages.ExamplePage;
import helpers.DriverOptions;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest2 {
	
	ExamplePage page = new ExamplePage();
	DriverOptions driverOptions = new DriverOptions();
	
	@Test
	public void testOneFileTwo() {
		System.setProperty(driverOptions.getChromeKey(),
				driverOptions.getChromeValue());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(page.getWebpage());
		driver.quit();
	}
}
