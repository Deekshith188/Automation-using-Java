package com.sgtesting.assignments;

public class Q3_For {

	public static void main(String[] args) {
		
				int size=0;
				for(int i=1;i<=10;i++)
				{
					size=size+1;
				}
				System.out.println("length of the Array:"+size);
				System.out.println("Array Elements");

				int a[]=new int[size];
				int k=0;
				for(int i=1;i<=10;i++) 
				{
					a[k]=i*i;
					k++;
				}
				for(int m=0;m<a.length;m++)
				{
					System.out.println(a[m]);
				}


			}

}
