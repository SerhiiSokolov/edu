package edu.hilllel.hw1.func;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassFunc1Test {


	@Test
	public void testArrayMin_1() 
	{
		String answer = ClassFunc1.findDay(1);		
		assertEquals("Понедельник", answer);
	}
	@Test
	public void testArrayMin_2() 
	{
		String answer = ClassFunc1.findDay(5);		
		assertEquals("Пятница", answer);
	}
	
}
