package com.sgtesting.java;
class TwoArray
{
	void Two()
	{
		int a[][]= {{2,3,4,5,6},{9,8,7,6,5}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
				
	}
}
public class TwodArray {

	public static void main(String[] args) {
		TwoArray obj=new TwoArray();
		obj.Two();
		
		

	}

}
