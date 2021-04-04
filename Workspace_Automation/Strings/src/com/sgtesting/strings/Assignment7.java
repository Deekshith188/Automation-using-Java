package com.sgtesting.strings;

public class Assignment7 {

	public static void main(String[] args) {
		int vcount=0,ccount=0;
		String s="WELCOME TO PROGRAMMING";
		s=s.toLowerCase();
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			vcount++;
		}
			else if (s.charAt(i)>'a'&&s.charAt(i)<'z') {
				ccount++;
			}
		}
		System.out.println("Number of Vowels:"+vcount);
		System.out.println("Number of Consonants:"+ccount);
	}
 }

