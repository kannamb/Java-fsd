package com.PracticeProject;
import java.util.ArrayList;
import java.util.Scanner;
public class EmailValidation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		ArrayList<String> list=new ArrayList<String>();
		list.add("raghav@gmail.com");
		list.add("ajay@gmail.com");
		list.add("paveen@gmail.com");
		list.add("deepak@gmail.com");
		System.out.println(list);
		System.out.println("Enter the email?");	
		Scanner sc =new Scanner(System.in);
		String input=sc.next();
		
		for( int i=0;i<list.size();i++) {
        if(list.contains(input)) {
        	System.out.println("Valid email");
        	flag =true;
        	break;
        }
		}
        if (flag==false) {
        	System.out.println("Invalid email");
        }
  }
}
