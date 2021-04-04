package com.sgtesting.reflection3;
public class StringBufferDemo {

	
	public static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		System.out.println("Append String:"+s.append(" Program"));
		System.out.println("+++++++++++++++++++");
	}
	
	public static void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		System.out.println(s.insert(8, "new "));
		System.out.println("+++++++++++++++++++");
	}
	
	public static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		System.out.println(s.delete(8, 11));
		System.out.println("+++++++++++++++++++");
	}
	

	public static void reverseDemo()
	{
		StringBuffer s=new StringBuffer("Programming");
		System.out.println(s.reverse());
		System.out.println("+++++++++++++++++++");
	}
}
