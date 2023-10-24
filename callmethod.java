package assistedprojects;
public class callmethod {
int val=100;
int operation(int val) {
	val =val*10/100;
	return(val);
}
public static void main(String args[]) {
	callMethod d = new callMethod();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(200);
	System.out.println("After operation value of data is "+d.val);
	}
}
