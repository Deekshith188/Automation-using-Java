package com.sgtesting.assignments;

public class Dowhile {

	public static void main(String[] args) {
		int size=0;
		int i=20;
		do
		{
			if(i%2==0) 
			{
				size=size+1;
			}
			i++;
		}while(i<=40);
		System.out.println("length of the Array:"+size);
		System.out.println("Array Elements");

		int a[]=new int[size];
		int k=0;
		int j=20;
		do
		{
			if(j%2==0)
			{
				a[k]=j;
				k++;
			}
			j++;
		}while(j<=40);
		int m=0;
		while(m<a.length)
		{
			System.out.println(a[m]);
			m++;
		}

	}

}
