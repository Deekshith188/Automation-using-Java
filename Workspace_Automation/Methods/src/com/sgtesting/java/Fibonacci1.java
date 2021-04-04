package com.sgtesting.java;

class Fibonaccii
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
public class Fibonacci1 {

	public static void main(String[] args) {
		
Fibonaccii obj=new Fibonaccii();
obj.display();
	}

}