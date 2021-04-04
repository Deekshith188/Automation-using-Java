package com.ClassAssignment;
class Animal
{
	
	Animal(String Name,String Type,String Colour,int age )
	{
		System.out.println("Name of the Animal:"+Name);
		System.out.println("Family of the Animal:"+Type);
		System.out.println("Colour of the Animal:"+Colour);
		System.out.println("Life Span is:"+age);
		
	}
	
}
public class Assignment1 {
	public static void main(String[] args) {
		Animal obj=new Animal("Panther","Cat Family","Black",17);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Animal obj2=new Animal("Panda","Bear Family","Black and White",20);
	}
}
