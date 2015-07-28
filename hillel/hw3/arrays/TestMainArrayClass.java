package edu.hillel.hw3.arrays;


import static org.junit.Assert.*;

import org.junit.Test;

public class TestMainArrayClass {


	MainArray testArray=new MainArray();

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

	@Test (expected=IllegalArgumentException.class)
	public void initArrayTest_NullArray() 
	{
		int[] ar=null;
		testArray.initArray(ar);
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}

	///////////////////////////////////////////////
	//Block testing get size of array
	@Test (expected=IllegalArgumentException.class)
	public void getSizeTest_NullArray() 
	{
		int actual=testArray.getSize();
		assertEquals(null, actual);
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
	//Test add first element to array
	@Test
	public void addStartTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		testArray.addStart(10);		
		int actual=testArray.getStart();
		assertEquals(10, actual);
	}
	@Test
	public void addStartTest_TwoArray() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.addStart(10);		
		int actual=testArray.getStart();
		assertEquals(10, actual);
	}
	@Test
	public void addStartTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		testArray.addStart(10);		
		int actual=testArray.getStart();
		assertEquals(10, actual);
	}
	@Test
	public void addStartTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		testArray.addStart(10);		
		int actual=testArray.getStart();
		assertEquals(10, actual);
	}

	@Test (expected=IllegalArgumentException.class)
	public void addStartTest_NullArray() 
	{
		//int[] ar=null;
		//testArray.initArray(ar);
		testArray.addStart(10);
		int actual=testArray.getStart();
		//assertEquals(ar, actual);
	}
	/////////////////////////////////////
	//Test add last element to array
	@Test
	public void addEndTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		testArray.addEnd(10);		
		int actual=testArray.getEnd();
		assertEquals(10, actual);
	}
	@Test
	public void addEndTest_TwoArray() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.addEnd(10);		
		int actual=testArray.getEnd();
		assertEquals(10, actual);
	}
	@Test
	public void addEndTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		testArray.addEnd(10);		
		int actual=testArray.getEnd();
		assertEquals(10, actual);
	}
	@Test
	public void addEndTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		testArray.addEnd(10);		
		int actual=testArray.getEnd();
		assertEquals(10, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void addEndTest_NullArray() 
	{
		testArray.addEnd(10);
	}

	/////////////////////////////////////
	//Test add element to position
	@Test
	public void addPosTest_ManyArray1() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int pos=5;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_ManyArray2() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int pos=4;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_ManyArray3() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int pos=0;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_ManyArray4() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int pos=3;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_TwoArray1() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		int pos=0;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_TwoArray2() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		int pos=1;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_TwoArray3() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		int pos=2;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_OneArray1() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int pos=0;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int pos=1;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test
	public void addPosTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int pos=0;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void addPosTest_OutOfRangeArray1() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int pos=10;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void addPosTest_OutOfRangeArray2() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int pos=-1;
		testArray.addPos(pos,10);		
		int actual=testArray.getPos(pos);
		assertEquals(10, actual);
	}	
	@Test (expected=IllegalArgumentException.class)
	public void addPosTest_NullArray() 
	{
		testArray.addPos(10,10);		
	}

	///////////////////////////////////////
	//Test delete first element from array
	@Test
	public void delStartTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		testArray.delStart();		
		int actual=testArray.getPos(0);
		assertEquals(4, actual);
	}
	@Test
	public void delStartTest_TwoArray() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.delStart();		
		int actual=testArray.getPos(0);
		assertEquals(4, actual);
	}
	@Test
	public void delStartTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		testArray.delStart();		
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void delStartTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		testArray.delStart();		
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void delStartTest_NullArray() 
	{
		testArray.delStart();		
	}

	///////////////////////////////////////
	//Test delete last element from array
	@Test
	public void delEndTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		testArray.delEnd();		
		int actual=testArray.getPos(3);
		assertEquals(2, actual);
	}
	@Test
	public void delEndTest_TwoArray() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.delEnd();		
		int actual=testArray.getPos(0);
		assertEquals(1, actual);
	}
	@Test
	public void delEndTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		testArray.delEnd();		
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void delEndTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		testArray.delEnd();		
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void delEndTest_NullArray() 
	{
		testArray.delEnd();		
	}

	///////////////////////////////////////
	//Test delete element from position
	@Test
	public void delPosTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		testArray.delPos(4);		
		int actual=testArray.getPos(3);
		assertEquals(2, actual);
	}
	@Test
	public void delPosTest_TwoArray() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.delPos(1);		
		int actual=testArray.getPos(0);
		assertEquals(1, actual);
	}
	@Test 
	public void delPosTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		testArray.delPos(0);		
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void delPosTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		testArray.delPos(0);		
		int actual=testArray.getSize();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void delPosTest_NullArray() 
	{
		testArray.delPos(0);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void delPosTest_OutOfRangeMin() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.delPos(-1);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void delPosTest_OutOfRangeMax() 
	{
		int[] ar={1,4};
		testArray.initArray(ar);
		testArray.delPos(10);		
	}
	///////////////////////////////////////
	//Find min number in array
	@Test
	public void findMinTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int actual=testArray.findMin();
		assertEquals(1, actual);
	}
	@Test
	public void findMinTest_TwoArray() 
	{
		int[] ar={1,0};
		testArray.initArray(ar);
		int actual=testArray.findMin();
		assertEquals(0, actual);
	}
	@Test
	public void findMinTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int actual=testArray.findMin();
		assertEquals(1, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMinTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		testArray.findMin();
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMinTest_NullArray() 
	{
		testArray.findMin();
	}

	///////////////////////////////////////
	//Find max number in array
	@Test
	public void findMaxTest_ManyArray() 
	{
		int[] ar={1,4,5,2,8};
		testArray.initArray(ar);
		int actual=testArray.findMax();
		assertEquals(8, actual);
	}
	@Test
	public void findMaxTest_TwoArray() 
	{
		int[] ar={1,0};
		testArray.initArray(ar);
		int actual=testArray.findMax();
		assertEquals(1, actual);
	}
	@Test
	public void findMaxTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int actual=testArray.findMax();
		assertEquals(1, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMaxTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int actual=testArray.findMax();
		assertEquals(1, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMaxTest_NullArray() 
	{
		testArray.findMax();
	}

	///////////////////////////////////////
	//Find min number in array and return index
	@Test
	public void findMinIndexTest_ManyArray() 
	{
		int[] ar={5,4,1,2,8};
		testArray.initArray(ar);
		int actual=testArray.findMinIndex();
		assertEquals(2, actual);
	}
	@Test
	public void findMinIndexTest_TwoArray() 
	{
		int[] ar={1,0};
		testArray.initArray(ar);
		int actual=testArray.findMinIndex();
		assertEquals(1, actual);
	}
	@Test
	public void findMinIndexTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int actual=testArray.findMinIndex();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMinIndexTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int actual=testArray.findMinIndex();
		assertEquals(1, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMinIndexTest_NullArray() 
	{
		testArray.findMinIndex();
	}
	///////////////////////////////////////
	//Find max number in array and return index
	@Test
	public void findMaxIndexTest_ManyArray() 
	{
		int[] ar={5,4,8,2,1};
		testArray.initArray(ar);
		int actual=testArray.findMaxIndex();
		assertEquals(2, actual);
	}
	@Test
	public void findMaxIndexTest_TwoArray() 
	{
		int[] ar={1,0};
		testArray.initArray(ar);
		int actual=testArray.findMaxIndex();
		assertEquals(0, actual);
	}
	@Test
	public void findMaxIndexTest_OneArray() 
	{
		int[] ar={1};
		testArray.initArray(ar);
		int actual=testArray.findMaxIndex();
		assertEquals(0, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMaxIndexTest_ZeroArray() 
	{
		int[] ar={};
		testArray.initArray(ar);
		int actual=testArray.findMaxIndex();
		assertEquals(1, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void findMaxIndexTest_NullArray() 
	{
		testArray.findMaxIndex();		
	}

	////////////////////////////////////////////
	//Test sorting array
	@Test
	public void sortTest_ManyElementsArray1() 
	{
		int[] arInit={5,4,8,2,1};
		testArray.initArray(arInit);
		testArray.sort();
		int[] ar={1,2,4,5,8};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void sortTest_ManyElementsArray2() 
	{
		int[] arInit={5,4,8,2,1,0};
		testArray.initArray(arInit);
		testArray.sort();
		int[] ar={0,1,2,4,5,8};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void sortTest_TwoElementsArray() 
	{
		int[] arInit={5,4};
		testArray.initArray(arInit);
		testArray.sort();
		int[] ar={4,5};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void sortTest_OneElementsArray() 
	{
		int[] arInit={5};
		testArray.initArray(arInit);
		testArray.sort();
		int[] ar={5};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void sortTest_ZeroElementsArray() 
	{
		int[] arInit={};
		testArray.initArray(arInit);
		testArray.sort();
		int[] ar={};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void sortTest_NullArray() 
	{
		testArray.sort();
	}

	////////////////////////////////////////////
	//Test revers array
	@Test
	public void reversTest_ManyElementsArray1() 
	{
		int[] arInit={1,2,3,4,5};
		testArray.initArray(arInit);
		testArray.revers();
		int[] ar={5,4,3,2,1};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void reversTest_ManyElementsArray2() 
	{
		int[] arInit={1,2,3,4,5,6};
		testArray.initArray(arInit);
		testArray.revers();
		int[] ar={6,5,4,3,2,1};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void reversTest_TwoElementsArray() 
	{
		int[] arInit={5,4};
		testArray.initArray(arInit);
		testArray.revers();
		int[] ar={4,5};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void reversTest_OneElementsArray() 
	{
		int[] arInit={5};
		testArray.initArray(arInit);
		testArray.revers();
		int[] ar={5};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void reversTest_ZeroElementsArray() 
	{
		int[] arInit={};
		testArray.initArray(arInit);
		testArray.revers();
		int[] ar={};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void reversTest_NullArray() 
	{
		testArray.revers();
	}

	////////////////////////////////////////////
	//Test halfrevers array
	@Test
	public void halfReversTest_ManyElementsArray1() 
	{
		int[] arInit={1,2,3,4,5};
		testArray.initArray(arInit);
		testArray.halfRevers();
		int[] ar={4,5,3,1,2};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void halfReversTest_ManyElementsArray2() 
	{
		int[] arInit={1,2,3,4,5,6};
		testArray.initArray(arInit);
		testArray.halfRevers();
		int[] ar={4,5,6,1,2,3};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void halfReversTest_TwoElementsArray() 
	{
		int[] arInit={5,4};
		testArray.initArray(arInit);
		testArray.halfRevers();
		int[] ar={4,5};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void halfReversTest_OneElementsArray() 
	{
		int[] arInit={5};
		testArray.initArray(arInit);
		testArray.halfRevers();
		int[] ar={5};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void halfReversTest_ZeroElementsArray() 
	{
		int[] arInit={};
		testArray.initArray(arInit);
	 	testArray.halfRevers();
		int[] ar={};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test (expected=IllegalArgumentException.class)
	public void halfReversTest_NullArray() 
	{
		testArray.halfRevers();
	}

	//////////////////////////////////////////
	//Test clear array
	@Test
	public void clearArrayTest_ManyElementsArray() 
	{
		int[] arInit={1,2,3,4,5};
		testArray.initArray(arInit);
		testArray.clearArray();
		int[] ar={};
		int[] actual=testArray.getArray();
		assertArrayEquals(ar, actual);
	}
	@Test
	public void clearArrayTest_NullArray() 
	{
		testArray.clearArray();
	}
}
