package com.sgtesting.inheritance;
//Super class and Sub class contains same method name with signature
class Old
{
	void show(String s)
	{
		System.out.println("It is a super class:"+s);
	}
}
class New extends Old
{
	New(String s)
	{
		super.show(s);
	}
	void Show(String city)
	{
		System.out.println("it is a sub class:"+city);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		New o=new New("yes it is a super class");
		o.Show("bangalore");
	}

}
