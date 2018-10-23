package com.sophos.certification.newtours.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import com.sophos.certification.newtours.userinterfaces.NewToursHomePage;
import com.sophos.certification.newtours.questions.LoginResult;
import com.sophos.certification.newtours.tasks.Access;
import com.sophos.certification.newtours.tasks.OpenTheBrowser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.hasItem;


public class NewToursStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor dante = Actor.named("Dante");
	private NewToursHomePage newToursHomePage;
	@Before
	public void setup() {
		dante.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that dante wants to log in to new tours$")
	public void thatDanteWantsToLogInToNewTours() throws Exception {
		dante.wasAbleTo(OpenTheBrowser.on(newToursHomePage));
	}

	@When("^he enter his (.*) and (.*)$")
	public void heEnterHisUserAndPassword(String user, String pass) throws Exception {
	    dante.attemptsTo(Access.in(user,pass));
	}

	@Then("^he should see the fly selection page$")
	public void heShouldSeeTheFlySelectionPage() throws Exception {
		dante.should(seeThat(LoginResult.displayed(), hasItem("ITINERARY")));
	}
}
