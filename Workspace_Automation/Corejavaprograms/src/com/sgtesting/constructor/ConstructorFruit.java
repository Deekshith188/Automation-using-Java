package com.sgtesting.constructor;
class Fruits
{
	Fruits(int a)
	{
		System.out.println(a);
	}
	Fruits(String i,String r,String s)
	{
		System.out.println(i+ r+ s);
	}

}

public class ConstructorFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruits x=new Fruits("mango "," banana"," apple");
Fruits y=new Fruits(5566);
	}

}
