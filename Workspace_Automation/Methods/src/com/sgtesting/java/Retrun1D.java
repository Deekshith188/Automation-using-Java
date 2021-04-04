package com.sgtesting.java;
class Return1Darray
{
	String [] Return()
	{
		String x[]= {"cat","dog","bird"};
		return x;
	}
}
public class Retrun1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Return1Darray obj = new Return1Darray();
		String b[]= obj.Return();
		for(String y:b)
		{
			System.out.println(y);
		}
	}

	}
