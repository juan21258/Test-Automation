package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import seleniumPages.LoginSteps;

public class stepDefsLogin {
	@Steps
	LoginSteps login;
	
	@Given("^The new tours page$")
	public void the_new_tours_page() {
	    login.openHome();
	}

	@When("^I fill the user and password field$")
	public void i_fill_the_user_and_password_field() {
	    login.fillData();
	}

	@When("^Click the submit button$")
	public void click_the_submit_button() {
	    login.sendData();
	}

	@Then("^I access to a new page$")
	public void i_access_to_a_new_page() {
		System.out.println("SUCCESS");
	}
}