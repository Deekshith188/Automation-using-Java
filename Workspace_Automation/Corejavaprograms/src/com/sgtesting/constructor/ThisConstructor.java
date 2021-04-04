package com.sgtesting.constructor;
class Xyz
{
	String FirstName;
	
	int age;
	Xyz(String a,int age)
	{
		FirstName="Barat";
		
		this.age=age;
		System.out.println(FirstName);
		
		System.out.println(age);
	}
	void Display()
	{
		System.out.println(FirstName);
		System.out.println(age);
	}
}
public class ThisConstructor {

	public static void main(String[] args) {
		Xyz a=new Xyz("Barat",542242);
		a.Display();
		

	}

}
