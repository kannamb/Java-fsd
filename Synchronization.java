package Synchronization;


public class TestSynchronization {

	public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Amar", "What are you doing?", sender);
		User t2= new User("Jeya","going to a shop?",sender);
		
		t1.start();
		t2.start();
	}

}
