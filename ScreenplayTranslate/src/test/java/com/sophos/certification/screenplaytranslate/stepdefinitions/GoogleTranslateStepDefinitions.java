package com.sophos.certification.screenplaytranslate.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophos.certification.screenplaytranslate.tasks.GoTo;
import com.sophos.certification.screenplaytranslate.tasks.OpenTheBrowser;
import com.sophos.certification.screenplaytranslate.tasks.Translate;
import com.sophos.certification.screenplaytranslate.userinterfaces.GoogleAppsComponent;
import com.sophos.certification.screenplaytranslate.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	private Actor susan = Actor.named("Susan");
	private GoogleHomePage googleHomePage;
	@Before
	public void setup() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		//Precondiciones: Estar en google translate
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
				GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
	    //Condiciones: Traducir una palabra de inglés a español
		susan.attemptsTo(Translate.the());
	}

	@Then("^she should see the word queso on the screen$")
	public void sheShouldSeeTheWordQuesoOnTheScreen() throws Exception {
	    //Consecuencias: Aparece la palabra traducida
	}
}
