package lab2_4;

public class PersonMain {
	private String firstName;
	private String lastName;
	private char Gender;
	private String phonenumber;
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public PersonMain(){System.out.println("Default constructor called");}
	public PersonMain(String firstName,String lastName,char Gender){
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
	public void phonenumber()
	{}
	public void printdetails()
	{System.out.println("First name"+getFirstName());
	System.out.println("Last name"+getLastName());
	System.out.println("Gender"+getGender());
	System.out.println("phonenumber"+getPhonenumber());

	}



}
