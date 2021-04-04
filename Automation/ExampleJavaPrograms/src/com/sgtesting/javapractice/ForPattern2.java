package com.sgtesting.javapractice;

public class ForPattern2 {

	public static void main(String[] args) {
		char ch='c';
		for (int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}