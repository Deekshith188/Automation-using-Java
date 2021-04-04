package com.sgtesting.java;
class Prime1
{
	boolean Return(int n)
	{
		int a=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				a+=1;
				break;
			}
		}
		if(a==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Prime{
	public static void main(String args[]) {
		Prime1 obj=new Prime1();
		boolean x=obj.Return(7);
		System.out.println(x);
	}
}