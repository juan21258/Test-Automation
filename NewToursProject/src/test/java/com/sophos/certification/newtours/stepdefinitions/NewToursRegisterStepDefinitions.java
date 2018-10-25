package com.sophos.certification.newtours.stepdefinitions;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import com.sophos.certification.newtours.models.UserModel;
import com.sophos.certification.newtours.questions.RegisterResult;
import com.sophos.certification.newtours.tasks.OpenRegisterPage;
import com.sophos.certification.newtours.tasks.OpenTheBrowser;
import com.sophos.certification.newtours.tasks.Register;
import com.sophos.certification.newtours.userinterfaces.NewToursHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.hasItem;

public class NewToursRegisterStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor dante = Actor.named("Dante");
	private NewToursHomePage newToursHomePage;
	ArrayList<String> datareq = new ArrayList<String>();
	
	@Before
	public void setup() {
		dante.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that dante is in the registration page$")
	public void thatDanteIsInTheRegistrationPageWithHisAndQwerty() throws Exception {
		dante.wasAbleTo(OpenTheBrowser.on(newToursHomePage), OpenRegisterPage.in());
	}

	@When("^dante fills the required information$")
	public void danteFillsTheRequiredInformation(DataTable userCredentials) throws Exception {
	    for (String item : userCredentials.asList(String.class)) {
			datareq.add(item);
		}
	    UserModel userModel = new UserModel(datareq);
	    dante.attemptsTo(Register.with(userModel));
	}

	@Then("^he should see a confirmation message$")
	public void heShouldSeeAConfirmationMessage() throws Exception {
		dante.should(seeThat(RegisterResult.displayed(),
				hasItem("Dear " + datareq.get(2) + " " + datareq.get(3) + ",")));
	}
}
