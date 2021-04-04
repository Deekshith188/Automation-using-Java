package com.sgtesting.java;

public class NestedForEachLoop {

	public static void main(String[] args) {
		int a[][]= {{10},{20,30},{40,50,60},{70,80,90,100}};
		for (int row[]:a)
		{
			for (int val:row)
			{
				System.out.print(val+" ");
			}
		System.out.println();
		
		}	
	}
}
