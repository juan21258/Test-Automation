package com.sophos.certification.screenplaytranslate.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/google_translate.feature", 
		glue = "com.sophos.certification.screenplaytranslate.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class GoogleTranslateRunner {

}
