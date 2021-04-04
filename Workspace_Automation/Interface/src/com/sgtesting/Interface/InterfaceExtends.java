package com.sgtesting.Interface;
//Case 3: An Interface extends another Interface

interface University2
{
	void showUniversityName(String name);
}

interface EnggColl1 extends University2
{
	abstract void showCity(String city);
}

class BMSEnggColl1 implements EnggCollege1
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
public class InterfaceExtends {
	public static void main(String[] args) {
		BMSEnggColl1 bms=new BMSEnggColl1();
		bms.showUniversityName("VTU University");
		bms.showCity("Bangalore");
		bms.showAddress("7th Main,8th Stage Industrial Area");
	}

}

