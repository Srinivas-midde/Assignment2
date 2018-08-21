package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;

class DateTest {

	@Test
	void testDate() {
		assertEquals("02/jun/1997", Date.reverse("02,06,1997"));
		//assertEquals("02/jun/1997", Date.reverse("02,06,1997"));
		//fail("Not yet implemented");
	}

}
