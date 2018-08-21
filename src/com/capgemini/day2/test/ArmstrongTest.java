package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class ArmstrongTest {

	@Test
	void testArmstrong() {
		assertEquals(1, Armstrong.check(153));
		assertEquals(1, Armstrong.check(-153));
		assertEquals(0, Armstrong.check(0xABC));
		assertEquals(0, Armstrong.check(140));
		//fail("Not yet implemented");
	}

	

	

}
