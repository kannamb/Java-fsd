package Exceptionhandling;

public class Throw {
	static void check(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not a Valid Age Exeception");
		else
			System.out.println("Valid Age for Voting");
	}
  public static void main(String[] args) {
		try {
			 check(13);
		} catch (ArithmeticException e) {
			//  handle exception
			System.out.println("Error: "+e);
		}
	}
}
