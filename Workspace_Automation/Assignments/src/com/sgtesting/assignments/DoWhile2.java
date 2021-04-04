package com.sgtesting.assignments;

public class DoWhile2 {

	public static void main(String[] args) {
		//To find Size of an Array
		int size=0;
		int i=50;
		do
		{
			if(i%2==0) 
			{
				size=size+1;
			}
			i--;
		}while(i>=1);
		System.out.println("length of the Array:"+size);
		System.out.println("Array Elements");
		//to store the elements in an array

		int a[]=new int[size];
		int k=0;
		int j=50;
		do
		{
			if(j%2==0) 
			{
				a[k]=j;
				k++;
			}
			j--;
		}while(j>=1) ;
		int m=0;
		do
		{
			System.out.println(a[m]);
			m++;
		}while(m<a.length);

	}

}
