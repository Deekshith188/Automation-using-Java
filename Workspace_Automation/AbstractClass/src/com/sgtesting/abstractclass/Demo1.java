package com.sgtesting.abstractclass;
abstract class EnggCollege
{
	abstract void showCollegeName(String name);
	abstract void showCityName(String cityname);
	void showBranches(String branches[])
	{
		System.out.println("Branch Names...");
		for(String branch:branches)
		{
			System.out.println(branch);
		}
	}
}
class SLNEngg extends EnggCollege
{
	void showCollegeName(String name)
	{
		System.out.println("The Enginering College Name :"+name);
	}
	
	void showCityName(String cityname)
	{
		System.out.println("The City Name in which Engg College exists:"+cityname);
	}
	
	void showAddress(String address)
	{
		System.out.println("The Address of Engg College :"+address);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		SLNEngg sln=new SLNEngg();
		String a[]= {"CSE","EEE","Civil","Mech"};
		sln.showBranches(a);
		sln.showCollegeName("SLN Engg College");
		sln.showCityName("Bangalore");
		sln.showAddress("7th Main 6th Cross RPC Layout");

	}
	

}

