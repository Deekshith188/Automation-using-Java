package com.sgtesting.corejava;
public class Bird
{
	String colourofthebird;
	int noofwings;
	public static void main(String args[])
	{
		Bird Pigeon=new Bird();
		Pigeon.colourofthebird="grey";
		Pigeon.noofwings=2;
		System.out.println(Pigeon.colourofthebird);
		System.out.println(Pigeon.noofwings);		
	}
}
