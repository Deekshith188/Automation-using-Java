package com.sgtesting.corejava;
class Mobile
{
	String nameofthebrand;
	String nameofthemodel;
	int Price;
	Mobile()
	{
		nameofthebrand="xiaomi";
		nameofthemodel="Note5pro";
		Price=15000;
		System.out.println(nameofthebrand);
		System.out.println(nameofthemodel);
		System.out.println(Price);
		System.out.println("-----------------------------------------------------------------");
	}
}
class Laptop
{
	String nameofthebrand;
	String nameofthemodel;
	int Price;
	Laptop()
	{
		nameofthebrand="Dell";
		nameofthemodel="Vostra";
		Price=50000;
		System.out.println(nameofthebrand);
		System.out.println(nameofthemodel);
		System.out.println(Price);
		System.out.println("-----------------------------------------------------------------");
	}
}
class Desktop
{
	String nameofthebrand;
	String nameofthemodel;
	int Price;
	Desktop(){
		nameofthebrand="Apple";
		nameofthemodel="Macbookpro";
		Price=250000;
		System.out.println(nameofthebrand);
		System.out.println(nameofthemodel);
		System.out.println(Price);
		System.out.println("-----------------------------------------------------------------");
	}
}
public class MobileLaptopDesktop
{
	
	public static void main(String[] args) {
		Mobile R=new Mobile();
		
		Laptop D=new Laptop();
		
		Desktop M=new Desktop();
		
		}

}
