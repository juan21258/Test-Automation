package com.sophos.certification.viajesexito.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.sophos.certification.viajesexito.models.PassengerModel;
import com.sophos.certification.viajesexito.questions.FlySearchResult;
import com.sophos.certification.viajesexito.tasks.FlightSelection;
import com.sophos.certification.viajesexito.tasks.OpenTheBrowser;
import com.sophos.certification.viajesexito.tasks.TicketSelection;
import com.sophos.certification.viajesexito.userinterfaces.ViajesExitoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
/*
 * Here are the step definitions of the program, these are the methods that will
 * be executed, all this following the screenplay pattern to be human-readable.
 * There are 3 basic parts: Given,When,Then
 * */
public class ViajesExitoStepDefinitions {
	/*In this part we establish the browser options and the actor that
	 * will execute this actions
	 * */
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor dante = Actor.named("Dante");
	private ViajesExitoHomePage viajesExitoHomePage;
	//This method executes before any other method
	@Before
	public void setup() {
		dante.can(BrowseTheWeb.with(hisBrowser));
	}
	//Here we open the home page that will be automated
	@Given("^That dante is in the flights page$")
	public void thatDanteIsInTheFlightsPage() throws Exception {
		dante.wasAbleTo(OpenTheBrowser.on(viajesExitoHomePage));
	}
	/*in this method we receive the values from the feature, so
	 * we can initiate the model and execute the flight selection*/
	@Given("^He selects the (.*),(.*),(.*),(.*),(.*) and number of (\\d+),(\\d+) and (\\d+)$")
	public void heSelectsTheMedellinPragaAndNumberOfAnd(String originCity,String destCity ,String departureDay,
			String departureMonth, String departureYear, int adults, int kids, int infants) throws Exception {
		PassengerModel passenger = new PassengerModel(originCity, destCity, departureDay, departureMonth,
				departureYear,adults, kids, infants);
		dante.wasAbleTo(FlightSelection.in(passenger));
	}
	//This is the assert to verify the right behavior of the program
	@When("^Dante choose the (.*)$")
	public void danteChooseTheFlight(String flightoption) throws Exception {
		dante.attemptsTo(TicketSelection.in(flightoption));
	}
	/*We validate the outcome of the question to verify the right behavior of
	the application*/
	@Then("^He should get a ticket confirmation$")
	public void heShouldGetATicketConfirmation() throws Exception {
		dante.should(seeThat(FlySearchResult.displayed(),
				hasItem("(Clic para ver el adjunto)")));
	}
	
}