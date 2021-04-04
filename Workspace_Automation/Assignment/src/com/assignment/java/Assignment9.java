package com.assignment.java;

public class Assignment9 {

	public static void main(String[] args) {
		int x=10;
		int rows=1;
		while (rows<=3)
		{
			int col=1;
			while(col<=3)
			{
				System.out.print(x*10+" ");
				col++;
				x+=10;
				
			}
			rows++;
			System.out.println();
		}
	}

}
