package com.sgtesting.constructor;
class Human
{
String FirstName;
	int age; 
	Human()
	{
		FirstName="Virat";
		age=32;
		System.out.println(FirstName +" Kohli");
		System.out.println(age);
	}
	
	}
	


public class Parameterized_Constructor_Demo {

	public static void main(String[] args) {
		Human a=new Human();
		
	}
}
