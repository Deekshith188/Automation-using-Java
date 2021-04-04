package com.sgtesting.assignments;

public class Q3_Short {

	public static void main(String[] args) {
				System.out.println("ForLoop");
				short a[]= {10,20,30,40,50};
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
				
				System.out.println("while loop");
				short a1[]= {10,30,40,50};
				int i=0;
				while(i<a1.length)
				{
					System.out.println(a1[i]);
					i++;
				}
				
				System.out.println("Do While Loop");
				short b[]= {10,20,30,40,50};
				int j=0;
				do
				{
					System.out.println(b[j]);
					j++;
				}while(j<b.length);
			
	}

}
