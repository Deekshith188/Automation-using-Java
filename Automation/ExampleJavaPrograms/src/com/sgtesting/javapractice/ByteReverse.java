package com.sgtesting.javapractice;

public class ByteReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x[][]= {{22,32,42,52,62},{20,30,40,50,60,}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
			System.out.print(x[i][j]+"  ");	
			}
			System.out.println();
		}
			
		}

	}


