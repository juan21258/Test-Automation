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
/*
 * Here are the step definitions of the program, these are the methods that will
 * be executed, all this following the screenplay pattern to be human-readable.
 * There are 3 basic parts: Given,When,Then
 * */
public class NewToursRegisterStepDefinitions {
	/*In this part we establish the browser options and the actor that
	 * will execute this actions
	 * */
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor dante = Actor.named("Dante");
	private NewToursHomePage newToursHomePage;
	ArrayList<String> datareq = new ArrayList<String>();
	//This method executes before any other method
	@Before
	public void setup() {
		dante.can(BrowseTheWeb.with(hisBrowser));
	}
	/*Here we open the home page that will be automated, and head to
	 *the registration page
	 * */
	@Given("^that dante is in the registration page$")
	public void thatDanteIsInTheRegistrationPageWithHisAndQwerty() throws Exception {
		dante.wasAbleTo(OpenTheBrowser.on(newToursHomePage), OpenRegisterPage.in());
	}
	/*In this method we obtain the data provided in the datatable and pass it
	 * to an arraylist, after that we pass the required data to the user model
	 * */
	@When("^dante fills the required information$")
	public void danteFillsTheRequiredInformation(DataTable userCredentials) throws Exception {
	    for (String item : userCredentials.asList(String.class)) {
			datareq.add(item);
		}
	    UserModel userModel = new UserModel(datareq);
	    dante.attemptsTo(Register.with(userModel));
	}
	/*We validate the outcome of the question to verify the right behavior of
	the application*/
	@Then("^he should see a confirmation message$")
	public void heShouldSeeAConfirmationMessage() throws Exception {
		dante.should(seeThat(RegisterResult.displayed(),
				hasItem("Dear " + datareq.get(2) + " " + datareq.get(3) + ",")));
	}
}
