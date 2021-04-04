package com.sgtesting.strings;

public class Assignment11 {
	public static char
	GetTheChar(String s,int index)
	{
		return s.toCharArray()[index];
	}

	public static void main(String[] args) {
		String s="My name is Bellal";
		int index=5;
		char ch= GetTheChar(s,index);
		System.out.println("Character from " +s+ "at index" +index + "is " +ch);
			
		
		
	}

}
