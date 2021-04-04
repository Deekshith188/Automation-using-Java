package com.sgtesting.constructor;
class Maths
{
	Maths(String a)
	{
		System.out.println(a);
	}
	Maths(long i)
	{
		System.out.println(i);
	}
}
public class ConstructorBasicmaths {

	public static void main(String[] args) {
		Maths x=new Maths(5253);
		Maths y=new Maths("Arthemetic");
		Maths z=new Maths("Geometry");
		Maths p=new Maths(655662135);

	}

}
