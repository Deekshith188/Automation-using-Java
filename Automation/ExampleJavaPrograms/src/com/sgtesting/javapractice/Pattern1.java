package com.sgtesting.javapractice;

public class Pattern1 {

	public static void main(String[] args) {
		char ch='a';
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(ch+"  ");
				k++;
			}while(k<=5);
			System.out.println();
			i++;
		}while(i<=4);
	}
}