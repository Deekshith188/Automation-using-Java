package com.sgtesting.inheritance;
// super class and subclass contains same variable
class Test
{
	Test (String s)
	{
		System.out.println("super class:"+s);
	}
}
class Test1 extends Test
{
	Test1(String s)
	{
		super(s);
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Test1 o1=new Test1("has same variable");
		}

}
