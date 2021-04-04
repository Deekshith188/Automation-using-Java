package com.sgtesting.java;
class  Fibo1
{
	int [] fibo()
	{
		int arr[]=new int[10];
		int c=0;
		int a=0;
		int b=1;
		int k=0;
		for(int i=1; i<=10;i++)
		{
			arr[k]=c;
			c=a+b;
			a=b;
			b=c;
			k++;
		}
		return arr;
	}
}
		
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo1 obj=new Fibo1();
		int x[]=obj.fibo();
	
		for(int y:x)
		{
			System.out.println(y);
		}
	}


	}