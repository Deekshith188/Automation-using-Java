package com.assignment.java;

public class Dowhile4 {

	public static void main(String[] args) {
		char ch='A';
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(ch+" ");
				ch++;
				j++;
			}while(j<=3);
			i++;
			System.out.println();
		}while(i<=3);
	}

}
