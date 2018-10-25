package com.sophos.certification.viajesexito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.viajesexito.com/vuelos")
public class ViajesExitoHomePage extends PageObject{
	//Components
	public static final Target FLIGHT_TYPE = 
			Target.the("Flight type").located(By.id("rdAirTripTypeOW"));
	public static final Target ORIGIN_CITY = 
			Target.the("Origin city").located(By.xpath("//*[@id=\"txtAirCityFrom\"]"));
	public static final Target DESTINATION_CITY = 
			Target.the("Destination city").located(By.xpath("//*[@id=\"txtAirCityTo\"]"));
	public static final Target FLIGHT_DATE = 
			Target.the("Flight date").located(By.id("txtAirDateFrom"));
	public static final Target PASSENGERS_POP_UP = 
			Target.the("Passengers pop up").located(By.id("airPopUpBtn"));
	public static final Target ADULTS_QTY = 
			Target.the("Adults quantity").located(By.id("paxAdtQuantity"));
	public static final Target KIDS_QTY = 
			Target.the("Kids quantity").located(By.id("paxChdQuantity"));
	public static final Target INFANTS_QTY = 
			Target.the("Infants quantity").located(By.id("paxInfQuantity"));
	public static final Target APPLY_BUTTON = 
			Target.the("Apply button").located(By.id("btbClosePaxPopup"));
	public static final Target SEARCH_FLY_BUTTON = 
			Target.the("Search fly button").located(By.id("btnSearchAir"));
	public static final Target DEFAULT_DATE = 
			Target.the("Default date").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]"));
}
