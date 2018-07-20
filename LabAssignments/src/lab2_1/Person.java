package lab2_1;

public class Person {
	private String firstName;
	private String lastName;
	private char Gender;
	
	public Person(){System.out.println("Default constructor called");}
	public Person(String firstName,String lastName,char Gender){
		this.firstName=firstName;
		this.lastName=lastName;
		this.Gender=Gender;

	}
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
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	public void printdetails()
	{System.out.println("First name"+getFirstName());
	System.out.println("Last name"+getLastName());
	System.out.println("Gender"+getGender());

	}


}
