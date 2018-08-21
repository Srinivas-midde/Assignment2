package com.capgemini.day2;

public class Armstrong {

	public static int check(int i) {
		int sum=0;
		int input=Math.abs(i);
		int duplicate=input;
		while(input>0)
		{
			int reminder=input%10;
						
			sum+= reminder*reminder*reminder ;
			input/=10;

			
		}
		if(duplicate==sum)
		{
			return 1;
		}
		else
		return 0;
		
		// TODO Auto-generated method stub
		//return null;
	}

}
