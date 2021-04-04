package com.assignment.java;

public class Assignment7 {

	public static void main(String[] args) {
		int x=1;
		int rows=1;
		while (rows<=3)
		{
		  int col=1;
		  while(col<=3)
		  {
			  System.out.print(x+" ");
			  col++;
			  x++;
		  }
		  rows++;
		  System.out.println();
		}
	}

}
