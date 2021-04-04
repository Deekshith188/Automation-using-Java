package com.sgtesting.constructor;
class University1
{
String Nameoftheuniversity;
int yearofestablishment;
University1(String a,int b)
{
	Nameoftheuniversity="Bangalore";
	yearofestablishment=1960;
	System.out.println(Nameoftheuniversity+" University");
	System.out.println(yearofestablishment);
}
}

public class University {

	public static void main(String[] args) {
		University1 obj=new University1("Bangalore",1960);
		
	}

}
