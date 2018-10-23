package com.sophos.certification.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursComponent {
	public static final Target NEWTOURS_USER = 
			Target.the("New tours login user").located(By.name("userName"));
	public static final Target NEWTOURS_PASS = 
			Target.the("New tours login password").located(By.name("password"));
	public static final Target NEWTOURS_SUBMIT = 
			Target.the("New tours submit button").located(By.name("login"));
}
