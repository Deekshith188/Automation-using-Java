package com.sgtesting.javapractice;

public class ForPattern4 {

	public static void main(String[] args) {
		char ch='$';
		for (int i=5;i>=1;i--)
	{
		for(int k=1;k<=i;k++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}
}

