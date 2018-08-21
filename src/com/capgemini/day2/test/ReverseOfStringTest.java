package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ReverseOfString;

class ReverseOfStringTest {

	@Test
	void testreverse() {
		assertEquals("siht si ", ReverseOfString.reverse("this is"));		
//		fail("Not yet implemented");
	}

}
