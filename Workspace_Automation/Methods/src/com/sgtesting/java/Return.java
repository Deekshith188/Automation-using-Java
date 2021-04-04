package com.sgtesting.java;
class Return1
{
	int Return(int a) 
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact = fact * i;
			
		}
		return fact;
	}
}

public class Return {

	public static void main(String[] args) {
		Return1 obj=new Return1();
		int x=obj.Return(2);
		System.out.println(x);
	}

}
