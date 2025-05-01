package javaWeekly;

public class Customer {
	
	private int customerNumber;
	private String customerName;
	private int customerAge;
	private boolean customerGender;  // 1=male , 0=female
	
	
	
	public Customer(int num,String name,int age)
	{
		customerNumber = num;
		customerName = name;
		customerAge = age;
	}
	
	public String toString()
	{
		return "Customer: " + customerName + "\tAge: " + customerAge + "\tGender: " + ((customerGender==true)? "Erkek" : "Kadın");
	}
	
	
	public String getName()
	{
		return customerName;
	}
	
	public void setName(String name)
	{
		customerName = name;
	}
	

}
