package com.sophos.certification.newtours.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.sophos.certification.newtours.models.UserModel;
import com.sophos.certification.newtours.userinterfaces.NewToursRegisterPage;
/*
 * This class registers the user according to the data provided by the 
 * user model, 
 * */
public class Register implements Task {
	
	private UserModel userModel;

	public Register(UserModel userModel) {
		this.userModel = userModel;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		//Fill the required information
		actor.attemptsTo(Enter.theValue(userModel.getFirstName())
				.into(NewToursRegisterPage.FIRST_NAME),
				Enter.theValue(userModel.getLastName())
				.into(NewToursRegisterPage.LAST_NAME),
				Enter.theValue(userModel.getPhone())
				.into(NewToursRegisterPage.PHONE),
				Enter.theValue(userModel.getEmail())
				.into(NewToursRegisterPage.EMAIL),
				Enter.theValue(userModel.getAddress())
				.into(NewToursRegisterPage.ADDRESS),
				Enter.theValue(userModel.getAddress2())
				.into(NewToursRegisterPage.ADDRESS2),
				Enter.theValue(userModel.getCity())
				.into(NewToursRegisterPage.CITY),
				Enter.theValue(userModel.getState())
				.into(NewToursRegisterPage.STATE),
				Enter.theValue(userModel.getPostalCode())
				.into(NewToursRegisterPage.POSTAL_CODE),
				SelectFromOptions.byVisibleText(userModel.getCountry()).
				from(NewToursRegisterPage.COUNTRY),
				Enter.theValue(userModel.getUserName())
				.into(NewToursRegisterPage.USER),
				Enter.theValue(userModel.getPassword())
				.into(NewToursRegisterPage.PASSWORD),
				Enter.theValue(userModel.getPassword())
				.into(NewToursRegisterPage.CONFIRM_PASSWORD),
				Click.on(NewToursRegisterPage.REGISTER_BUTTON));
	}

	public static Register with(UserModel userModel) {
		// TODO Auto-generated method stub
		return instrumented(Register.class,userModel);
	}

}
