package com.assignment.java;

class Substraction
{
	Substraction(int x[], int y[])
	{

		int res[] = new int[x.length];

		if(x.length == y.length) 
		{
			for(int i=0; i<x.length; i++) {
				res[i] = x[i] - y[i];
			}

			System.out.println(res);
		}else 
		{
			System.out.println("matrix substraction is not possible");
		}

	}

}
public class ConstructorAssignment2 {

	public static void main(String[] args) {

		Substraction obj = new Substraction(new int [] {11, 22, 33}, new int [] {11, 22, 33});
	}

}

