package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.NumberMissing;

class NumberMissingTest {

	@Test
	void testfind() {
		assertEquals(2, NumberMissing.find(new int[] {0,1,3,4,5},6));
//		fail("Not yet implemented");
	}

}
