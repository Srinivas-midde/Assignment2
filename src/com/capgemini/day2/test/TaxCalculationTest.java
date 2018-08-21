package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.TaxCalculation;

class TaxCalculationTest {

	@Test
	void testcal() {
		assertEquals(47600, TaxCalculation.cal(350000),0.2);
//		fail("Not yet implemented");
	}

}
