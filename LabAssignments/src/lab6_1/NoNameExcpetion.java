package lab6_1;

public class NoNameExcpetion extends Exception {

	public NoNameExcpetion(String string) {
		super(string);
		
	}

	public String toString()
	{
		return "No firstname and lastname has been entered";
	}
	

}
