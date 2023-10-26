package Oopsconcept;

class Bicycle  
{ 
    public int gear; 
    public int speed; 
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("Number of gears= " + gear + "\n" + "speed of bicycle = " + speed); 
    }  
} 
class MountainBike extends Bicycle  
{ 
    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height="+seatHeight); 
    } 
}
public class Inherit 
{ 
    public static void main(String args[])  
    { 
        MountainBike mb = new MountainBike(4, 160, 35); 
        System.out.println(mb.toString());
    } 
}
