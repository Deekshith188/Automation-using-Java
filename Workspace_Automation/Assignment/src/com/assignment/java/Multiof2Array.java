package com.assignment.java;

public class Multiof2Array {

	public static void main(String[] args) {
		System.out.println("Multiplication of two Arrays:");
		int a[][]= {{10,20,30},{10,20,30}};
		
		int b[][]= {{1,2,3},{1,2,3}};
		int x[][]=new int [2][3];
		for (int i=0;i<2;i++) 
		{
		 for (int j=0;j<3;j++)
			{
			 x[i][j]=a[i][j]*b[i][j];
			 System.out.print(x[i][j]+" ");
			}
		 System.out.println();
		}

	}

}
