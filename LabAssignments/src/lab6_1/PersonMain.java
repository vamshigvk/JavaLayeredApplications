package lab6_1;

public class PersonMain {
	public static void main(String[] args) {
		Person p1= new Person("","" , "MALE");
		ValidateFirstAndLastName vfl=new ValidateFirstAndLastName();
	try
		{
		vfl.validate(p1.getFirstName(), p1.getLastName());
		}
	catch(Exception exception)
	{
		System.out.println("Exception occured:"+ exception);
	
	}
		System.out.println(p1);
}
	
}
