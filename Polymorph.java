package Oopsconcept;

class Polymorph 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	 Polymorphism  s = new  Polymorphism(); 
        System.out.println(s.sum(60, 35)); 
        System.out.println(s.sum(120, 9, 40)); 
        System.out.println(s.sum(15.5, 23.5)); 
    } 
}
