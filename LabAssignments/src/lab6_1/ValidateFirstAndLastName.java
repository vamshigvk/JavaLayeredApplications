package lab6_1;

public class ValidateFirstAndLastName {

	static void validate(String firstName,String lastName) throws NoNameExcpetion
	{
	if(firstName=="" && lastName=="")	
	{
		System.out.println();
		throw new NoNameExcpetion("No Name has been entered");
	}
	else
		System.out.println("Entered name is:"+ firstName+ lastName);
	}
	
}
