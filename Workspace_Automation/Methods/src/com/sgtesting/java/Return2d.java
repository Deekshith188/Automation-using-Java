package com.sgtesting.java;

class Return2Darray
{
	int[][] Array(int a[][], int rows, int columns)
	{
		int res[][]=new int[rows][columns];
		int m=0;
		for(int i=0; i<a.length; i++)
		{
			int n=0;
			for(int j=0; j<a[i].length; j++)
			{
				res[m][n]=a[i][j];
				n++;
			}
			m++;
		}
		return res;
	}
}

public class Return2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{1,2},{3,4}};
		Return2Darray obj=new Return2Darray();
		int a[][]=obj.Array(b,2,3);
		for(int x[]:a)
		{
			for(int c:x)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}


	}
}

