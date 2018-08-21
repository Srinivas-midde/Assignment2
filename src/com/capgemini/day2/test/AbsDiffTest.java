package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import com.capgemini.day2.AbsDiff;

class AbsDiffTest {

	@Test
	void testAbsDiff() {
		int input[]={1,2,4,5,2,1};
		assertEquals(1, AbsDiff.check(input,3));
		assertEquals(0, AbsDiff.check(input,1));
		assertEquals(0, AbsDiff.check(input,2));
		//assert
		//fail("Not yet implemented");
	}                   

}
