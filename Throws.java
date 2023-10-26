package Exceptionhandling;
public class Throws {
	static void check(int age) throws Exception
		{
			if(age<18)
				System.out.println("Age Not Valid for vote");
			else
				System.out.println(" Age Valid for vote ");
		}
    static void test() throws Exception
		{
			check(17);
		}
		
		public static void main(String[] args) {
			
			 try {
				test();
			} catch (Exception e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
		}
}
