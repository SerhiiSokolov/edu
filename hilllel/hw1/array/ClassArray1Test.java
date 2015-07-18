package edu.hilllel.hw1.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassArray1Test {


	@Test
	public void testArrayMin_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.findMin(array);		
		assertEquals(0, answer);
	}
	@Test
	public void testArrayMin_2() 
	{
		int[] array=new int[]{5,2,1,4,5,-10,0,8,9,10};
		int answer = ClassArray1.findMin(array);		
		assertEquals(-10, answer);
	}
	
}
