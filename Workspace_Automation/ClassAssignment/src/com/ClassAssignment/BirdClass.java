package com.ClassAssignment;

class Birds
{
	Birds(String Name,String Colour,int Speed)
	{
		System.out.println("Name of the Bird:"+Name);
		System.out.println("Colour of the Bird:"+Colour);
		System.out.println("Speed of the Bird:"+Speed +"kmph");
		
	}
}
public class BirdClass {

	public static void main(String[] args) {
	Birds obj=new Birds("Parrot","Green",36);
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	Birds obj1=new Birds("Eagle","Black and Brown",120);
	}

}
