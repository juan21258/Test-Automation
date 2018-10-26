package com.sophos.certification.viajesexito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;
import com.sophos.certification.viajesexito.models.PassengerModel;
import com.sophos.certification.viajesexito.userinterfaces.ViajesExitoHomePage;
/*
 * This is the first method or action that is executed in the application,
 * in this class we obtain the values from the model and pass this values
 * as arguments in different methods. We click and select dates, quantity of
 * Adults, Kids and infants for the flight.
 * */
public class FlightSelection implements Task{
	
	private PassengerModel passenger; //model
	/*Actual month and year, used to compare the calendar month and year
	with the desired month and year values*/
	static String actualMonth;
	static String actualYear;
	//Instance of the class that receives the model
	public FlightSelection(PassengerModel passenger) {
		this.passenger = passenger;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ViajesExitoHomePage.FLIGHT_TYPE),
		Enter.theValue(passenger.getOriginCity()).
		into(ViajesExitoHomePage.ORIGIN_CITY).thenHit(Keys.RETURN),
		Enter.theValue(passenger.getDestCity()).
		into(ViajesExitoHomePage.DESTINATION_CITY).thenHit(Keys.RETURN));
		actor.attemptsTo(Click.on(ViajesExitoHomePage.POP_DATE));
		actualMonth=Text.of(ViajesExitoHomePage.FLIGHT_DATE_MONTH).viewedBy(actor).asString();
		actualYear=Text.of(ViajesExitoHomePage.FLIGHT_DATE_YEAR).viewedBy(actor).asString();
		while(!(actualMonth.equalsIgnoreCase(passenger.getDepartureMonth())
				&& actualYear.equalsIgnoreCase(passenger.getDepartureYear()))) {
			actor.attemptsTo(Click.on(ViajesExitoHomePage.NEXT_MONTH));
			//Refresh the month and year values after each click in the calendar
			actualMonth=Text.of(ViajesExitoHomePage.FLIGHT_DATE_MONTH).viewedBy(actor).asString();
			actualYear=Text.of(ViajesExitoHomePage.FLIGHT_DATE_YEAR).viewedBy(actor).asString();
		}
		actor.attemptsTo(Click.on(ViajesExitoHomePage.FLIGHT_DATE_DAY.of(passenger.getDepartureDay())));
		actor.attemptsTo(Click.on(ViajesExitoHomePage.PASSENGERS_POP_UP));
		for(int i = 0; i < passenger.getAdults() - 1;i++) {
			actor.attemptsTo(Click.on(ViajesExitoHomePage.ADULTS_QTY));
		}
		for(int i = 0; i < passenger.getKids();i++) {
			actor.attemptsTo(Click.on(ViajesExitoHomePage.KIDS_QTY));
		}
		for(int i = 0; i < passenger.getInfants();i++) {
			actor.attemptsTo(Click.on(ViajesExitoHomePage.INFANTS_QTY));
		}
		actor.attemptsTo(Click.on(ViajesExitoHomePage.APPLY_BUTTON),
				Click.on(ViajesExitoHomePage.SEARCH_FLY_BUTTON));
	}
	
	public static FlightSelection in(PassengerModel passenger) {
		return instrumented(FlightSelection.class,passenger);
	}
}
