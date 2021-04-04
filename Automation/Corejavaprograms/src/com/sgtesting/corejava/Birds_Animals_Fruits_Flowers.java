package com.sgtesting.corejava;
class Birds
{
String Typeofthebird;
String Exampleofthtype;
Birds()
{
	Typeofthebird="Tweety Bird";
	Exampleofthtype="Sparrow";
	System.out.println(Typeofthebird);
	System.out.println(Exampleofthtype);
    System.out.println("__________________________________________________________");
}
}
class Animals
{
String Typesofanimals;
String Exampleofthetypes;
Animals()
{
	Typesofanimals="Herbivorous&Carnivorous";
	Exampleofthetypes="Deer&Lion";
	System.out.println(Typesofanimals);
	System.out.println(Exampleofthetypes);
    System.out.println("__________________________________________________________");
}
}
class Flower 
{
String Nameoftheflower;
String Colouroftheflower;
Flower()
{
	Nameoftheflower="Hibiscus";
	Colouroftheflower="Red";
	System.out.println(Nameoftheflower);
	System.out.println(Colouroftheflower);
    System.out.println("__________________________________________________________");	
}
}
class Fruits
{
String Nameofthefruit;
String Colourofthefruit;
}
public class Birds_Animals_Fruits_Flowers {

	public static void main(String[] args) {
		Birds Bird=new Birds();
		
        Animals Animal=new Animals();
		 
        Fruits Flower=new Fruits();
		
        Flower Fruit=new Flower();
		 
	}

}
