package com.sophos.certification.viajesexito.models;
/*
 * This class contains the getters and setters for all the values of the
 * user, this values are obtained from the feature file
 */
public class PassengerModel {
	private String originCity;
	private String destCity;
	private String departureDay;
	private String departureMonth;
	private String departureYear;
	private int adults;
	private int kids;
	private int infants;
	
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}
	
	public String getOriginCity() {
		return originCity;
	}
	
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	
	public String getDestCity() {
		return destCity;
	}
	
	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}
	
	public String getDepartureDay() {
		return departureDay;
	}
	
	public void setDepartureMonth(String departureMonth) {
		this.departureMonth = departureMonth;
	}
	
	public String getDepartureMonth() {
		return departureMonth;
	}
	
	public void setDepartureYear(String departureYear) {
		this.departureYear = departureYear;
	}
	
	public String getDepartureYear() {
		return departureYear;
	}
	
	public void setAdults(int adults) {
		this.adults = adults;
	}
	
	public int getAdults() {
		return adults;
	}
	
	public void setKids(int kids) {
		this.kids = kids;
	}
	
	public int getKids() {
		return kids;
	}
	
	public void setInfants(int infants) {
		this.infants = infants;
	}
	
	public int getInfants() {
		return infants;
	}
	
	public PassengerModel(String originCity, String destCity, String departureDay,
			String departureMonth, String departureYear,
			int adults, int kids, int infants) {
		this.originCity = originCity;
		this.destCity = destCity;
		this.departureDay = departureDay;
		this.departureMonth = departureMonth;
		this.departureYear = departureYear;
		this.adults = adults;
		this.kids = kids;
		this.infants = infants;
	}
}
