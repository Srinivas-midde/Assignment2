package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.InterestRate;

class InterestRateTest {

	@Test
	void testinterest() {
		assertArrayEquals(new double[]{240,484008},InterestRate.interest(new int[] {20,30,40}),1);
		//fail("Not yet implemented");

	}
}
