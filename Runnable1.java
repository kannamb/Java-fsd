package Threadrunnable;

public class Runnable1 implements Runnable {
public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} 
			 catch (InterruptedException e) {
				
				e.printStackTrace();
			}//1000milliseconds=1second
			
		}
		
		
		 
	}
	
	
	public static void main(String[] args) {
		//create target of runnable interface
		
		Runnable1 ins1= new Runnable1();
		Runnable1 ins2= new Runnable1();
		
		//create threads  by passing runnable 
		Thread t1=new  Thread(ins1);
		Thread t2=new  Thread(ins2);
		
		t1.setName("one");
		t2.setName("two");
	
		t1.start();
		t2.start();
	}

}
