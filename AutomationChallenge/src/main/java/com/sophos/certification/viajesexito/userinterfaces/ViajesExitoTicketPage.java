package com.sophos.certification.viajesexito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
/*
 * Here we map the target used to select the desired flight option by the user with
 * a dynamic argument as option
 * */
public class ViajesExitoTicketPage {
	//Generate selection
	public static Target FLIGHT_OPTION = 
			Target.the("Flight confirmation").locatedBy("//*[@id=\"divAirResults\"]/div[{0}]/div/div/div[2]/div/div[2]/div[2]/div/input");
}