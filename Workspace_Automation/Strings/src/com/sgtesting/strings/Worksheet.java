package com.sgtesting.strings;
class Assign5
{
	void assignment5( String s)
	{
		String str=s;
		String a[]=str.split(" ");
		System.out.print(a[0]+"  "+a[1]+" ");
		String b=a[2];
		for(int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
	}
}



public class Worksheet {

	public static void main(String[] args) {
	Assign5 obj=new Assign5();
	obj.assignment5("Bangalore and Mysore");
	}
}
	


