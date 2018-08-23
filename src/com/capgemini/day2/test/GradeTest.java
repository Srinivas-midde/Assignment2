package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Grade;

class GradeTest {

	@Test
	void test() {
	
		assertEquals(1, Grade.cal(new int[] {65,65,65}));
		//fail("Not yet implemented");
	}

}
