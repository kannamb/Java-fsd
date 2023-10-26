package Threadrunnable;

public class Thread1 extends Thread {
	public void run()
	{
		System.out.println("Thread Started");
	}
	public static void main(String args[])
	{
		Thread1 obj1=new Thread1();
		Thread1 obj2=new Thread1();
		obj1.start();
		obj2.start();	
	}
  
}
