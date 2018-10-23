package com.sophos.certification.screenplaytranslate.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.certification.screenplaytranslate.userinterfaces.GoogleAppsComponent;

public class GoTo implements Task{

	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
		Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class,googleApp);
	}

}
