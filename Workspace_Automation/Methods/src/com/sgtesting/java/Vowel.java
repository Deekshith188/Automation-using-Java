package com.sgtesting.java;

class VowelOrNot
{
	boolean display()
	{
		char ch='A';
		if(ch=='a' || ch=='A' || ch=='e'|| ch=='E' || ch=='i' || ch=='I' || ch=='o'|| ch=='O'|| ch=='u' || ch=='U')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VowelOrNot obj=new VowelOrNot();
		boolean x=obj.display();
	
			System.out.println(x);
		
	}

}