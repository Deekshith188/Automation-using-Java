package com.sgtesting.inheritance;
class Maths11
{
	Maths11(int y,String s)
	{
	System.out.println("No.of Fruits:"+y);
	System.out.println("Name of the first fruit:"+s) ;
	}
}
class Algebra extends Maths11
{
	String m;
    Algebra (String m,int y,String s)
    {
    	
    super(y,s);
    this.m=m;
    System.out.println("Second Fruit Name:"+m);
    	
    }
	
}
class Maths2 extends Algebra
{
	String x;
	Maths2(String x,String m,int y,String s)
	{
	super(m,y,s);
	System.out.println("Last Fruit Name :"+x);
	}
}
public class Assign4 {

	public static void main(String[] args) {
		Maths2 o=new Maths2("lichi","mango",30,"apple");

	}

}
