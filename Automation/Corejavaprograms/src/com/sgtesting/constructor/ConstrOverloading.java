package com.sgtesting.constructor;
class Test
{
	Test(int m)
	{
		this("tank");
		System.out.println(m);
			}
	Test(String i)
	{
		
		System.out.println(i);
	}
}
public class ConstrOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test obj=new Test("sdvfsztgzdf");
Test objb=new Test(56);
	}

}
