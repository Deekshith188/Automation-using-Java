package com.sgtesting.strings;

public class Assignment2 {

	public static void main(String[] args) {
		reverse1();
		reverse2();
		substring();
		
		
		
		
	}
    static void reverse1()
    {
    	String s="Vijayanagar";
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		System.out.print(s.charAt(i));
    	}
    	System.out.println();
    	System.out.println("***********************************************");
    }
    static void reverse2()
    {
    	String s="Hampinagar";
    	char ch[]=s.toCharArray();
    	for( int i=ch.length-1;i>=0;i--)
    	{
    		System.out.print(ch[i]);
    		
    	}
    		System.out.println();	
    		System.out.println("***********************************************");
    }
     static void substring()
     {
    	 String s="karnataka";
    	 for( int i=s.length();i>0;i--)
    	 {
    		 System.out.print(s.substring(i-1,i));
    		 
    	 }
     System.out.println();
     }
     

}

