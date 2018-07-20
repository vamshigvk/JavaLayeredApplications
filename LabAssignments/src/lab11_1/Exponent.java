package lab11_1;

public class Exponent 
{
	public static void main(String[] args) {

		ExponentInterface exp = (n1, n2) -> {
			String temp1 = "" + n1;
			String temp2 = "" + n2;

			return Math.pow(Double.parseDouble(temp1), Double.parseDouble(temp2));
		};
		System.out.println(exp.exp(9, 3));

	}

}
