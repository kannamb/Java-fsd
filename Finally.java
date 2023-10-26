package Exceptionhandling;

public class trycatch {

	public static void main(String[] args) {
		 
				String a="M";
				int number;
				
			     
		 
					try {
						
						//code which is going to  throw an error
						
						number=Integer.parseInt(a);
						System.out.println("Number is "+number);
					}
					catch (Exception e) {
						//  handle exception
						
						System.out.println("Exception Occured: "+e);
					}
					
