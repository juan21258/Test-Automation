package code.execution;
import org.openqa.selenium.WebDriver;
import com.codoid.products.exception.FilloException;
import code.execution.RequiredParams;

public class MainExecution {

	public static void main(String[] args) throws FilloException {
		RequiredParams Webuse = new RequiredParams();
		String[] temp = Webuse.WebProperty();
		System.setProperty(temp[0],temp[1]);
		WebDriver driver = Webuse.Drivertype();
		Webuse.Execution(driver, temp[2],temp[3]);
	}
}