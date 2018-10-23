package common;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class Homepage extends PageObject{
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement loginButton;
	
	public void fillData(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
	}

	public void sendData() {
		loginButton.click();
	}
	
}
