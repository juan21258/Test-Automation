package com.sophos.certification.viajesexito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
/*
 * This class contains all the mapped objects from the page
 * that the user interacts with
 * */
@DefaultUrl("https://www.viajesexito.com/vuelos")
public class ViajesExitoHomePage extends PageObject{
	//Variable for xpath in departure day
	public static final Target FLIGHT_TYPE = 
			Target.the("Flight type").located(By.id("rdAirTripTypeOW"));
	public static final Target ORIGIN_CITY = 
			Target.the("Origin city").located(By.xpath("//*[@id=\"txtAirCityFrom\"]"));
	public static final Target DESTINATION_CITY = 
			Target.the("Destination city").located(By.xpath("//*[@id=\"txtAirCityTo\"]"));
	public static final Target POP_DATE = 
			Target.the("Pop date").located(By.id("txtAirDateFrom"));
	public static final Target NEXT_MONTH = 
			Target.the("Next month").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a"));
	public static final Target FLIGHT_DATE_MONTH = 
			Target.the("Flight date month").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]"));
	public static final Target FLIGHT_DATE_YEAR = 
			Target.the("Flight date year").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[2]"));
	public static final Target FLIGHT_DATE_DAY = 
			Target.the("Flight date day").locatedBy("//div[1]/table/tbody/tr/td[contains(number(),'{0}')]");
	public static final Target PASSENGERS_POP_UP = 
			Target.the("Passengers pop up").located(By.id("airPopUpBtn"));
	public static final Target ADULTS_QTY = 
			Target.the("Adults quantity").located(By.id("btnAdtPaxPlus"));
	public static final Target KIDS_QTY = 
			Target.the("Kids quantity").located(By.id("btnChdPaxPlus"));
	public static final Target INFANTS_QTY = 
			Target.the("Infants quantity").located(By.id("btnInfPaxPlus"));
	public static final Target APPLY_BUTTON = 
			Target.the("Apply button").located(By.id("btbClosePaxPopup"));
	public static final Target SEARCH_FLY_BUTTON = 
			Target.the("Search fly button").located(By.id("btnSearchAir"));
}
