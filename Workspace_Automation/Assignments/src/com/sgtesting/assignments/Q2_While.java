package com.sgtesting.assignments;

public class Q2_While {

	public static void main(String[] args) {
		int size=0;
		int i=50;
		while(i>=1)
		{
			if(i%2==0) 
			{
				size=size+1;
			}
			i--;
		}
		System.out.println("length of the Array:"+size);
		System.out.println("Array Elements");

		int a[]=new int[size];
		int k=0;
		int j=50;
		while(j>=1) 
		{
			if(j%2==0) 
			{
				a[k]=j;
				k++;
			}
			j--;
		}
		int m=0;
		while(m<a.length)
		{
			System.out.println(a[m]);
			m++;
		}

	}
}
