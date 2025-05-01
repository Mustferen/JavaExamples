package javaWeekly;

public class Coffy {
	
	private int coffyNumber;
	private String coffyName;
	private double coffyFee;
	
	
	

	public Coffy(int num,String name,double fee)
	{
		coffyNumber = num;
		coffyName = name;
		coffyFee = fee;
	}
	
	
	public String toString() 
	{
		return "Coffy: " + coffyName + "\tPrice: " + coffyFee;
	}
	
	
	
	public void setFee(double newFee)
	{
		coffyFee = newFee;
	}
	
	public double getFee()
	{
		return coffyFee;
	}
	
	public void setName(String newName)
	{
		coffyName = newName;
	}
	
	public String getName()
	{
		return coffyName;
	}
}

