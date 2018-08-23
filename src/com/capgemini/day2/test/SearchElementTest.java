package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SearchElement;

class SearchElementTest {

	@Test
	void testelement() {
		assertEquals(1, SearchElement.element(new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47},1));
		//fail("Not yet implemented");
	}

}
