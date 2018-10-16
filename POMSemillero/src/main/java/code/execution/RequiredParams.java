package code.execution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.codoid.products.exception.FilloException;

import code.execution.SQLData;

public class RequiredParams {
	
	public String[] WebProperty() {
		String[] contenido = new String[4];
		contenido[0] = "webdriver.chrome.driver";
		contenido[1] = "C:\\Drivers\\chromedriver.exe";
		contenido[2] = "CHROPic";
		contenido[3] = "CHROPicl";	
		return contenido;
	}
	
	public WebDriver Drivertype(){
		WebDriver driver = null;
		driver = new ChromeDriver();	
		return driver;
	}
	
	public void Screenshot(WebDriver driver, String file) {
		File sourcefile = ((TakesScreenshot)driver).
				getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourcefile,
					new File("C:\\Selenium\\ScreenPics\\" + file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Execution(WebDriver driver, String file, String file2) 
			throws FilloException {
		SQLData info = new SQLData();
		VariablesForm fields = new VariablesForm();
		ArrayList<String> data = info.ObtainData();
		String[] names = fields.vars();
		int picnum = 1;
		for(int a = 0; a < (data.size()/12); a++) {
			driver.get("http://newtours.demoaut.com/"); //abrir pagina
			driver.findElement(By.linkText("REGISTER")).click();
			for(int b = 0; b < 9; b++) {
				String temp = names[b];
				int pos = (b+2) + (12*a);
				driver.findElement(By.name(temp)).sendKeys(data.get(pos));
			}
			Select dropdown = 
					new Select(driver.findElement(By.name("country")));
			int posdrop = 11+(12*a);
			System.out.println(data.get(posdrop));
			dropdown.selectByVisibleText(data.get(posdrop));
			driver.findElement(By.id("email")).sendKeys(data.get(a*12));
			driver.findElement(By.name("password")).
			sendKeys(data.get(a*12 + 1));
			driver.findElement(By.name("confirmPassword")).
			sendKeys(data.get(a*12 + 1));
			driver.findElement(By.name("register")).click();
		}
		for (int i = 0; i < data.size();i = i+12) {
		    String out = file + Integer.toString(picnum) +".png";
		    driver.get("http://newtours.demoaut.com/"); //abrir pagina
		    driver.findElement(By.name("userName")).
		    sendKeys(data.get(i));
			driver.findElement(By.name("password")).
			sendKeys(data.get(i+1));
			Screenshot(driver, out);
			driver.findElement(By.name("login")).click();
			out = file2 + Integer.toString(picnum) +".png";
			Screenshot(driver, out);
			picnum++;
		}
		driver.close();
	}
}