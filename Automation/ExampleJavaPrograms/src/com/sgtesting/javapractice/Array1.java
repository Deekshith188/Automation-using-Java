package com.sgtesting.javapractice;

public class Array1 {

	public static void main(String[] args) {
		int a[][]= {{20,30,40},{22,33,44}};
		int b[][]= {{2,3,4},{5,6,7}};
		int c[][]=new int [2][3];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
			c[i][j]=a[i][j]*b[i][j];
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}

}
