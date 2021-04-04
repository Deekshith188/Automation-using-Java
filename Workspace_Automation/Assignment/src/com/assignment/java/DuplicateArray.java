package com.assignment.java;

public class DuplicateArray {

	public static void main(String[] args) {
		
			int arr[] = {1, 1, 3, 4, 6, 7, 8, 9, 3, 6};
			
			for(int i=0; i<arr.length; i++)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]==arr[j]) {
						System.out.println("Duplicate numbers in the array are : " + arr[i]);
					}
				}
			}
		
	}

}
