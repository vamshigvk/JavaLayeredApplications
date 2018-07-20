package lab2_5;

	import java.util.Scanner;

	public class Gender{
		Scanner sc=new Scanner(System.in);
		String firstName;
		String lastName;
		//char gender;
		String phoneNo;
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
		/*//public char getGender() {
			return gender;
		}
		//public void setGender(char gender) {
			this.gender = gender;
		}
		//enum gen{
			M,F;
		}*/
		enum gender{
			M,F;
		}
		public String phone(){
			System.out.println("Enter Phone number: ");
			phoneNo=sc.next();
			return phoneNo;
			
		}
		public void display() {
			System.out.println("Person Details:"+"\n___________"+ "\n" + "\nFirstName: " + firstName + "\nLastName: " + lastName
						+ "\nphoneNo: " +phoneNo);
			
		}
		public Gender(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			
		}
		public Gender() {
			super();
			firstName="xxxxx";
			lastName="xxxx";

	}

	}
