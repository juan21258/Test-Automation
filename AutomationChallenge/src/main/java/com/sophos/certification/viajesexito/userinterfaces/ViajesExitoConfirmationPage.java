package com.sophos.certification.viajesexito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
/*
 * Here we target the object that will be used as reference for the 
 * FlySearchResult question, if this object is displayed in the web page
 * it means that everything went as expected
 * */
public class ViajesExitoConfirmationPage {
	public static final Target FLIGHT_CONFIRMATION = Target.the("Flight confirmation").located(By.xpath("//*[@id=\"divTermsAndConditionsText\"]/ul/li[1]/a"));
}
