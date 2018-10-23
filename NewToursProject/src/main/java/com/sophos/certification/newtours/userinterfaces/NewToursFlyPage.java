package com.sophos.certification.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursFlyPage {
	public static final Target FLY_TYPE = 
			Target.the("Fly type").located(By.linkText("ITINERARY"));
}
