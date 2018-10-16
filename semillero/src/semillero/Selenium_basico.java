package semillero;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import semillero.GestionDatos;

public class Selenium_basico {
	public String[] WebProperty(int option) {
		String[] contenido = new String[4];
		if(option == 1){
			contenido[0] = "webdriver.chrome.driver";
			contenido[1] = "C:\\Drivers\\chromedriver.exe";
			contenido[2] = "CHROPic";
			contenido[3] = "CHROPicl";			
		}
		if(option == 2){
			contenido[0] = "webdriver.gecko.driver";
			contenido[1] = "C:\\Drivers\\geckodriver.exe";
			contenido[2] = "FoxPic";
			contenido[3] = "FoxPicl";			
		}
		if(option == 3){
			contenido[0] = "webdriver.ie.driver";
			contenido[1] = "C:\\Drivers\\IEDriverServer.exe";
			contenido[2] = "IEPic";
			contenido[3] = "IEPicl";	
		}
		return contenido;
	}
	
	public WebDriver Drivertype(int option){
		WebDriver driver = null;
		if(option == 1) {
			driver = new ChromeDriver();
		}
		if(option == 2) {
			driver = new FirefoxDriver();
		}
		if(option == 3) {
			driver = new InternetExplorerDriver();
		}	
		return driver;
	}
	
	public void Screenshot(WebDriver driver, String file) {
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourcefile, new File("C:\\Selenium\\ScreenPics\\" + file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Execution(WebDriver driver, String file, String file2) {
		GestionDatos Prueba = new GestionDatos();
		ArrayList<String> search = new ArrayList<String>();
		try {
			search = Prueba.Abrir_Excel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> mapBD = new HashMap<String, String>();
		mapBD = Prueba.Filling(search);
		int picnum = 1;
		for (Map.Entry<String, String> entry : mapBD.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		    String out = file + Integer.toString(picnum) +".png";
		    driver.get("http://newtours.demoaut.com/"); //abrir pagina
		    driver.findElement(By.name("userName")).sendKeys(entry.getKey());
			driver.findElement(By.name("password")).sendKeys(entry.getValue());
			Screenshot(driver, out);
			driver.findElement(By.name("login")).click();
			out = file2 + Integer.toString(picnum) +".png";
			Screenshot(driver, out);
			picnum++;
		}
		driver.close();
	}
}