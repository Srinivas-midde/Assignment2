package com.capgemini.day2;

public class Bubble {

	public static int[] sort(int[] input) {
		//int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
		int temp;
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length-1-i;j++)
			{
				if(input[j]>input[j+1])
				{
					temp=input[j+1];
					input[j+1]=input[j];
					input[j]=temp;
				}
			}
		}
		return input;
		
		// TODO Auto-generated method stub
		
	}

}
