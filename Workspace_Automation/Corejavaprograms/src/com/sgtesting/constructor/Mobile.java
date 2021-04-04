package com.sgtesting.constructor;
class Phone
{
	String BrandName;
	int Price;
	Phone(String a,int b)
	{
		BrandName="Samsung";
		Price=15000;
		System.out.println(BrandName);
		System.out.println(Price);
	}
}
public class Mobile {

	public static void main(String[] args) {
		Phone s=new Phone("Samsung",15000);
		

	}

}
