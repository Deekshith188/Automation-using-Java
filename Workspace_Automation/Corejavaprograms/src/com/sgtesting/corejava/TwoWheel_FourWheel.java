package com.sgtesting.corejava;
class TwoWheel
{
	String brandofthebike;
	String nameofthebike;
	String modelofthebike;
	int Mileageofthebike;
	TwoWheel()
	{
		brandofthebike="Bajaj";
		nameofthebike="Pulsar";
		modelofthebike="200Ns";
		Mileageofthebike=35 ;
		System.out.println(nameofthebike);
		System.out.println(modelofthebike);
		System.out.println(Mileageofthebike +"Kmpl");
		System.out.println("__________________________________________________");
	}
}
class FourWheel
{
	String brandofthecar;
	String nameofthecar;
	int modelofthecar;
	int Mileageofthecar;
	FourWheel()
	{
		brandofthecar="Tata";
		nameofthecar="Tata Harrier";
		modelofthecar=2020;
		Mileageofthecar=12 ;
		System.out.println(brandofthecar);
		System.out.println(nameofthecar);
		System.out.println(modelofthecar);
		System.out.println(Mileageofthecar);
		System.out.println("__________________________________________________");
	}
}
public class TwoWheel_FourWheel {

	public static void main(String[] args) {
		TwoWheel Bajaj1=new TwoWheel();
		
		FourWheel b=new FourWheel();
		
		}

}
