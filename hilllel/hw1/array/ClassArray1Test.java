package edu.hilllel.hw1.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassArray1Test {

	///////////////////////////////////
	//1.	Найти минимальный элемент массива
	///////////////////////////////////
	@Test
	public void testArrayMin() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.findMin(array);		
		assertEquals(0, answer);
	}

	@Test
	public void testArrayMin_2elements() 
	{
		int[] array=new int[]{5,-10};
		int answer = ClassArray1.findMin(array);		
		assertEquals(-10, answer);
	}

	@Test
	public void testArrayMin_1element() 
	{
		int[] array=new int[]{5};
		int answer = ClassArray1.findMin(array);		
		assertEquals(5, answer);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testArrayMin_ZeroSize() 
	{
		int[] array=new int[]{};
		int answer = ClassArray1.findMin(array);		
		assertEquals(-10, answer);
	}
	//////////////////////////////////////
	//2.	Найти максимальный элемент массива
	//////////////////////////////////////
	@Test
	public void testArrayMax_1() 
	{
		int[] array=new int[]{25,2,1,4,5,6,0,80,9,10};
		int answer = ClassArray1.findMax(array);		
		assertEquals(80, answer);
	}

	@Test
	public void testArrayMax_2elements() 
	{
		int[] array=new int[]{5,-10};
		int answer = ClassArray1.findMax(array);		
		assertEquals(5, answer);
	}

	@Test
	public void testArrayMax_1element() 
	{
		int[] array=new int[]{5};
		int answer = ClassArray1.findMax(array);		
		assertEquals(5, answer);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testArrayMax_ZeroSize() 
	{
		int[] array=new int[]{};
		int answer = ClassArray1.findMax(array);		
		assertEquals(-10, answer);
	}

	//////////////////////////////////////		
	//3.	Найти индекс минимального элемента массива
	//////////////////////////////////////
	@Test
	public void testArrayMinIndex_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.findMinIndex(array);		
		assertEquals(6, answer);
	}

	@Test
	public void testArrayMinIndex_2() 
	{
		int[] array=new int[]{5,2,1,4,5,-10,0,8,9,10};
		int answer = ClassArray1.findMinIndex(array);		
		assertEquals(5, answer);
	}

	@Test
	public void testArrayMinIndex_2elements() 
	{
		int[] array=new int[]{5,-10};
		int answer = ClassArray1.findMinIndex(array);		
		assertEquals(1, answer);
	}

	@Test
	public void testArrayMinIndex_1element() 
	{
		int[] array=new int[]{5};
		int answer = ClassArray1.findMinIndex(array);		
		assertEquals(0, answer);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testArrayMinIndex_ZeroSize() 
	{
		int[] array=new int[]{};
		int answer = ClassArray1.findMinIndex(array);		
		assertEquals(-10, answer);
	}

	//////////////////////////////////////
	//4.	Найти индекс максимального элемента массива
	//////////////////////////////////////
	@Test
	public void testArrayMaxIndex_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.findMaxIndex(array);		
		assertEquals(9, answer);
	}

	@Test
	public void testArrayMaxIndex_2() 
	{
		int[] array=new int[]{99,2,1,4,5,-10,0,8,9,10};
		int answer = ClassArray1.findMaxIndex(array);		
		assertEquals(0, answer);
	}

	@Test
	public void testArrayMaxIndex_2elements() 
	{
		int[] array=new int[]{5,-10};
		int answer = ClassArray1.findMaxIndex(array);		
		assertEquals(0, answer);
	}

	@Test
	public void testArrayMaxIndex_1element() 
	{
		int[] array=new int[]{5};
		int answer = ClassArray1.findMaxIndex(array);		
		assertEquals(0, answer);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testArrayMaxIndex_ZeroSize() 
	{
		int[] array=new int[]{};
		int answer = ClassArray1.findMaxIndex(array);		
		assertEquals(-10, answer);
	}

	//////////////////////////////////////
	//5.	Посчитать сумму элементов массива с нечетными индексами
	//////////////////////////////////////
	@Test
	public void testFindSumWhithOddIndex_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.findSum(array);		
		assertEquals(30, answer);
	}

	@Test
	public void testFindSumWhithOddIndex_2() 
	{
		int[] array=new int[]{1,99,1,-1,5,-1,0,-1,9,-1};
		int answer = ClassArray1.findSum(array);		
		assertEquals(95, answer);
	}

	@Test
	public void testFindSumWhithOddIndex_2elements() 
	{
		int[] array=new int[]{5,-10};
		int answer = ClassArray1.findSum(array);		
		assertEquals(-10, answer);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testFindSumWhithOddIndex_1element() 
	{
		int[] array=new int[]{5};
		int answer = ClassArray1.findSum(array);		
		assertEquals(0, answer);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testFindSumWhithOddIndex_ZeroSize() 
	{
		int[] array=new int[]{};
		int answer = ClassArray1.findSum(array);		
		assertEquals(-10, answer);
	}


	//////////////////////////////////////
	//6.	Сделать реверс массива (массив в обратном направлении)
	//////////////////////////////////////
	@Test
	public void testReversArray_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int[] expecteds={10,9,8,0,6,5,4,1,2,5};
		int[] actuals = ClassArray1.reversArray(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testReversArray_2() 
	{
		int[] array=new int[]{1,99,1,-1,5,-1,0,-1,9,-1};
		int[] expecteds={-1,9,-1,0,-1,5,-1,1,99,1};
		int[] actuals = ClassArray1.reversArray(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testReversArray_2elements() 
	{
		int[] array=new int[]{5,-10};
		int[] expecteds={-10,5};
		int[] actuals = ClassArray1.reversArray(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testReversArray_1element() 
	{
		int[] array=new int[]{5};
		int[] expecteds={5};
		int[] actuals = ClassArray1.reversArray(array);		
		assertArrayEquals(expecteds, actuals);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testReversArray_ZeroSize() 
	{
		int[] array=new int[]{};
		int[] expecteds={};
		int[] actuals = ClassArray1.reversArray(array);		
		assertArrayEquals(expecteds, actuals);
	}


	//////////////////////////////////////
	//7.	Посчитать количество нечетных элементов массива
	//////////////////////////////////////
	@Test
	public void testCountOdd_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.countOdd(array);		
		assertEquals(4, answer);
	}

	@Test
	public void testCountOdd_2elements() 
	{
		int[] array=new int[]{5,-10};
		int answer = ClassArray1.countOdd(array);		
		assertEquals(1, answer);
	}

	@Test
	public void testCountOdd_1element() 
	{
		int[] array=new int[]{4};
		int answer = ClassArray1.countOdd(array);		
		assertEquals(0, answer);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testCountOdd_ZeroSize() 
	{
		int[] array=new int[]{};
		int answer = ClassArray1.countOdd(array);		
		assertEquals(0, answer);
	}


	//////////////////////////////////////
	//8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
	//////////////////////////////////////
	public void testarrayExchange_1() 
	{
		int[] array=new int[]{1,2,3,4,5,6,7,8,9};
		int[] expecteds={6,7,8,9,5,1,2,3,4};
		int[] actuals = ClassArray1.arrayExchange(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testarrayExchange_2() 
	{
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,0};
		int[] expecteds={6,7,8,9,0,1,2,3,4,5};
		int[] actuals = ClassArray1.arrayExchange(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testarrayExchange_2elements() 
	{
		int[] array=new int[]{5,-10};
		int[] expecteds={-10,5};
		int[] actuals = ClassArray1.arrayExchange(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testarrayExchange_1element() 
	{
		int[] array=new int[]{5};
		int[] expecteds={5};
		int[] actuals = ClassArray1.arrayExchange(array);		
		assertArrayEquals(expecteds, actuals);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testarrayExchange_ZeroSize() 
	{
		int[] array=new int[]{};
		int[] expecteds={};
		int[] actuals = ClassArray1.reversArray(array);		
		assertArrayEquals(expecteds, actuals);
	}


	//////////////////////////////////////
	//9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
	//////////////////////////////////////
	//Bubble
	public void testSortBubble_1() 
	{
		int[] array=new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] expecteds={1,2,3,4,5,6,7,8,9,10};
		int[] actuals = ClassArray1.sortArrayBubble(array);	
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortBubble_2elements() 
	{
		int[] array=new int[]{5,-10};
		int[] expecteds={-10,5};
		int[] actuals = ClassArray1.sortArrayBubble(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortBubble_1element() 
	{
		int[] array=new int[]{5};
		int[] expecteds={5};
		int[] actuals = ClassArray1.sortArrayBubble(array);		
		assertArrayEquals(expecteds, actuals);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testSortBubble_ZeroSize() 
	{
		int[] array=new int[]{};
		int[] expecteds={};
		int[] actuals = ClassArray1.sortArrayBubble(array);		
		assertArrayEquals(expecteds, actuals);
	}

	//Select
	public void testSortSelect_1() 
	{
		int[] array=new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] expecteds={1,2,3,4,5,6,7,8,9,10};
		int[] actuals = ClassArray1.sortArraySelect(array);	
		assertArrayEquals(expecteds, actuals);
	}

	//sortArraySelect made revers sorting 
	@Test
	public void testSortSelect_2elements() 
	{
		int[] array=new int[]{-10,5};
		int[] expecteds={5,-10};
		int[] actuals = ClassArray1.sortArraySelect(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortSelect_1element() 
	{
		int[] array=new int[]{5};
		int[] expecteds={5};
		int[] actuals = ClassArray1.sortArraySelect(array);		
		assertArrayEquals(expecteds, actuals);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testSortSelect_ZeroSize() 
	{
		int[] array=new int[]{};
		int[] expecteds={};
		int[] actuals = ClassArray1.sortArraySelect(array);		
		assertArrayEquals(expecteds, actuals);
	}

	//Insert
	public void testSortInsert_1() 
	{
		int[] array=new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] expecteds={1,2,3,4,5,6,7,8,9,10};
		int[] actuals = ClassArray1.sortArrayInsert(array);	
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortInsert_2elements() 
	{
		int[] array=new int[]{5,-10};
		int[] expecteds={-10,5};
		int[] actuals = ClassArray1.sortArrayInsert(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortInsert_1element() 
	{
		int[] array=new int[]{5};
		int[] expecteds={5};
		int[] actuals = ClassArray1.sortArrayInsert(array);		
		assertArrayEquals(expecteds, actuals);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testSortInsert_ZeroSize() 
	{
		int[] array=new int[]{};
		int[] expecteds={};
		int[] actuals = ClassArray1.sortArrayInsert(array);		
		assertArrayEquals(expecteds, actuals);
	}

	/////////////////////////////////////////////
	//10. Отсортировать массив (Quick, Merge, Shell, Heap)
	////////////////////////////////////////////
	//Quick
	public void testSortQuick_1() 
	{
		int[] array=new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] expecteds={1,2,3,4,5,6,7,8,9,10};
		int[] actuals = ClassArray1.sortArrayQuick(array);	
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortQuick_2elements() 
	{
		int[] array=new int[]{5,-10};
		int[] expecteds={-10,5};
		int[] actuals = ClassArray1.sortArrayQuick(array);		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortQuick_1element() 
	{
		int[] array=new int[]{5};
		int[] expecteds={5};
		int[] actuals = ClassArray1.sortArrayQuick(array);		
		assertArrayEquals(expecteds, actuals);
	}	

	@Test (expected=IllegalArgumentException.class)
	public void testSortQuick_ZeroSize() 
	{
		int[] array=new int[]{};
		int[] expecteds={};
		int[] actuals = ClassArray1.sortArrayQuick(array);		
		assertArrayEquals(expecteds, actuals);
	}
}
