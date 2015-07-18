package edu.hilllel.hw1.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassArray1Test {

	///////////////////////////////////
	//1.	����� ����������� ������� �������
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
	//2.	����� ������������ ������� �������
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
	//3.	����� ������ ������������ �������� �������
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
	//4.	����� ������ ������������� �������� �������
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
	//5.	��������� ����� ��������� ������� � ��������� ���������
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
	//6.	������� ������ ������� (������ � �������� �����������)
	//////////////////////////////////////

	
	//////////////////////////////////////
	//7.	��������� ���������� �������� ��������� �������
	//////////////////////////////////////
	@Test
	public void testcountOdd_1() 
	{
		int[] array=new int[]{5,2,1,4,5,6,0,8,9,10};
		int answer = ClassArray1.countOdd(array);		
		assertEquals(4, answer);
	}
	
	//////////////////////////////////////
	//8.	�������� ������� ������ � ������ �������� �������, ��������, ��� ������� 1 2 3 4, ��������� 3 4 1 2
	//////////////////////////////////////
	
	
	//////////////////////////////////////
	//9.	������������� ������ (��������� (Bubble), ������� (Select), ��������� (Insert))
	//////////////////////////////////////
	
}
