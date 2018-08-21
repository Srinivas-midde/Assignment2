package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Discount;

class DiscountTest {

	@Test
	void testbill() {
		assertEquals(65.0, Discount.bill(100,35));
		//fail("Not yet implemented");
	}

}
