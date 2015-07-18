package edu.hilllel.hw1.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassArray1Test {

	///////////////////////////////////
	//1.	Найти минимальный элемент массива
	///////////////////////////////////
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
	public void testArrayMax_2() 
	{
		int[] array=new int[]{5,2,1,4,5,-10,0,8,9,10};
		int answer = ClassArray1.findMax(array);		
		assertEquals(10, answer);
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
	
	//////////////////////////////////////
	//5.	Посчитать сумму элементов массива с нечетными индексами
	//////////////////////////////////////
	@Test
	public void testFindSumOddIndex_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.findSum(array);		
		assertEquals(30, answer);
	}
	@Test
	public void testFindSumOddIndex_2() 
	{
		int[] array=new int[]{1,99,1,-1,5,-1,0,-1,9,-1};
		int answer = ClassArray1.findSum(array);		
		assertEquals(95, answer);
	}
	
	//////////////////////////////////////
	//6.	Сделать реверс массива (массив в обратном направлении)
	//////////////////////////////////////

	
	//////////////////////////////////////
	//7.	Посчитать количество нечетных элементов массива
	//////////////////////////////////////
	@Test
	public void testcountOdd_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.countOdd(array);		
		assertEquals(4, answer);
	}
	
	//////////////////////////////////////
	//8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
	//////////////////////////////////////
	
	
	//////////////////////////////////////
	//9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
	//////////////////////////////////////
	
}
