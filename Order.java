package javaWeekly;

public class Order {
	
	private int orderNumber;
	private Coffy[] orderCoffy;
	private Customer orderCustomer;
	
	
	public Order(int num,Coffy[] coffy,Customer customer)
	{
		orderNumber = num;
		orderCoffy = coffy;
		orderCustomer = customer;
	}
	
	public String toString()
	{
		String msg ="Order No:" + orderNumber +  "\tCustomer: " + orderCustomer.getName() + "  \tOrdered Coffees:";
		msg += " " + orderCoffy[0].getName();
		for(int i = 1; i<orderCoffy.length;i++)
		{
			msg += ", " + orderCoffy[i].getName();
		}
		
		return msg;
	}

}
