package com.sgtesting.constructor;
class Emp
{
 Emp(String a)
 {
	 
	 System.out.println(a);
	  }
Emp(int i)
{
	this("hvc");
	System.out.println(i);
}
}

public class ConstrucEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp obj=new Emp("Deek");
Emp obj2=new Emp(4);
	}

}
