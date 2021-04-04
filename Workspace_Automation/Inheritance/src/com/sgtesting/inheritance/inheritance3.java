package com.sgtesting.inheritance;
//Super class and Sub Class contains same Variables
class Variable
{
	String city;
	void display()
	{
		System.out.println("city name:"+city);
	}
}
class Variable2 extends Variable
{
	String city;
	void display()
	{
		super.city="texas";
	}
	void show()
	{
		System.out.println("Sub class city name :"+city);
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		Variable2 o=new Variable2();
		o.city="bangalore";
		o.display();
		o.show();
		
		

	}

}
