package com.sgtesting.inheritance;
class College
{
	College (String s,String a)
	{
		System.out.println("Name of the College :"+s);
		System.out.println("Place of the College:"+a);
	}
}
class Branch2 extends College
{
	String m;
	Branch2 (String m,String s,String a)
	{
		super(s,a);
		System.out.println("Name of the Branch:"+m);
	}
}
class Branch1 extends College
{
	int n;
	String c;
	Branch1(String c,int n,String s,String a)
	{
		super(s,a);
		System.out.println("No of students:"+n);
		System.out.println("Name of the Branch:"+c);
	}
}
public class Assign5 {

	public static void main(String[] args) {
		Branch2 o1=new Branch2("Civil","UVCE","Bngalore");
		Branch1 o2=new Branch1("Mechanical",50,"Uvce","Banglore");

	}

}
