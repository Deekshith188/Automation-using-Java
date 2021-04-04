package com.sgtesting.java;
class Factorial1
{
	int [] getarray()
	{
		int a[]=new int [10];
		for (int i=1;i<10;i++) {
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*i;
			}
			a[i-1]=fact;
		}
		return a;
	}
}

public class Factorial {

	public static void main(String[] args)
	{
		Factorial1 o=new Factorial1();
		int b[]=o.getarray();
		for(int kk:b)
		{
			System.out.println(kk);
		}
}
}
