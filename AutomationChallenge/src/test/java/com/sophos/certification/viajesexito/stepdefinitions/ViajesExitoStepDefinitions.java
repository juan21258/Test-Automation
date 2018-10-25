package com.sophos.certification.viajesexito.stepdefinitions;

import org.openqa.selenium.WebDriver;

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
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ViajesExitoStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor dante = Actor.named("Dante");
	private ViajesExitoHomePage viajesExitoHomePage;
	@Before
	public void setup() {
		dante.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^That dante is in the flights page$")
	public void thatDanteIsInTheFlightsPage() throws Exception {
		dante.wasAbleTo(OpenTheBrowser.on(viajesExitoHomePage));
	}


	@Given("^He selects the (.*),(.*),(.*) and number of (\\d+),(\\d+) and (\\d+)$")
	public void heSelectsTheMedellinPragaAndNumberOfAnd(String originCity,String destCity ,String departureDate, String adults, String kids, String infants) throws Exception {
	    dante.wasAbleTo(FlightSelection.in(originCity,destCity,departureDate, adults, kids, infants));
	}

	@When("^Dante choose the (.*)$")
	public void danteChooseTheFlight(String flightoption) throws Exception {
		dante.attemptsTo(TicketSelection.in(flightoption));
	}

	@Then("^He should get a ticket confirmation$")
	public void heShouldGetATicketConfirmation() throws Exception {
		dante.should(seeThat(FlySearchResult.displayed(),
				hasItem("(Clic para ver el adjunto)")));
	}
	
}