package javaWeekly;

public class Coin {
	
	final int YAZI = 0;
	final int TURA = 1;
 
	int gelen;
	
	public Coin()
	{
		flip();
	}
	
	public void flip()
	{
		gelen = (int)(Math.random() * 2);
	}
	
	public String toString()
	{
		if(gelen==YAZI)
			return "Yazı";
		else 
			return "Tura";
	}
	
	
}
