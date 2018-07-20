package lab6_2;

public class InvalidAgeException extends Exception {
public InvalidAgeException(String string)
{
	super(string);
}
public String toString()
{
	return "Age of a person is not above 15";
}
}
