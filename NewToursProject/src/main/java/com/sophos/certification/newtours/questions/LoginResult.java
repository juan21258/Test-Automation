package com.sophos.certification.newtours.questions;

import java.util.List;
import com.sophos.certification.newtours.userinterfaces.NewToursRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
/*
 * This is a question that verifies the right behavior of the login task
 * it executes the following method (received value,expected value) 
 * */
public class LoginResult implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		
		return Text.of(NewToursRegisterPage.ITINERARY).
				viewedBy(actor).asList();
	}
	
	public static Question<List<String>> displayed() {
		return new LoginResult();
	}
	
}
