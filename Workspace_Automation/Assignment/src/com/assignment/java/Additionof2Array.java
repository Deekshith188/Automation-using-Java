package com.assignment.java;

public class Additionof2Array {

	public static void main(String[] args) {
		System.out.println("Additio of two Array is:");
		int a[][]= {{2,2},{3,3}};
		int b[][]= {{4,4},{5,5}};
		int x[][]=new int [2][2];
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) {
				x[i][j]=a[i][j]+b[i][j];
				
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
