package innerclass;
abstract class AnonymousInnerClass {
	   public abstract void display();
	}
	public class anonymousinnerclass {
	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {
	         public void display() {
	            System.out.println("anonymous Inner Class");
	         } 
	      };
	      i.display();  
	   }
	}
