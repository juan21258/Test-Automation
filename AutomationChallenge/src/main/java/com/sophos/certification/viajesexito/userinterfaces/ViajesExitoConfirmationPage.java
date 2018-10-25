package com.sophos.certification.viajesexito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ViajesExitoConfirmationPage {
	public static final Target FLIGHT_CONFIRMATION = Target.the("Flight confirmation").located(By.xpath("//*[@id=\"divTermsAndConditionsText\"]/ul/li[1]/a"));
}
