package com.capgemini.core.beans;

public class Enquiry 
{

	public Enquiry() {
		super();
	}
	
	public Enquiry(String firstName, String lastName, String gender, String technologyInterested, int enquiryID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.technologyInterested = technologyInterested;
		this.enquiryID = enquiryID;
	}

	public Enquiry(int enquiryID) {
		super();
		this.enquiryID = enquiryID;
	}

	String firstName;
	String lastName;
	String gender;
	String technologyInterested;
	int enquiryID;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTechnologyInterested() {
		return technologyInterested;
	}
	public void setTechnologyInterested(String technologyInterested) {
		this.technologyInterested = technologyInterested;
	}
	public int getEnquiryID() {
		return enquiryID;
	}
	public void setEnquiryID(int enquiryID) {
		this.enquiryID = enquiryID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + enquiryID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enquiry other = (Enquiry) obj;
		if (enquiryID != other.enquiryID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  firstName  + lastName + gender + technologyInterested + enquiryID ;
	}
	
}
