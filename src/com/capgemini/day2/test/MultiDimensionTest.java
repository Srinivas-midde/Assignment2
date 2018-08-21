package com.capgemini.day2.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.MultiDimension;

class MultiDimensionTest {

	@Test
	void testsearch() {
		assertEquals(1, MultiDimension.search(new int[][] {{2,3,4},
															   {5,6,7}},
																2,3,7));
//		fail("Not yet implemented");
	}

}
