package com.sgtesting.inheritance;
class University
{
	void University (String s,int a)
	{
	System.out.println("Name of the University:"+s);
	System.out.println("year of joining :"+a);
		
	}
}
class Branch extends University
{
	void abc (String m)
	{
		System.out.println("Branch Name is:"+m);
	}
}
class Section extends Branch
{
	void sec(String c)
	{
		
		System.out.println("Section:"+c);
	}
}
class Regno extends Section
{
	void Regno (int n)
	{
		System.out.println("Reg No is:"+n);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Regno o=new Regno();
		o.sec("A");
		o.abc("Civil Engineereing ");
		o.University("Bangalore University", 2017);
		o.Regno(001);
	}

}
