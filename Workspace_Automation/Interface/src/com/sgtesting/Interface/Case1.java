package com.sgtesting.Interface;
//Case 1: A sub class implements Abstract methods from the Interface

interface University
 {
	void showUniversityName(String name);
 } 

class BMSEngg implements University{
	
	public void showUniversityName(String name)
	{
		System.out.println("The Name of the University :"+name);
	}

	void showAddress(String address)
	{
		System.out.println("The Address is :"+address);
	}
}
public class Case1 {
	public static void main(String[] args) {
		BMSEngg bms=new BMSEngg();
		bms.showUniversityName("VTU University");
		bms.showAddress("7th Main,8th Stage Industrial Area");
	}


}
