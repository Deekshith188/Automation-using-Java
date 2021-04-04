package com.sgtesting.constructor;
class Organisation
{
	String CompanyName;
	int numofemployee;
	Organisation(String a,int b)
	{
		CompanyName="Bremer";
		numofemployee=100;
		System.out.println(CompanyName);
		System.out.println(numofemployee +"employee");
	}
}
public class Employee {

	public static void main(String[] args) {
		Organisation n=new Organisation("Bremer",100);
		

	}

}
