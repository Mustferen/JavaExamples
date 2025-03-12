package javaStartup;

import java.util.Iterator;
import java.util.Scanner;

public class İntroduction {

	public static void main(String[] args) {
		
		
		// *********************** HAFTA 1 - 2 *************************************
		/*
		
		
		System.out.println("Hello World");
		System.out.println("Çorum FK " + 0 + "-" + 2 + " Bolu FK");
		
		String evSahibi = "Çorum FK", deplasman = "Bolu FK";
		int evSahibiSkor = 0, deplasmanSkor = 2;
		
		System.out.println(evSahibi + " " + evSahibiSkor + "-"+ deplasmanSkor + " " + deplasman);
		System.out.println(evSahibi + " " + (evSahibiSkor+1) + "-"+ deplasmanSkor + " " + deplasman);
		System.out.println(evSahibi + " " + evSahibiSkor+1 + "-"+ deplasmanSkor + " " + deplasman);
	
		
		int result = (int)Math.sqrt(25);
		System.out.println(result);
		
		
		int a = 15;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		
		
		
		System.out.println("str + int + int : " + 5 + 7);		//57
		System.out.println("str + (int + int) : " + (5 + 7));	//12
		
		
		System.out.println("a\"b");	// "\(" ' \)"
		
		
		
		final int MAX_LENGTH =5;	//final ile constant değişkenler tanımlarız.
		
		
		
		boolean devamMı = true;
		System.out.println(devamMı);
		
		char harf1 = 'a',harf2 = 'A';
		System.out.println((int)harf1 + " " + (int)harf2 + "  " + ((int)harf1 - (int)harf2));
		
		System.out.println((char)((int)harf1 - 2));
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the day of work per month : ");
		int day = scan.nextInt();
		
		System.out.print("Enter the hours of work per day : ");
		float hour = scan.nextFloat();
		
		System.out.println(day +"\n"+hour);
		
		
		
		*/
		// ****************************** HAFTA 3 **************************
		
		
		
		final int LIMIT_AGE = 18;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Age: ");
		int age = scan.nextInt();
		
		if(age <= LIMIT_AGE)
			System.out.println("You can't enter this area because of our age limit.");
		else
			System.out.println("Welcome to Afrodit Night Club. Have fun.");
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
