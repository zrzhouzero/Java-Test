package main;

/* Example for constructor and building objects */

public class Dog 
{
	private int legs;
	private boolean tail;
	private String hair;
	
	public Dog() {} // constructor
	
	public int getLegs() // method
	{
		return legs;
	}
	
	public void setLegs(int legs) // method
	{
		this.legs = legs;
	}
	
	public boolean getTail() // method
	{
		return tail;
	}
	
	public void setTail(boolean tail)  // method
	{
		this.tail = tail;
	}
	
	public String getHair() // method
	{
		return hair;
	}
	
	public void setHair(String hair) // method
	{
		this.hair = hair;
	}
	
	public static void main(String[] args) 
	{
		Dog Lucky = new Dog(); // create an object (key point)
		
		Lucky.setLegs(4); // call method 
		Lucky.setTail(true); // call method
		Lucky.setHair("white"); // call method

		if (Lucky.getTail() == true)
		{
			System.out.println("Lucky has " + Lucky.getLegs() + " legs, a tail and it is " + Lucky.getHair() + ".");
		}
		else 
		{
			System.out.println("Lucky has " + Lucky.getLegs() + " legs, no tail and it is " + Lucky.getHair() + ".");
		}
	
	}

}
