package com.sgtesting.constructor;
class Man1
{
	String FirstName;
	int age;
	Man1(String fn,int Age)
	{
		FirstName="Deekshith";
		age=20;
	System.out.println(FirstName);
	System.out.println(age);
	
	}

}
public class ParaConstructor {
	public static void main(String args[])
	{
		Man1 a=new Man1("Deekshith",20);
	}

}
