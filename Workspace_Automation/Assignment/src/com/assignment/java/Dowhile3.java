package com.assignment.java;

public class Dowhile3 {

	public static void main(String[] args) {
		int num=10;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(num*10+" ");
				num+=10;
				j++;
			}while(j<=3);
			i++;
			System.out.println();
		}while(i<=3);
		
	}

}
