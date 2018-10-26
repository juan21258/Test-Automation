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
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;
/*
 * Here are the step definitions of the program, these are the methods that will
 * be executed, all this following the screenplay pattern to be human-readable.
 * There are 3 basic parts: Given,When,Then
 * */
public class NewToursStepDefinitions {
	/*In this part we establish the browser options and the actor that
	 * will execute this actions
	 * */
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor dante = Actor.named("Dante");
	private NewToursHomePage newToursHomePage;
	//This method executes before any other method
	@Before
	public void setup() {
		dante.can(BrowseTheWeb.with(hisBrowser));
	}
	//Here we open the home page that will be automated
	@Given("^that dante wants to log in to new tours$")
	public void thatDanteWantsToLogInToNewTours() throws Exception {
		dante.wasAbleTo(OpenTheBrowser.on(newToursHomePage));
	}
	//We log in with the user and password
	@When("^he enter his (.*) and (.*)$")
	public void heEnterHisUserAndPassword(String user, String pass) throws Exception {
	    dante.attemptsTo(Access.in(user,pass));
	}
	/*We validate the outcome of the question to verify the right behavior of
	the application*/
	@Then("^he should see the fly selection page$")
	public void heShouldSeeTheFlySelectionPage() throws Exception {
		dante.should(seeThat(LoginResult.displayed(), hasItem("ITINERARY")));
	}
}
