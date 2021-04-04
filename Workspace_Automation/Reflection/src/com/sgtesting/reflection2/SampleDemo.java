package com.sgtesting.reflection2;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.sgtesting.reflection2.Sample");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
