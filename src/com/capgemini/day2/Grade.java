package com.capgemini.day2;

public class Grade {

	public static int cal(int[] marks) {
		int x=0;
		if(marks[0]>60)
			  x++;
		  if(marks[1]>60)
			  x++;
		  if(marks[2]>60)
			  x++;
		  if(x==1||x==0)
		  {
			  System.out.println("Failed");
			  return 3;
		  }
		  if(x==2) {
			  System.out.println("Promoted");
			  return 2;
		  }
		  if(x==3) {
			  System.out.println("Passed");
			  return 1;
		  }
		  return 0;
		// TODO Auto-generated method stub
		
	}
	

}
