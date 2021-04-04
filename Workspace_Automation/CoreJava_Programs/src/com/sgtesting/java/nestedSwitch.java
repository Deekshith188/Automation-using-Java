package com.sgtesting.java;

public class nestedSwitch {

	public static void main(String[] args) {
		String country = "india";
		String state = "KA";

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
		case "pakistan":
			break;
		default:
			System.out.println("useless country");
		}

	}
}
