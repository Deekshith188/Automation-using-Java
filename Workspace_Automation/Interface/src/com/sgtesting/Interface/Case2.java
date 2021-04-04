package com.sgtesting.Interface;

//Case 4: We can’t create an object for Interface; we can provide only object reference

interface University3
{
	void showUniversityName(String name);
}

interface EnggCollege2 
{
	abstract void showCity(String city);
}

class BMSEngg2 implements University3,EnggCollege2
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
public class Case2 {
	public static void main(String[] args) {
		University3 bms=new BMSEngg2();
		bms.showUniversityName("VTU University");
//		bms.showCity("Bangalore"); cann't accessible
//		bms.showAddress("7th Main,8th Stage Industrial Area"); cann't accessible
	}

}


