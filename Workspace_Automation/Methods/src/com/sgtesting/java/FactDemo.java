package com.sgtesting.java;
class Demo
{
	void fact()
	{
		int fact=1;
		for (int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
public class FactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo o=new Demo();
		o.fact();
		

	}

}
