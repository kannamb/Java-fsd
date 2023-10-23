package assistedprojects;

//1. Class is having Default access modifier 
class defAccessSpecifier
{ 
void display() 
   { 
       System.out.println("Access specifier"); 
   } 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
      obj.display(); 

	}
}
