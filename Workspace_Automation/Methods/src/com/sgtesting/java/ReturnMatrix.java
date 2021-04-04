package com.sgtesting.java;
class ReturnMatrixSubstraction
{
	int [][] Array(int a[][],int b[][],int row,int column)
	{
		int res[][]=new int [row][column];
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				res[i][j]=a[i][j]-b[i][j];
		    }
		}
		return res;
	}
}

public class ReturnMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{1,2},{3,4,}};
		ReturnMatrixSubstraction obj=new ReturnMatrixSubstraction();
		int res[][]=obj.Array(a,b,2,2);
		for(int x[]:res)
		{
			for(int c:x)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}