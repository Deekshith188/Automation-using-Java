package com.sgtesting.java;
class Substraction
{
	void Sub()
	{
		int a[]= {10,20,30,40,50};
		int b[]= {5,1,1,2,2};
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]-b[i]+" ");
		}
		System.out.println();
	}
}
public class Matrix {

	public static void main(String[] args) {
		Substraction obj=new Substraction();
		obj.Sub();	

	}

}
