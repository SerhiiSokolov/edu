package edu.hilllel.hw1.ifelse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassBase1Test {


	@Test
	public void testEven_1() 
	{
		int answer = ClassBase1.testEven(1, 1);		
		assertEquals(2, answer);
	}
	@Test
	public void testEven_2() 
	{
		int answer = ClassBase1.testEven(2, 1);		
		assertEquals(2, answer);
	}
	@Test
	public void testEven_3() 
	{
		int answer = ClassBase1.testEven(11, 1);		
		assertEquals(12, answer);
	}
	@Test
	public void testEven_4() 
	{
		int answer = ClassBase1.testEven(16, 10);		
		assertEquals(160, answer);
	}

}
