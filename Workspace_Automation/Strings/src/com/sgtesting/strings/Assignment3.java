package com.sgtesting.strings;

public class Assignment3 {

	public static void main(String[] args) {
	  temple();
	}
	
	static void temple()
	{
		String s="the temple is at the top of the hill";
		String arr[]=s.split(" ");
		for (int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
	

	}


