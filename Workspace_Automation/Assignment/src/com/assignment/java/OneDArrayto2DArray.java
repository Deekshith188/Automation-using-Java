package com.assignment.java;



public class OneDArrayto2DArray {
	public static void main(String[] args) {
		int arr[] = {25, 15, 20, 30, 5, 35,40};
		int k=0; 
		do
		{
			int j=k+1;
             if (k>arr.length-1){break;
			 }
			 
			do
			{
				if(arr[k] > arr[j])
				{
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;	
				}
				
				j++;
			}while(j<arr.length);
			System.out.print(arr[k]+ " ");
			k++;
		}while(k<arr.length); 
	}
}