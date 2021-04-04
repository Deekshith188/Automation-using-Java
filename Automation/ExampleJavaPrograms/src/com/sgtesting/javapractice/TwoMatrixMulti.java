package com.sgtesting.javapractice;
class TwoMulti
{
	int [][] display()
	{
		int a[][]= {{2,8},{3,4}};
		int b[][]= {{3,2},{4,3}};
		int c[][]=new int [2][2];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		int d[][]=new int [2][2];
		int m=0;
		for(int i=0;i<b.length;i++)
		{
			int n=0;
			for(int j=0;j<b.length;j++)
			{
			d[m][n]=c[i][j];
			n++;	
			}
		m++;	
		}
			return d;	
	}
}
public class TwoMatrixMulti {

	public static void main(String[] args) {
		TwoMulti o=new TwoMulti();
		int x[][]=o.display();
		for(int y[]:x)
		{
			for(int z:y)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		
		

	}

}
