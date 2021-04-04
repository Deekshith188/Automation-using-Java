package com.sgtesting.strings;
class Sample
{
	String firstName;
	int age;
	Sample(String fn,int age)
	{
		firstName=fn;
		this.age=age;
	}
	public String toString()
	{
		return "The First Name of Student "+firstName+" and his age "+this.age;
	}
	void division(int x,int y)
	{
		try
		{
			int Res=x/y;
			System.out.println("Division:"+Res);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class StringsDemo {
	public static void main(String[] args) {
		Sample s=new Sample("Santosh",17);
		System.out.println(s);
		s.division(20, 0);
	}

}

