package com.sgtesting.inheritance;
class Sample
{
	void xyz(String s)
	{
		System.out.println(s);
	}
}
class Sample1 extends Sample
{
	Sample1(String s)
	{
		super.xyz(s);
	}
	void xyz(String s)
	{
		System.out.println(s);
	}
}
class Sample2 extends Sample
{
	Sample2(String s)
	{
		super.xyz(s);
	}
	void xyz(String s)
	{
		System.out.println(s);
	}
}
public class Assign8 {

	public static void main(String[] args) {
		Sample1 o=new Sample1("new zealand");
		o.xyz("Australia");
		o.xyz("Dubai");
	

	}

}
