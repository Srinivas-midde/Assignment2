package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Repitition;

class RepititionTest {

	@Test
	void testremoveRepitition() {
		assertEquals("abc",Repitition.removeRepitition("abcbcaababc"));
		//fail("Not yet implemented");
	}

}
