package com.sophos.certification.viajesexito.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
/*
 * This is the runner of the project, here we execute the application, with
 * the required parameters, and file sources; it will executed the specified
 * tag in the options
 * */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/viajes_exito.feature",
		tags = {"@TravelSelection"},
		glue = "com.sophos.certification.viajesexito.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class ViajesExitoRunner {

}
