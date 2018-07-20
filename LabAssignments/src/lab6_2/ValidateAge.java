package lab6_2;

public class ValidateAge {
static void validate(int age) throws InvalidAgeException
{
	if(age<15)
	{
		System.out.println();
		throw new InvalidAgeException("Age of person is below 15");
	}
}
}
