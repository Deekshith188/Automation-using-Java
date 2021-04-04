package com.sgtesting.assignments;

public class Q3_While {

	public static void main(String[] args) {
		int size=0;
		int i=1;
		while(i<=10)
		{
			size=size+1;
			i++;
		}
		System.out.println("length of the Array:"+size);
		System.out.println("Array Elements");

		int a[]=new int[size];
		int k=0;
		int j=1;
		while(j<=10) 
		{
			a[k]=j*j;
			k++;
			j++;
		}

		int m=0;
		while(m<a.length)
		{
			System.out.println(a[m]);
			m++;
		}

	}

}
