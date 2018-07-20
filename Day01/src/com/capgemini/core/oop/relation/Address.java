package com.capgemini.core.oop.relation;

public class Address 
{
	private String apartmentName;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public Address() {
		super();
	}

	public Address(String apartmentName, String city, String state, String country, int pincode) {
		super();
		this.apartmentName = apartmentName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
