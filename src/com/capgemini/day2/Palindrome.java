package com.capgemini.day2;

public class Palindrome {

	public static int checkPalindrome(String input) {
		int n=input.length();
		String output = "";
		for(int i=n-1;i>=0;i--)
		{
			output= output + input.charAt(i);
		}
		if(input.equals(output))
		{
			System.out.println("Given string is a palindrome");return 1;
		}
		else
			System.out.println("not a palindrome");return 0;
		// TODO Auto-generated method stub
//		return null;
	}

}
