package com.sgtesting.inheritance;
class Maths
{
	void add (int a,int b)
	{
		System.out.println(a+b);
	}
}
class Maths1 extends Maths
{
	void subs(String s)
	{
		System.out.println(s);
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths1 o=new Maths1();
		o.subs("deek");
		o.add(20, 10);


	}

}
