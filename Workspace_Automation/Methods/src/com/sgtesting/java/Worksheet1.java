package com.sgtesting.java;
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
public class Worksheet1 {
public static void main(String[] args) {
	Test1 o=new Test1("mango");
}
}
	















