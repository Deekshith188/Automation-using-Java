package com.sgtesting.reflection3;

public class StringBuilderDemo {

	
	public static void appendDemo()
	{
		StringBuilder s=new StringBuilder("Java");
		System.out.println("Append String:"+s.append(" Program"));
		System.out.println("+++++++++++++++++++");
	}
	
	public static void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a palace");
		System.out.println(s.insert(8, "new "));
		System.out.println("+++++++++++++++++++");
	}
	
	public static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new palace");
		System.out.println(s.delete(8, 11));
		System.out.println("+++++++++++++++++++");
	}
	

	public static void reverseDemo()
	{
		StringBuilder s=new StringBuilder("Programming");
		System.out.println(s.reverse());
		System.out.println("+++++++++++++++++++");
	}

}
