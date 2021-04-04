package com.sgtesting.java;



public class Implicit {

	public static void main(String[] args) {
		String country = "indonasia";
		String state = "TN";
		
		switch(country)
		{
			case "india":
				switch(state)
				{
					case "KA":
						System.out.println("Sandlewood");
						break;
					case "TN":
						System.out.println("Kollywood");
						break;
					default:
						System.out.println("Invalid ");
				}
				break;
			case "israel":
				break;
			default:
				System.out.println("Invalid country");
	}

}
}