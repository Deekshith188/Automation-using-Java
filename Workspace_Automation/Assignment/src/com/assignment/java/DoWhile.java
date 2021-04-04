package com.assignment.java;

public class DoWhile {

	public static void main(String[] args) {
		int row=1;
		do
		{
			int col=1;
			do
			{
				if(row==1||row==5||col==1||col==5)
				{
					System.out.print("#");
					
				}
				else
				{
					System.out.print(" ");
					
				}
				col++;
			}while(col<=5);
			
			
			System.out.println();
			row++;
		}while(row<=5);
		
	}
}