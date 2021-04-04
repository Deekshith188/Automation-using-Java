package com.sgtesting.java;
class OddNO
{
	int [] oddnum()
	{
		int size=0;
		for(int i=71;i>=51;i--)
		{
			if(i%2==1)
			{
				size=size+1;
			}
		}
		System.out.println("Array Size:"+size);
		
		int a[]=new int[size];
		int k=0;
		for(int i=71; i>=51; i--)
		{
			if(i%2==1)
			{
				a[k]=i;
				k++;
			}
		}
		return a;
		
	}
}
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNO obj = new OddNO();
		int b[]=obj.oddnum();
		
		for(int x:b)
		{
			System.out.println(x);
		}
	}

}

