package Assisted;
public class Stacke {
	static final int MAX=1000;
	int  top;
	int a[]= new int[MAX];
	boolean isEmpty() {
		return top<0;
	}
	public Stack() {
		top=-1;//default  stckas an empty;
	}
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stackis Overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+" Pushed into stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("Statck  is UNDERFLOW");
			return 0;
		}
		else {
			int x= a[top--];
			return x;
		}
	}
	public static void main(String[] args) {
		Stack s=  new Stack();
		s.push(15);
		s.push(46);
		s.push(80);
		s.push(55);
		System.out.println(s.pop()+ " : Poped Out from stack");
	}
}
