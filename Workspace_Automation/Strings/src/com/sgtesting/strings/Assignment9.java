package com.sgtesting.strings;

public class Assignment9 {

	public static void main(String[] args) {
		int uppercount=0,lowercount=0;
		StringBuilder SB=new StringBuilder("ProGraMMinG");
		for (int i=0;i<SB.length();i++) {
			char ch=SB.charAt(i);
			if(ch>'A' &&ch<='Z')
			{
				uppercount++;
			}
			else if (ch>='a' && ch<='z')
			{
				lowercount++;
			}
			else
			{
				System.out.println("There is no upper case or lowercase found");
			}
		}
			System.out.println("the given string is:"+SB);
			
			System.out.println(+uppercount);
			System.out.println(+lowercount);
		
		
		
		
		
	}

}
