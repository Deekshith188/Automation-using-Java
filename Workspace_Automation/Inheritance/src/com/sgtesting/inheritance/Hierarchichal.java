package com.sgtesting.inheritance;
class Cricket 
{
	void T20(String s,int age)
	{
		System.out.println("RCB Captain: "+s);
		System.out.println("Age of the Player: "+age);
	}
}
class T20 extends Cricket
{
	void Worldcup(int a,String s)
	{
		System.out.println(" captain of India: "+s);
		System.out.println("No. of Players in Oneday: "+a);
	}
}
class Oneday extends Cricket
{
	void Ranaji (String x,int n)
	{
		System.out.println("name a ranaji player: "+x);
		System.out.println("no of runs Scored was: "+n);
	}
}
public class Hierarchichal {

	public static void main(String[] args) {
		Oneday o=new Oneday();
		o.Ranaji("K L rahul", 600);
		o.T20("virat", 15);
		T20 o1=new T20();
		o1.Worldcup(11,"Virat Kohli" );
		o1.T20("Virat", 15);

	}

}