package com.sophos.certification.viajesexito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;
import com.sophos.certification.viajesexito.exceptions.InvalidOption;
import com.sophos.certification.viajesexito.questions.FlySearchResult;
import com.sophos.certification.viajesexito.userinterfaces.ViajesExitoTicketPage;
/*
 * In this this case we pass the flight option argument as a
 * parameter to an xpath, so we can choose any available object according
 * to the user needs
 * */
public class TicketSelection implements Task{
	
	private String flightoption;
	
	public TicketSelection(String flightoption) {
		this.flightoption = flightoption;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ViajesExitoTicketPage
				.FLIGHT_OPTION.of(flightoption)));
		actor.should(seeThat(FlySearchResult.displayed(),
				hasItem("(Clic para ver el adjunto)"))
				.orComplainWith(InvalidOption.class));
	}
	
	public static TicketSelection in(String flightoption) {
		return instrumented(TicketSelection.class, flightoption);
	}
}
