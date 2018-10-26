package com.sophos.certification.newtours.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.sophos.certification.newtours.userinterfaces.NewToursComponent;
import static net.serenitybdd.screenplay.Tasks.instrumented;
/*
 * This class receives the user and password of the actor that will be
 * logging in the web page
 * */
public class Access implements Task {
	
	private String user;
	private String pass;
	
	public Access(String user,String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// Actions executed by the actor
		actor.attemptsTo(Enter.theValue(user).
				into(NewToursComponent.NEWTOURS_USER),
				Enter.theValue(pass).into(NewToursComponent.NEWTOURS_PASS),
				Click.on(NewToursComponent.NEWTOURS_SUBMIT));
	}

	public static Access in(String user, String pass) {
		return instrumented(Access.class,user,pass);
	}
}
