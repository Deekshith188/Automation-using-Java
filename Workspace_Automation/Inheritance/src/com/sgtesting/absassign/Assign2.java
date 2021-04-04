package com.sgtesting.absassign;
abstract class Abs
{
	abstract void Tourist(String name,int age);
	abstract void TouristPlace(String Name);
	abstract void NoOfDays(int Days);
	void ShowPlaces(String s[])
	{
		for (String kk:s)
		{
			System.out.println(kk);
		}
	}
}
class Abs1 extends Abs
{
	void Tourist(String name,int age)
	{
		System.out.println("Tourist Name: "+name);
		System.out.println("Tourist Age : "+age);
	}
	void TouristPlace(String Name)
	{
		System.out.println("State name: "+Name);
	}
	void NoOfDays(int Days)
	{
		System.out.println("no of days : "+Days);
	}
}
class BBs extends Abs1
{
	void display(String s)
	{
		System.out.println(s);
	}
}
public class Assign2 {

	public static void main(String[] args) {
		BBs obj=new BBs();
		String s[]= {"Bangalore","AndhraPradesh","Maharastra","Goa"};
		obj.ShowPlaces(s);
		obj.Tourist("Deekshith", 22);
		
		obj.TouristPlace("Karnataka");
		obj.NoOfDays(10);
		obj.display("Thank you Visit again");
	}
}