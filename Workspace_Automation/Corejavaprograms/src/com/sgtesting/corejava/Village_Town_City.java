package com.sgtesting.corejava;
class Village
{
	String Locationofthevillage;
	String Nameofthevillage;
	int Population;
	Village()
	{
		Locationofthevillage="Near tumkur";
		Nameofthevillage="jalahalli";
		Population=350000;
		System.out.println(Locationofthevillage);
		System.out.println(Nameofthevillage);
		System.out.println(Population);
	}
}
class Town
{
	String nameofthetown;
	int Sizeofthetown;
	int Populationofthetown;
	Town()
	{
		nameofthetown="Doddaballapur";
		Populationofthetown=200000;
		Sizeofthetown=12000;
		System.out.println(nameofthetown);
		System.out.println(Populationofthetown);
		System.out.println(Sizeofthetown +"sqm");
	}
}
class City
{
	String nameofthecity;
	String Popularplaceinthecity;
	int Populationofthecity;
	City()
	{
		nameofthecity="bangalore";
		Popularplaceinthecity="lalbagh";
		Populationofthecity=3000000;
		System.out.println(nameofthecity);
		System.out.println(Popularplaceinthecity);
		System.out.println(Populationofthecity);
	}
}

public class Village_Town_City {

	public static void main(String[] args) {
		Village Village1=new Village();
		Village B=new Village();
		
		Town Town1 =new Town();
		
		
		City City1 =new City();
		
	
	}

}
