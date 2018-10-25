package com.sophos.certification.newtours.tasks;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;
import com.sophos.certification.newtours.exceptions.StartException;
import com.sophos.certification.newtours.questions.OpenResult;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	@Step("{0} opens the browser on New tours Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn(page));
		actor.should(seeThat(OpenResult.displayed(), hasItem("REGISTER"))
				.orComplainWith(StartException.class));
	}

	public static OpenTheBrowser on(PageObject page) {
		
		return instrumented(OpenTheBrowser.class,page);
	}
}
