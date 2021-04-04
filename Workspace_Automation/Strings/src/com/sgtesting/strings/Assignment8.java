package com.sgtesting.strings;

public class Assignment8 {

	
	public static void main(String[] args) {
		String s="Hello Word";
		System.out.println("length:"+LengthOfStringWithCharArray(s));
	}
	public static int LengthOfStringWithCharArray(String str) {
		int length=0;
		char[] strCharArray=str.toCharArray();
		for (char c:strCharArray)	
		{
			length++;
			
		}
		return length;
	}

}
