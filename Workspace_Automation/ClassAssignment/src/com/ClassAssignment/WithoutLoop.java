package com.ClassAssignment;

public class WithoutLoop {
	public static void main(String args[])
	{
		int number = 1;

		printNumbers(number);	
	}

	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.println(num +" "); 
			//printNumbers(num + 1);
		}	
	}


}