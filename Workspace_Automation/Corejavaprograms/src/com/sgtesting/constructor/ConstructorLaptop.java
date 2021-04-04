package com.sgtesting.constructor;
class Lap
{
	Lap(String a)
	{
		System.out.println(a);
	}
	Lap(int x)
	{
		
		System.out.println(x);
	}

}
public class ConstructorLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lap b=new Lap("Dell");
Lap c=new Lap(50000);
Lap d=new Lap("Dell Vostra");
	}

}
