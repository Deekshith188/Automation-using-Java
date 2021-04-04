package com.sgtesting.assignments;

public class Q4_DoWhile {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int size=0;
		int i=1;
		do
		{
			size=size+1;
			i++;
		}while(i<=10);
		System.out.println("length of the Array:"+size);
		System.out.println("Array Elements");

		int a[]=new int[size];
		int k=0;
		int j=1;
		do 
		{
			a[k]=j*j*j;
			k++;
			j++;
		}while(j<=10);
		int m=0;
		do
		{
			System.out.println(a[m]);
		m++;
		}while(m<a.length);

	}

}
