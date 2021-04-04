package com.sgtesting.Interface;
//Case 2: Multiple inheritance using Interfaces

interface University1
{
	void showUniversityName(String name);
}

interface EnggCollege1
{
	abstract void showCity(String city);
}

class BMSEnggColl implements University1,EnggCollege1
{
	public void showUniversityName(String name)
	{
		System.out.println("The Name of the University :"+name);
	}
	
	public void showCity(String city)
	{
		System.out.println("The City Name is:"+city);
	}
	
	void showAddress(String address)
	{
		System.out.println("The Address is :"+address);
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		BMSEnggColl bms=new BMSEnggColl();
		bms.showUniversityName("VTU University");
		bms.showCity("Bangalore");
		bms.showAddress("7th Main,8th Stage Industrial Area");
	}

}

