package com.sgtesting.javapractice;

public class TestPattern {

	public static void main(String[] args) {
		char ch='#';
		int i=5;
		
		do 
		{
			int k=1;
			do
			{
				System.out.print(ch+" ");
				k++;
				
			}while(k<=i);
			i--;
			System.out.println();
		}while(i>=1);
			
		}
	

	}


