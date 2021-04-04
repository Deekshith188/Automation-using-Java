package com.sgtesting.strings;

public class Assignment6 {

	public static void main(String[] args) {
		String s="gadag";
		StringBuffer Str= new StringBuffer();
		for (int i=s.length()-1;i>=0;i--)
		{
			Str=Str.append(s.charAt(i));
		}
		if(s.equalsIgnoreCase(Str.toString())) {
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
	}
}


