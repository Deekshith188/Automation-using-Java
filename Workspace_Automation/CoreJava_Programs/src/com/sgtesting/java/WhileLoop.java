package com.sgtesting.java;

public class WhileLoop {

	public static void main(String[] args) {
		int a=1;
        while(a<=10)
        {
        	System.out.println(a);
        	a++;
        	
        }
        int x=1;
        int row=1;
        while(row<=3)
        {
        	int col=1;
        	while(col<=3)
        	{
        		System.out.print(x+" ");
        		x++;
        		col++;
        	}
        row++;
        System.out.println();
        }
       
	}
}
