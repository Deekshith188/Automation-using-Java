package com.sgtesting.constructor;
class CapitolCity
{
	CapitolCity(String h,String b,String c)
	{
		System.out.println(h+b+c);
	}
CapitolCity(int a)
{
	System.out.println(a);
}
}

public class ConstructorCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CapitolCity x=new CapitolCity("Bangalore","Doddaballapur","Busstand");
CapitolCity y=new CapitolCity(5444445);
	}

}
