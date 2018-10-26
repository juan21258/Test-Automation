package com.sophos.certification.newtours.runners;

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
		features = "src/test/resources/features/new_tours.feature",
		tags = {"@registration"},
		glue = "com.sophos.certification.newtours.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class NewToursRunner {

}
