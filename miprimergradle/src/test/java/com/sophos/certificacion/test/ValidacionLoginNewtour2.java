package com.sophos.certificacion.test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ValidacionLoginNewtour2 {
	public void Screenshot(WebDriver driver, String file) {
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourcefile, new File("C:\\Selenium\\ScreenPics\\" + file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		//iniciar chrome
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/"); //abrir pagina
	}

	@After
	public void tearDown() throws Exception {
		//cerrar
		driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.name("userName")).sendKeys("carlos");
		driver.findElement(By.name("password")).sendKeys("123");
		Screenshot(driver, "TestIE.png");
		driver.findElement(By.name("login")).click();
		Screenshot(driver, "Test2IE.png");
	}
}