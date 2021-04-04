package com.sgtesting.reflection3;
public class StringDemo1 {
	
	public void displayStrLength()
	{
		String s="Programming";
		System.out.println("# of Chars in String :"+s.length());
		System.out.println("+++++++++++++++++");
	}
	
	public void isEmpty()
	{
		String s=new String();
		System.out.println("Is it Empty String :"+s.isEmpty());
		System.out.println("+++++++++++++++++");	
	}
	
	public void chatAt()
	{
		String s="ORANGE";
		System.out.println("Char at 1th Index:"+s.charAt(1));
		System.out.println("+++++++++++++++++");
	}
	public void lowerCase()
	{
		String s="ORANGE";
		System.out.println("Lower Case :"+s.toLowerCase());
		System.out.println("+++++++++++++++++");
	}
	
	public void upperCase()
	{
		String s="orange";
		System.out.println("Upper Case :"+s.toUpperCase());
		System.out.println("+++++++++++++++++");
	}
	
	public void compareString1()
	{
		String s1="javascript";
		String s2="JAVASCRIPT";
		System.out.println("s1.equals(s2) :"+s1.equals(s2));
		System.out.println("s1.equalsIgnoreCase(s2) :"+s1.equalsIgnoreCase(s2));
		System.out.println("+++++++++++++++++");
	}
	
	public void compareString2()
	{
		String s1="javascript";
		String s2="JAVASCRIPT";
		System.out.println("s1.equals(s2) :"+s1.compareTo(s2));
		System.out.println("s1.equalsIgnoreCase(s2) :"+s1.compareToIgnoreCase(s2));
		System.out.println("+++++++++++++++++");
	}
	
	public void existanceOfString()
	{
		String s="Bangalore is a garden city of Karnataka";
		System.out.println("Starts With :"+s.startsWith("Bangalore"));
		System.out.println("Ends With :"+s.endsWith("Karnataka"));
		System.out.println("Contains :"+s.contains("garden"));
		System.out.println("+++++++++++++++++");
	}
	
	public void replaceStr()
	{
		String s="Bangalore is a garden city of Karnataka";
		System.out.println(s.replace("is", "was"));
		System.out.println("+++++++++++++++++");
	}
	
	public void splitDemo()
	{
		String s="Bangalore,is,a,garden,city,of,Karnataka";
		String arr[]=s.split(",");
		for(String s1:arr)
		{
			System.out.println(s1);
		}
		System.out.println("+++++++++++++++++");
	}
	
	public void convertOthersIntoString()
	{
		int i=125;
		String s1=String.valueOf(i);
		double d=100.175;
		String s2=String.valueOf(d);
		System.out.println(s1+"     "+s2);
		System.out.println("+++++++++++++++++");
	}
	
	public void strPosition()
	{
		String s="Programming Language";
		System.out.println("The Position of g in 1st Occurance :"+s.indexOf("g"));
		System.out.println("The Position of g in reverse order:"+s.lastIndexOf("g"));
		System.out.println("+++++++++++++++++");
	}
	

}
