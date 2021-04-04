package com.sgtesting.java;

class MtrixMulti
{
	void display()
	{
		int a[][]={{2,3,1},{2,2,3}};    
		int b[][]={{2,2,3},{2,3,1}};    
		int c[][]=new int[2][3]; 
		for(int i=0;i<a.length;i++)
		{  
			for(int j=0;j<a.length;j++)
			{
				c[i][j] = a[i][j] * b[i][j];
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
public class Multiplication {

	public static void main(String args[]){

		MtrixMulti obj  = new MtrixMulti();
		obj.display();


	}
}
