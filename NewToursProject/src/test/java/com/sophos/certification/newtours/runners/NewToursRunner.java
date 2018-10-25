package com.sophos.certification.newtours.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/new_tours.feature",
		tags = {"@registration"},
		glue = "com.sophos.certification.newtours.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class NewToursRunner {

}
