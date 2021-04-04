package com.sgtesting.strings;

public class Asignment5 {

	public static void main(String[] args) {
		
	}
		void assignment5( String s)
		{
			String str="";
			String a[]=str.split(" ");
			System.out.print(a[0]+"  "+a[1]+" ");
			String b=a[2];
			for(int i=b.length()-1;i>=0;i--)
			{
				System.out.print(b.charAt(i));
			}
		}
	}
	
	

