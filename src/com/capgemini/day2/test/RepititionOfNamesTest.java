package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.RepititionOfNames;

class RepititionOfNamesTest {

	@Test
	void testCount() {
		String names[]= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dey","Meery","Smith","Johnson","Bill","Williams",
				"Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
		assertEquals(2,RepititionOfNames.countRepeat(names,"Sam"));
		//fail("Not yet implemented");
	}

}
