package com.ProjectAssistedPractice;
public class Typecasting{

public static void main(String[] args) {
	//implicit conversion
				System.out.println("Implicit Type Casting");
				char at='A';
				System.out.println("Value of a: "+at);
				int b=at;
				System.out.println("Value of b: "+b);
				float c=at;
				System.out.println("Value of c: "+c);
				long d=at;
				System.out.println("Value of d: "+d);
				double e=at;
				System.out.println("Value of e: "+e);
				System.out.println("\n");
				System.out.println("Explicit Type Casting");
//explicit conversion
				double x=6;
				int y=(int)x;
				System.out.println("Value of y: "+y);
	}
}
