package com.capgemini.day2;

public class ArmstrongRange {

	public static int[] range(int start, int end) {
		
		int number;
		int digit;
		int sum;
		int resultArmstrong[]=new int[4];
		int index=0;
		for(int i= start;i<=end;i++)
		{
			number=i;
			sum=0;
			while(number!=0)
			{
				digit=number%10;
				sum=sum + digit * digit * digit;
				number = number / 10;
			}
			if(sum==i)
			{
				resultArmstrong[index++] = i;
			}
		}
		return resultArmstrong;
	}

}
