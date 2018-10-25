package com.sophos.certification.viajesexito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;
import com.sophos.certification.viajesexito.userinterfaces.ViajesExitoHomePage;

public class FlightSelection implements Task{
	
	private String originCity;
	private String destCity;
	private String departureDate;
	private String adults;
	private String kids;
	private String infants;
	
	public FlightSelection(String originCity, String destCity, String departureDate, 
			String adults, String kids, String infants) {
		this.originCity = originCity;
		this.destCity = destCity;
		this.departureDate = departureDate;
		this.adults = adults;
		this.kids = kids;
		this.infants = infants;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		//,Enter.theValue(departureDate).into(ViajesExitoHomePage.FLIGHT_DATE)
		
		actor.attemptsTo(Click.on(ViajesExitoHomePage.FLIGHT_TYPE),
				Enter.theValue(originCity).
				into(ViajesExitoHomePage.ORIGIN_CITY).thenHit(Keys.RETURN),
				Enter.theValue(destCity).
				into(ViajesExitoHomePage.DESTINATION_CITY).thenHit(Keys.RETURN),
				Click.on(ViajesExitoHomePage.DEFAULT_DATE),
				Click.on(ViajesExitoHomePage.PASSENGERS_POP_UP),
				Click.on(ViajesExitoHomePage.APPLY_BUTTON),
				Click.on(ViajesExitoHomePage.SEARCH_FLY_BUTTON));		
	}
	
	public static FlightSelection in(String originCity, String destCity,
			String departureDate, String adults, String kids, String infants) {
		return instrumented(FlightSelection.class,originCity,destCity,
				departureDate,adults,kids,infants);
	}
}
