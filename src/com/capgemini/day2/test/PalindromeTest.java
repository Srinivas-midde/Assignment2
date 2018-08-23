package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Palindrome;

class PalindromeTest {

	

	@Test
	void testcheck() {
		assertEquals(1,Palindrome.checkPalindrome("121"));
		//fail("Not yet implemented");
	}

}
