package com.capgemini.day2;

public class Cui {

	
	public static int checkId(String userId, String password, String id, String pwd) {
		if(userId.equals(id) && password.equals(pwd))
		{
			return 1;
		}
		// TODO Auto-generated method stub
		else
		return 0;
	}
}