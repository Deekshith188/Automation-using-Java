package com.sgtesting.inheritance;
class Demo
{
	Demo(String s,int a)
	{
		System.out.println(s);
		System.out.println(a);
	}
}
class Demos1 extends Demo
{
	String x;
	Demos1(String x,String s,int a)
	{
		super(s,a);
		System.out.println(x);
	}
}
class Demo3 extends Demos1
{
	int c;
	Demo3(int c,String x,String s,int a)
	{
		super(x,s,a);
		System.out.println(c);
		
	}
}
public class Assign7 {

	public static void main(String[] args) {
		Demo3 o=new Demo3(10, "java", "Core java",10 );
		

	}

}
