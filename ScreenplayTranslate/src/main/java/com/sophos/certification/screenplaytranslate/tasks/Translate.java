package com.sophos.certification.screenplaytranslate.tasks;

import com.sophos.certification.screenplaytranslate.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE),
				Enter.theValue("Cheese").into
				(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA),
				Click.on(GoogleTranslatePage.TRANSLATE_BUTTON));
	}

	public static Translate the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Translate.class);
	}
	
}
