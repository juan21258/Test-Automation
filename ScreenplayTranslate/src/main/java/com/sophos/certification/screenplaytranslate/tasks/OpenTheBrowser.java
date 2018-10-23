package com.sophos.certification.screenplaytranslate.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.sophos.certification.screenplaytranslate.userinterfaces.GoogleHomePage;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn(new GoogleHomePage()));
	}

	public static OpenTheBrowser on(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(OpenTheBrowser.class,page);
	}
	
}
