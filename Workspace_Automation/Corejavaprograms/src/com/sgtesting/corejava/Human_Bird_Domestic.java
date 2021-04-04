package com.sgtesting.corejava;
class Human1
{
	String Firstname;
	String City;
	int Distance;
}
class Bird1
{
	String colourofthebird;
	int noofwings;
}
class Domestic1
{
	String typeoftheanimal;
	int nooftail;
}
public class Human_Bird_Domestic
{
public static void main (String[] args) {
	Human1 Deekshith=new Human1 ();
	Deekshith.Firstname="B U";
	Deekshith.City="Doddaballapur";
	Deekshith.Distance= 40;
	System.out.println(Deekshith.Firstname);
	System.out.println(Deekshith.City);
	System.out.println(Deekshith.Distance);	
	System.out.println("---------------------------------------------------------------");
	Bird1 Owl=new Bird1();
	Owl.colourofthebird="White";
	Owl.noofwings=2;
	System.out.println(Owl.colourofthebird);
	System.out.println(Owl.noofwings);
	System.out.println("---------------------------------------------------------------");
    Domestic1 lion=new Domestic1();
    lion.typeoftheanimal="carnivoroous";
    lion.nooftail=2;
    System.out.println("---------------------------------------------------------------");
  	}
}
