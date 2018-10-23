package seleniumPages;

import common.Homepage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	//Data
	Homepage page;
	String user = "Karolina";
	String pass = "ace";
	
	@Step
	public void openHome() {
		page.open();
	}
	
	@Step
	public void fillData() {
		page.fillData(user, pass);
	}
	
	@Step
	public void sendData() {
		page.sendData();
	}
	
}