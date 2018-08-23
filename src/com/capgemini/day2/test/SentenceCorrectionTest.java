package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SentenceCorrection;

class SentenceCorrectionTest {

	@Test
	void testcorrection() {
		assertEquals("this is a sentence", SentenceCorrection.correction("this is is  a sentence","is",3));
		//fail("Not yet implemented");
	}

}
