package lab11_2;

public class Lambda
{
	public static void main(String[] args) {

		LambdaInterface lm = (str) -> {
			String temp = "";
			for (int i = 0; i < str.length(); i++) {
				temp = temp + str.charAt(i) + " ";

			}
			return temp;
		};
		System.out.println(lm.modifyString("vamshi"));
	}
}
