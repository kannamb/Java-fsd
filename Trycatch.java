package Exceptionhandling;

public class Trycatch {
static void waitFor() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException f) {
			// Auto-generated catch block
			f.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		waitFor();
	}

}
