package edu.hilllel.hw1.loop;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassLoop1Test {


	@Test
	public void testSumEven_1() 
	{
		int answer = ClassLoop1.sumEven(99);		
		assertEquals(2450, answer);
	}
	@Test
	public void testCountEven_1() 
	{
		int answer = ClassLoop1.countEven(99);		
		assertEquals(49, answer);
	}

}
