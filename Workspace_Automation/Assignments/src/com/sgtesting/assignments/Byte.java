package com.sgtesting.assignments;

public class Byte {

	public static void main(String[] args) {
		int size=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				size=size+1;
			}
		}
		System.out.println("Length of the Array:"+size);
		System.out.println("Array Elements");
		int a[]=new int[size];
		int k=0;
		for(int i=20;i<=40;i++) 
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
