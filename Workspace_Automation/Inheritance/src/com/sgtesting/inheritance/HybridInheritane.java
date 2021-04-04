package com.sgtesting.inheritance;
class Main
{
	void test1(String s, int y)
	{
		System.out.println("Test month: "+s);
		System.out.println("Total Marks in the test was :");
	}
}
class Submain extends Main
{
	void Test2(int x,int z)
	{
		System.out.println("Test2 Marks :"+x);
		System.out.println("Test1 Marks : "+z);
	}
}
class Submain2 extends Submain
{
	void Test3( String b)
	{
		System.out.println("Name of the Test:"+b);
		
	}
}
class main2  extends Main
{
	void Final (String b)
	{
		System.out.println(b);
	}
}
public class HybridInheritane {

	public static void main(String[] args) {
		main2 o1=new main2();
		o1.Final("Last exam");
		o1.test1("xyz", 40);
		
		Submain2 o2=new Submain2();
		o2.Test2(35, 25);
		o2.Test3("Weekly Test");
		o2.test1("abc", 50);
			

	}

}
