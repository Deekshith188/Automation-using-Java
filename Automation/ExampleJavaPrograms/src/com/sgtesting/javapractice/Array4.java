package com.sgtesting.javapractice;

public class Array4 {
	public static void main(String args[])
	{
		int a[][]= {{1,2,3,4,5},{10,20,30,40}};
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+ "  ");	
			}
		System.out.println();
		}
}
}
