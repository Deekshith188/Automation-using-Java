package com.sgtesting.constructor;
class Envi
{
	String Meaning;
	String Componentsofenvironment;
	Envi(String a,String b)
	{
		Meaning ="the surroundings or conditions where we live";
		Componentsofenvironment ="atmosphere, hydrosphere, lithosphere and biosphere";
		System.out.println(Meaning);
		System.out.println(Componentsofenvironment);
	}
	
}
public class Environment {

	public static void main(String[] args) {
		Envi c=new Envi("The surroundings or conditions where we live","atmosphere, hydrosphere, lithosphere and biosphere");
	}

}
