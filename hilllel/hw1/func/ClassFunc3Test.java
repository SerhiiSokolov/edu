package edu.hilllel.hw1.func;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassFunc3Test {


	@Test
	public void testFunc3_1() 
	{
		int answer = ClassFunc3.convert("nine");		
		assertEquals(9, answer);
	}
	
	@Test
	public void testFunc3_2() 
	{
		int answer = ClassFunc3.convert("eleven");		
		assertEquals(11, answer);
	}
	
	@Test
	public void testFunc3_3() 
	{
		int answer = ClassFunc3.convert("twenty");		
		assertEquals(20, answer);
	}
	
	@Test
	public void testFunc3_4() 
	{
		int answer = ClassFunc3.convert("twenty-nine");		
		assertEquals(29, answer);
	}
	@Test
	
	public void testFunc3_5() 
	{
		int answer = ClassFunc3.convert("one hundred");		
		assertEquals(100, answer);
	}
	
	public void testFunc3_6() 
	{
		int answer = ClassFunc3.convert("two hundred one");		
		assertEquals(201, answer);
	}
	
	public void testFunc3_7() 
	{
		int answer = ClassFunc3.convert("four hundred eleven");		
		assertEquals(411, answer);
	}
	
	public void testFunc3_8() 
	{
		int answer = ClassFunc3.convert("six hundred fifty-one");		
		assertEquals(651, answer);
	}
}
