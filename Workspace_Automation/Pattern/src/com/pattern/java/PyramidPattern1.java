package com.pattern.java;

public class PyramidPattern1 {

	public static void main(String[] args) {
	int rows=5;
	System.out.println("## Print the pattern ##");
	for (int i=1;i<=rows;i++)
	{
		for (int j=rows;j>1;j--)
		{
			System.out.print(" ");
		}
		for (int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}

}
