package com.pattern.java;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				System.out.println(" ");
			}
			for (int k=0;k!=(2*i-1);k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
