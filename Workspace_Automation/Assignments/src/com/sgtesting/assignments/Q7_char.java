package com.sgtesting.assignments;

public class Q7_char {

	public static void main(String[] args) {
		System.out.println("ForLoop");
		char a[]= {'A','B','C','D','E'};
		for(char i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("while loop");
		char a1[]= {'A','B','C','D','E'};
		char i=0;
		while(i<a1.length)
		{
			System.out.println(a1[i]);
			i++;
		}
		
		System.out.println("Do While Loop");
		char b[]= {'A','B','C','D','E'};
		char j=0;
		do
		{
			System.out.println(b[j]);
			j++;
		}while(j<b.length);

	}

}
