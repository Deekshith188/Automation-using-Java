package com.assignment.java;

public class Dowhile2 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int j=1;
			do
			{
				if((i+j)<=5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
				j++;
			}while(j<=4);
			i++;
			System.out.println();
		}while(i<=5);
	}

}
