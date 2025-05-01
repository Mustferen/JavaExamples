package javaWeekly;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;


public class Weekly {

	public static void main(String[] args) throws FileNotFoundException {
		

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
		System.out.println((int)harf1 + " " + (int)harf2 + "  " + ((int)(harf1 - harf2)));
		System.out.println(harf1 - harf2);
		
		System.out.println((char)((int)harf1 - 3));
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the day of work per month : ");
		int day = scan.nextInt();
		
		System.out.print("Enter the hours of work per day : ");
		float hour = scan.nextFloat();
		
		System.out.println(day +"\n"+hour);
		
		
		
        */
		// ****************************** HAFTA 3 **************************
		/*
		
		
		final int LIMIT_AGE = 18;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Age: ");
		int age = scan.nextInt();
		
		if(age < LIMIT_AGE)
			System.out.println("You can't enter this area because of our age limit.");
		else
			System.out.println("Welcome to Afrodit Night Club.");

	
		
		
		
		boolean isTrue = false;
		if (!isTrue)									// !true = false
			System.out.print(isTrue);
			
		
		
		
		//Yazı - Tura
		
		Coin myCoin = new Coin();
		System.out.println(myCoin);
		myCoin.flip();
		System.out.println(myCoin);
		
		
		
		
		
		
		// 3 sayıdan en büyük olanı bul
		int a=100,b=99,c=45,eb;
		
		if(a>b)
		{
			if(a>c)
				eb=a;
			else
				eb=c;
		}
		else
		{
			if(b>c)
				eb=b;
			else
				eb=c;
		}
			
		System.out.println(eb);
			
			
	
		
		
		String name1 = "true",name2 = "ali", name3 = "alimma";
		
		boolean sonuç = name1.equals(name2.equals(name3));
		System.out.println(sonuç);
		
		System.out.println(name2.equals(name3));	
		System.out.println(name2.compareTo(name3));
			
			
			
	
		

		// Palindrom Kelime
		
		String str,yeniden="y";
		int sol,sağ;
		
		Scanner scan = new Scanner(System.in);
		
		while(yeniden.equalsIgnoreCase("y"))
		{
			System.out.print("Kontrol için kelimeyi girin: ");
			str = scan.nextLine();
			
			sol = 0;
			sağ = str.length()-1;
			
			boolean devamMı = true;
			while(sol < sağ && devamMı)
			{
				if (str.charAt(sol) != str.charAt(sağ))
					devamMı = false;
				sol++;
				sağ--;
			}
			if(devamMı)
				System.out.println(str + " kelimesi PALİNDROM.");
			else
				System.out.println(str + " kelimesi PALİNDROM DEĞİL.");
			
			System.out.println("\nBaşka bir kelime denemek ister misiniz?");
			yeniden = scan.nextLine();
		}
		
		
		
		
		// Sayının basamakları toplamı
		
		
		
		Scanner scan = new Scanner(System.in);
		String devamMi = "y";
		
		while(devamMi.equalsIgnoreCase("y"))
		{
			System.out.print("Sayıyı Girin: ");
			int sayiKaynak = scan.nextInt();
			int sayi = sayiKaynak,toplam = 0;
			
			while(sayi > 0)
			{
				
				toplam += sayi%10;
				sayi /= 10;
			}
			
			System.out.println(sayiKaynak + " sayısının basmaakları toplamı " + toplam);
			System.out.print("\nFarklı bir sayı denemek ister misiniz? : ");
			devamMi = scan.next();
		}
		
		
		
		
		
		
		String url;
		Scanner fileScan,urlScan;
		
		fileScan = new Scanner(new File("C:\\Users\\mustf\\eclipse-workspace\\JavaWeekly\\src\\javaWeekly\\url.txt"));
		
		while(fileScan.hasNext())
		{
			url = fileScan.nextLine();
			System.out.println("URL: " + url);
			
			urlScan = new Scanner(url);
			urlScan.useDelimiter("/");
			
			while(urlScan.hasNext())
				System.out.println("   " + urlScan.next());
			
			System.out.println();
			
		}
		
		

		
		
		 */
		
		
		
		// ****************************** HAFTA 5 **************************
		
		// ArrayList
		/*
		
		
		ArrayList<String> brands =new ArrayList<String>();
		
		brands.add("Obey");
		brands.add("Ubermacht");
		brands.add("Grotti");
		brands.add("Pegassi");
		System.out.println(brands);
		
		System.out.println(brands.get(2));
		
		int indis = brands.indexOf("Ubermacht");
		brands.remove("Ubermacht");
		brands.add(indis,"Übermacht");
		System.out.println(brands);
		
		System.out.println(brands.size());
		
		System.out.println(brands.contains("Obey"));
		
		brands.clear();
		
		System.out.println(brands);
		
		
	
		

		
		
		// switch 
		Scanner scan = new Scanner(System.in);
		String devamMı = "y";
		
		while(devamMı.equalsIgnoreCase("y"))
		{
			System.out.print("Ayın kaçıncı günü olduğunu girin: ");
			int kaçı = scan.nextInt();		
			int sayı = kaçı %7;
			switch(sayı)
			{
			case 0: System.out.println("Pazar"); break;
			case 1: System.out.println("Pazartesi"); break;
			case 2: System.out.println("Salı"); break;
			case 3: System.out.println("Çarşamba"); break;
			case 4: System.out.println("Perşembe"); break;
			case 5: System.out.println("Cuma"); break;
			case 6: System.out.println("Cumartesi"); break;
			}
			
			System.out.print("Devam ? : ");
			devamMı = scan.next();
		}
	
		
		
		
		
		
		
		// inline if
		
		final int MAX = 128;
		int total =100;
		
		System.out.println("MAX : " + MAX + "\ntotal : " + total);
		
		total = (total>MAX) ? total-(total-MAX): total+1;
		
		System.out.println("MAX : " + MAX + "\ntotal : " + total);
		
		
		
		  
		
		
		//do while
		
		int num = 1234,rNum=0,temp=num;

		
		
		do
		{
			rNum = rNum * 10 + temp%10;
			temp/=10;
		} while(temp>0);
		
		System.out.println("num = " + num + "\nrNum = " + rNum);
		
		
		
		
		
		
		
		// foreach
		
		ArrayList<String> brands =new ArrayList<String>();
		
		brands.add("Obey");
		brands.add("Ubermacht");
		brands.add("Grotti");
		brands.add("Pegassi");
				
		
		for(String brand : brands)
		{
			System.out.println(brand);
		}
		
		
		
		
		
		
		
		
		// Student class ve Yapılandırıcı Metot
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Eren",100));
		students.add(new Student("Yaren",75));
		students.add(new Student("Mehmet",30));
		students.add(new Student("Harun",15));
		students.add(new Student("Veli",90));
		students.add(new Student("Zeynep",45));
		students.add(new Student("Nur",65));
		
		
		for(Student st:students)
		{
			System.out.println(st);
		}

		

		
		
		// Dialog Boxes
		
		
		String numStr, result;
		int num,again;
		
		do
		{
			numStr = JOptionPane.showInputDialog("Bir sayı giriniz : ");
			num = Integer.parseInt(numStr);
			
			result = "Girdiğiniz Sayı " + ((num % 2 == 0) ? "Çift" : "Tek");
			
			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(	null , "Başka Bir Sayı Deneyecek Misiniz? ");					
		} while(again == JOptionPane.YES_OPTION);
		
		
		
		
		
		
		
		
		
		// Enumarated Types
		
		
		
		enum days {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday};
		System.out.println(days.Saturday);
		
		String gün = String.valueOf(days.Monday);
		System.out.println(gün);
		
		
		int yaş = Integer.parseInt("23");
		System.out.println(yaş);
		
		
		
		
		int num = 54;
		Integer num2 = num;   // Autoboxing
		
		Integer num3 = 19;
		int num4 = num3;      // Unboxing
		

		
		
		
		
		
		
		
		
		
		// Cümlede Hangi Harften Kaç Tane Geçiyor
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Metin Giriniz: ");
		String metin = scan.nextLine();
		//metin = metin.toLowerCase();
		
		String kelime = new String();
		
		ArrayList<Character> sesliler = new ArrayList<Character>();
		
		sesliler.add('a');sesliler.add('A');
		sesliler.add('e');sesliler.add('E');
		sesliler.add('ı');sesliler.add('I');
		sesliler.add('i');sesliler.add('İ');
		sesliler.add('o');sesliler.add('O');
		sesliler.add('ö');sesliler.add('Ö');
		sesliler.add('u');sesliler.add('U');
		sesliler.add('ü');sesliler.add('Ü');
		
		
		ArrayList<Character> çıkanSesli = new ArrayList<Character>();
		ArrayList<Integer> çıkanSesliSayı = new ArrayList<Integer>();
		ArrayList<Character> çıkanSessiz = new ArrayList<Character>();
		ArrayList<Integer> çıkanSessizSayı = new ArrayList<Integer>();
		
		int sesliSayı = 0,sessizSayı = 0;
		
		Scanner scan2 = new Scanner(metin);
		scan2.useDelimiter(" ");
		
		while(scan2.hasNext())
		{
			kelime = scan2.next();
			
			for(int i = 0; i < kelime.length(); i++)
			{
				if (sesliler.contains(kelime.charAt(i)))
				{
					if(çıkanSesli.contains(kelime.charAt(i)))
						çıkanSesliSayı.set(çıkanSesli.indexOf(kelime.charAt(i)), çıkanSesliSayı.get(çıkanSesli.indexOf(kelime.charAt(i))) + 1);
					else
					{
						çıkanSesli.add(Character.valueOf(kelime.charAt(i)));
						çıkanSesliSayı.add(1);
					}
				}
				else
				{
					if(çıkanSessiz.contains(kelime.charAt(i)))
						çıkanSessizSayı.set(çıkanSessiz.indexOf(kelime.charAt(i)), çıkanSessizSayı.get(çıkanSessiz.indexOf(kelime.charAt(i))) + 1);
					else
					{
						çıkanSessiz.add(Character.valueOf(kelime.charAt(i)));
						çıkanSessizSayı.add(1);
					}
				}
			}
			
		}
		
		System.out.println(çıkanSesli);
		System.out.println(çıkanSesliSayı);
		System.out.println();
		System.out.println(çıkanSessiz);
		System.out.println(çıkanSessizSayı);
		
		
		
		
		
		// Palindrome
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Olası Palindrom Cümleyi Girin: ");
		String str = scan.nextLine();
		
		boolean hataMi = false;
		
		for(int i = 0; i < str.length()/2; i++)
		{
			if(str.charAt(i) != str.charAt((str.length()-1)-i))
			{
				hataMi = true;
				break;
			}
		}
		
		if(hataMi)
			System.out.println("Palindrom DEĞİL.");
		else 
			System.out.println("Palindrom");
		
		
		
		
		
		
		
		// Reversed int
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir Sayı Girin: ");
		int sayi = scan.nextInt();
		
		int rSayi = 0;
		
		while(sayi>0)
		{
			rSayi = rSayi * 10 + sayi % 10;
			sayi /= 10;
		}
		System.out.println("Reversed: " + rSayi);

		
		
		
		// Random
		
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(50));
		
		
		
		
		
		// .equals VS ==
		
		
		String s1 = "ahmet",s2="ahmet",s3="Ahmet",s4=s1;
		
		System.out.println("s1 == s2 " + ((s1==s2)? "true" : "false"));
		System.out.println("s1 == s3 " + ((s1==s3)? "true" : "false"));
		System.out.println("s1 == s4 " + ((s1==s4)? "true" : "false"));
		System.out.println("s2 == s4 " + ((s2==s4)? "true" : "false"));
		
		System.out.println("equals");
		System.out.println("s1 == s2 " + ((s1.equals(s2))? "true" : "false"));
		System.out.println("s1 == s3 " + ((s1.equals(s3))? "true" : "false"));
		System.out.println("s1 == s4 " + ((s1.equals(s4))? "true" : "false"));
		System.out.println("s2 == s4 " + ((s2.equals(s4))? "true" : "false"));
		
		
		
		// String a="ss";     ile     String a=new String("ss");     birbirinden farklı
 		
		String a1 = "Java";
		String a2 = "Ja" + new String("va");
		
		System.out.println(a1==a2);
		
		
		

		char a = 'a' , b = 'b';
		String c = "c";
		
		System.out.println(String.valueOf(a + c + b));

		
		
		
		// toLower()
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Metin Girin: ");
		String metin = scan.nextLine();		
		String kMetin=new String();
		
		for(int i = 0; i<metin.length(); i++)
		{
			if(metin.charAt(i) == ' ')
			{
				kMetin += " ";
				continue;
			}
			
			int asc = (int)metin.charAt(i);
			
			if (asc > 64 && asc < 91)
			{
				kMetin +=(char)(asc + 32);
			}
			else
			{
				kMetin += metin.charAt(i);
			}
			
		}
		
		System.out.println(kMetin);
		
		
		
		
		
		System.out.println(Double.compare(7.5, 7.6));
		System.out.println(Character.compare('a', 'a'));
		System.out.println("ber".compareTo("ber"));		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		//-------------------------------------   CLASS  ------------------------------
		
		
		
		
		// Coffy Örneği 
		
		
		Coffy coffy1 = new Coffy(1,"Latte",100.0);
		Coffy coffy2 = new Coffy(2,"Espresso",70.0);
		Coffy coffy3 = new Coffy(3,"Mocha",90.0);
		Coffy coffy4 = new Coffy(4,"Americano",70.0);
		Coffy coffy5 = new Coffy(5,"Cappuccino",95.0);
		Coffy coffy6 = new Coffy(6,"Macchiato",85.0);
		Coffy coffy7 = new Coffy(7,"Türk Kahvesi",80.0);
		Coffy coffy8 = new Coffy(8,"Bulletproof Latte",110.0);
		Coffy coffy9 = new Coffy(9,"Chocolate Cookie Latte",120.0);
		
		
		Customer c1 = new Customer(1,"Eren",23);
		Customer c3 = new Customer(3,"NoNameGirl",22);
		
		
		Order ord1 = new Order(1,new Coffy[] {coffy9,coffy3},new Customer(1,"Eren",23));
		Order ord2 = new Order(2,new Coffy[] {coffy7,coffy9,coffy8},new Customer(2,"Bilal",21));
		Order ord3 = new Order(3,new Coffy[] {coffy2},c3);
		
		
		
		System.out.println(ord1);
		System.out.println(ord2);
		System.out.println(ord3);
		
		
		 */
		
		
		
		
		
		
		// --------------------------------		ARRAYS		---------------------------------------
		
		
		
		int nums[] = new int[15];       		// İki şekilde de tanımlanabilir.
		int[] nums2 = new int[15];
		
		int[] nums3 = {71,55,05,60,19};			// Doğrudan değer ataması yapılabilir.
		
		
		 		
		for(int num : nums3)					// Diziler foreach yapısı ile kullanılabilir.
		{
			System.out.println(num);
		}
		
		
		
		Student[] students = new Student[3];	//Student sınıfına ait objelerden oluşan liste 
		
		Student[] students2 = {new Student("Eren",90), new Student("Mustafa",80)};
		
		
		System.out.println(average(25,55,89,57)); 	// parametre sayısı farketmiyor.
		
		
		print(223255013,"Eren","Veritabanı","Mikroişlemciler","Otomata","Java","BilMÖK","Sinyaller");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	// Methods
	public static double average(int ... grades)
	{
		if(grades.length==0)
		{
			System.out.println("");
			return 0;
		}
		double sum = 0;
		for(int grade:grades)
		{
			sum += grade;
		}
		return sum / grades.length;
	}
	
	public static void print(int number,String name,String ... dersler)
	{
		System.out.println("Öğrenci Numarası: " + number);
		System.out.println("Adı: " + name);
		System.out.print("Aldığı Dersler: ");
		for(String ders : dersler)
		{
			System.out.print(ders + ", ");
		}
	}

}








