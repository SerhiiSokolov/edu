package edu.hillel.hw3.arrays;


import static org.junit.Assert.*;

import org.junit.Test;

public class TestMainArrayClass {

	int[] ar={10,30,54,77,11,22,99,3};
	MainArray testArray=new MainArray();

	///////////////////////////////////////////////
	//Block testing get size of array
	@Test (expected=IllegalArgumentException.class)
	public void getSizeTest_NullArray() 
	{
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}		
	@Test
	public void getSizeTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test
	public void getSizeTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int actual=testArray.getSize();
		assertEquals(1, actual);
	}
	@Test
	public void getSizeTest_TwoArray() 
	{
		int[] ar={1,2};
		testArray.initArray(ar);
		int actual=testArray.getSize();
		assertEquals(2, actual);
	}
	@Test
	public void getSizeTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int actual=testArray.getSize();
		assertEquals(5, actual);
	}
	/////////////////////////////////////////////

	//Testing init array
	@Test
	public void initArrayTest_ManyElementsArray() 
	{
		int[] ar={10,30,54,77,11,22,99,3};
		testArray.initArray(ar);
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void initArrayTest_TwoElementsArray() 
	{
		int[] ar={10,30};
		testArray.initArray(ar);
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void initArrayTest_OneElementsArray() 
	{
		int[] ar={10};
		testArray.initArray(ar);
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void initArrayTest_ZeroElementsArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}

}