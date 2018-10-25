package com.sophos.certification.viajesexito.userinterfaces;

import com.sophos.certification.viajesexito.tasks.TicketSelection;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ViajesExitoTicketPage {
	//Generate selection
	public static String flightOption = TicketSelection.flightoption;
	
	static String location = "//*[@id=\"divAirResults\"]/div[" +
	ViajesExitoTicketPage.flightOption +
	"]/div/div/div[2]/div/div[2]/div[2]/div/input";
	
	public static Target FLIGHT_OPTION = 
			Target.the("Flight confirmation").located(By.xpath(location));
}