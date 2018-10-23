package com.sophos.certification.newtours.questions;

import java.util.List;

import com.sophos.certification.newtours.userinterfaces.NewToursFlyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginResult implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		
		return Text.of(NewToursFlyPage.FLY_TYPE).
				viewedBy(actor).asList();
	}
	
	public static Question<List<String>> displayed() {
		return new LoginResult();
	}
	
}
