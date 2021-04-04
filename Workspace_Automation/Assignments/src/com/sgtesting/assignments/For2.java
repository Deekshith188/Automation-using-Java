package com.sgtesting.assignments;

public class For2 {

	public static void main(String[] args) {
		int size=0;
		for(int i=50;i>=1;i--)
		{
			if(i%2==0) 
			{
				size=size+1;
			}
		}
		System.out.println("length of the Array:"+size);
		System.out.println("Array Elements");

		int a[]=new int[size];
		int k=0;
		for(int i=50;i>=1;i--) 
		{
			if(i%2==0) 
			{
				a[k]=i;
				k++;
			}
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}

	}

}
