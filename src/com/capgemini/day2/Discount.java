package com.capgemini.day2;

public class Discount {

	public static double bill(int originalprice, int discount) {
		double finalprice;
		double x=(double)discount/100;
		finalprice=(originalprice-(originalprice*x));
		//System.out.println(x);
		// TODO Auto-generated method stub
		return finalprice;
	}

}
