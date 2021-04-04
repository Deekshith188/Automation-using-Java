package com.assignment.java;

public class Dowhile1 {

	public static void main(String[] args) {
		int x=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(x+" ");
				x++;
				j++;
			}while(j<=3);
			System.out.println();
			i++;
		}while(i<=3);
	}

}
