package com.pattern.java;

public class Pattern7 {

	public static void main(String[] args) {
		char arr[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		for(char a[]:arr)
		{
			for(char s:a)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

}
