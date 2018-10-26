package com.sophos.certification.viajesexito.questions;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.sophos.certification.viajesexito.userinterfaces.ViajesExitoConfirmationPage;
/*
 * This class contains the question that validates the correct behavior
 * of the application (Obtained answer, expected answer)
 * */
public class FlySearchResult implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(ViajesExitoConfirmationPage.FLIGHT_CONFIRMATION).
				viewedBy(actor).asList();
	}
	
	public static Question<List<String>> displayed() {
		return new FlySearchResult();
	}
}
