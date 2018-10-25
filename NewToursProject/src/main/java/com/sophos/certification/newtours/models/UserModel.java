package com.sophos.certification.newtours.models;

import java.util.ArrayList;

public class UserModel {
	
	private String userName;
	private String password;
	private String FirstName;
	private String LastName;
	private String Phone;
	private String Email;
	private String Address;
	private String Address2;
	private String City;
	private String State;
	private String PostalCode;
	private String Country;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}
	
	public String getAddress2() {
		return Address2;
	}
	
	public void setCity(String City) {
		this.City = City;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setState(String State) {
		this.State = State;
	}
	
	public String getState() {
		return State;
	}
	
	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}
	
	public String getPostalCode() {
		return PostalCode;
	}
	
	public void setCountry(String Country) {
		this.Country = Country;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public UserModel(ArrayList<String> datareq) {
		this.FirstName  = datareq.get(2);
		this.LastName   = datareq.get(3);
		this.Phone      = datareq.get(4);
		this.Email      = datareq.get(5);
		this.Address    = datareq.get(6);
		this.Address2   = datareq.get(7);
		this.City       = datareq.get(8);
		this.State      = datareq.get(9);
		this.PostalCode = datareq.get(10);
		this.Country    = datareq.get(11);
		this.userName   = datareq.get(0);
		this.password   = datareq.get(1);
	}
}


