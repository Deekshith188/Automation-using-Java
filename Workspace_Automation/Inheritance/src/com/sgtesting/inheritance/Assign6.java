package com.sgtesting.inheritance;
class MainDemo
{
	String s;int a;
	MainDemo(String s,int a)
	{
		this.s=s;
		this.a=a;
		System.out.println("First:"+s);
		System.out.println(a+"AM");
	}
}
class Demo1 extends MainDemo
{
	String b;
	Demo1(String b,String s,int a)
	
	{
		super(s,a);
		this.b=b;
		System.out.println("Second:"+b);
		
	}
}
class Demo2 extends MainDemo
{
	String n;
	Demo2(String n,String s,int a)
	{
		super(s,a);
		this.n=n;
		System.out.println("Third:"+n);
	}
}
public class Assign6 {

	public static void main(String[] args) {
		Demo1 o1=new Demo1("Lunch","Breakfast",9);
		Demo2 o2=new Demo2("Dinner","1 Pm",1);
		
		

	}

}
