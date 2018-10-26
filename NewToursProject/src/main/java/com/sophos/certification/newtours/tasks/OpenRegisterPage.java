package com.sophos.certification.newtours.tasks;

import com.sophos.certification.newtours.userinterfaces.NewToursComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
/*
 * Here we click the register link in the home page, so we can
 * access the registration page
 * */
public class OpenRegisterPage implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NewToursComponent.REGISTER_TEXT));
	}
	
	public static OpenRegisterPage in() {
		return instrumented(OpenRegisterPage.class);
	}
}
