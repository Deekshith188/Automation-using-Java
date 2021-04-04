package com.sgtesting.java;
class Array1
{
	void display()
	{
		int a[]= {12,24,36,48};
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+"  ");	
		}
	}
}
public class Array {

	public static void main(String[] args) {
		Array1 obj=new Array1();
		obj.display();

	}

}
