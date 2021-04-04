package com.pattern.java;

public class PyramidPatternABCD {

	public static void main(String[] args) {
		int  alphabet=65;
		int rows=5;
		System.out.println("## Print the Pattern ##");
		for ( int i=1;i<=rows;i++)
		{
			for (int j=rows;j>1;j--)
			{
				System.out.print(" ");
				for (int k=1;k<=i;k++)
				{
					System.out.print((char)(alphabet+i-1)+ " ");
				}
				System.out.println();
			}
		}
	}



}


