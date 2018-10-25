package com.sophos.certification.newtours.questions;

import java.util.List;
import com.sophos.certification.newtours.userinterfaces.NewToursComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterResult implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		// Actor actions
		return Text.of(NewToursComponent.WELCOME_TEXT).
				viewedBy(actor).asList();
	}
	
	public static Question<List<String>> displayed() {
		return new RegisterResult();
	}
}
