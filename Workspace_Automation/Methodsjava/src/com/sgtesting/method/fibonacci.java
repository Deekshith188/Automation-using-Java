package com.sgtesting.method;
class Fibonacci
{
	void display()
	{
		int a=0;
		int b=1;
		int c=0;
		for (int i=0;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
			
		}
	}	
}
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj=new Fibonacci();
		obj.display();
	}

}
