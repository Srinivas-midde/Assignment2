package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Bubble;

class BubbleTest {

	@Test
	void testBubble() {
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, Bubble.sort(new int[] {2,6,3,4,7,1,8,5}));
		assertArrayEquals(new int[] {-1,0,1}, Bubble.sort(new int[] {1,0,-1}));
		assertArrayEquals(new int[] {97,98,99}, Bubble.sort(new int[] {'b','c','a'}));
		//assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, Bubble.sort(new int[] {2,6,3,4,7,1,8,5}));
		//fail("Not yet implemented");

	
	}
	

}
