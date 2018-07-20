package com.capgemini.core.cbs.beans;

public class GasAgency 
{
private String agencyName;
private String location;
private int cylinderCount;

public String getAgencyName() {
	return agencyName;
}

public void setAgencyName(String agencyName) {
	this.agencyName = agencyName;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public int getCylinderCount() {
	return cylinderCount;
}
public void setCylinderCount(int cylinderCount) {
	this.cylinderCount = cylinderCount;
}

public GasAgency(int cylinderCount) {
	super();
	this.cylinderCount = cylinderCount;
}

public GasAgency(String agencyName) {
	super();
	this.agencyName = agencyName;
}

public GasAgency() {
	super();
}

public GasAgency(String agencyName, String location, int cylinderCount) {
	super();
	this.agencyName = agencyName;
	this.location = location;
	this.cylinderCount = cylinderCount;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((agencyName == null) ? 0 : agencyName.hashCode());
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
	GasAgency other = (GasAgency) obj;
	if (agencyName == null) {
		if (other.agencyName != null)
			return false;
	} else if (!agencyName.equals(other.agencyName))
		return false;
	return true;
}

@Override
public String toString() 
{
	return  agencyName+"\t" +"\t" +  location+"\t" +"\t"  + cylinderCount ;
}

}
