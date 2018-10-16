package semillero;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import semillero.Selenium_basico;

public class Principal_Ejecucion {
	public static void main(String[] args) {
		Selenium_basico Webuse = new Selenium_basico();
		int option;
		Scanner reader = new Scanner(System.in);
		System.out.println("Presione 1 Para Chrome, 2 para Firefox y 3 para Internet Explorer");
		option = reader.nextInt();
		reader.close();
		String[] temp = Webuse.WebProperty(option);
		System.setProperty(temp[0],temp[1]);
		WebDriver driver = Webuse.Drivertype(option);
		Webuse.Execution(driver, temp[2],temp[3]);
	}
}