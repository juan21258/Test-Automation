package com.sophos.certification.viajesexito.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/viajes_exito.feature",
		tags = {"@TravelSelection"},
		glue = "com.sophos.certification.viajesexito.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class ViajesExitoRunner {

}
