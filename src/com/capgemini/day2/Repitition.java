package com.capgemini.day2;

public class Repitition {

	public static String removeRepitition(String input) {
		
		int len=input.length();
		String result="";
		int count = 0;
		
		for(int i=0;i<len;i++)
		{
			char x=input.charAt(i);
			count=0;
			for(int j=0;j<result.length();j++)
			{
				
				if(x==input.charAt(j))
					count++;
				
			}
			if(count==0)
				result+=x;
			
		}
		
		// TODO Auto-generated method stub
		return result;
	}

}
