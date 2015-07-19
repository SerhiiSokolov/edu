package edu.hilllel.hw1.loop;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassLoop1Test {

	///////////////////////////////////
	//1.����� ����� ������ ����� � �� ���������� � ��������� �� 1 �� 99
	//////////////////////////////////
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
	
	//////////////////////////////////
	//2.��������� ������� �� �����? (����� ���������� �������, ���� ��� ������� ������ ���� �� ���� � �� 1)
	//////////////////////////////////
	@Test
	public void testPrime_1() 
	{
		boolean answer = ClassLoop1.testPrime(3);		
		assertEquals(true, answer);
	}
	@Test
	public void testPrime_2() 
	{
		boolean answer = ClassLoop1.testPrime(22);		
		assertEquals(false, answer);
	}
	
	///////////////////////////////////
	//3.����� ������ ������������ ����� � ��������� �� ������ 
	//(����������� ������� ����������������� ������� � ����� ��������� ������)
	///////////////////////////////////
	@Test
	public void testSquare_1() 
	{
		int answer = ClassLoop1.consistentFindSquare(9);		
		assertEquals(3, answer);
	}
	@Test
	public void testSquare_2() 
	{
		int answer = ClassLoop1.consistentFindSquare(121);		
		assertEquals(11, answer);
	}
	@Test
	public void testSquare_3() 
	{
		int answer = ClassLoop1.consistentFindSquare(130);		
		assertEquals(11, answer);
	}
	
	///////////////////////////////////
	//4.��������� ��������� ����� n. n! = 1*2*�*n-1*n;!
	///////////////////////////////////
	@Test
	public void testFactorial_1() 
	{
		int answer = ClassLoop1.findFactorial(3);		
		assertEquals(6, answer);
	}
	@Test
	public void testFactorial_2() 
	{
		int answer = ClassLoop1.findFactorial(10);		
		assertEquals(3628800, answer);
	}	
	///////////////////////////////////
	//5.��������� ����� ���� ��������� �����
	///////////////////////////////////
	@Test
	public void testSuml_1() 
	{
		int answer = ClassLoop1.findSum(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testSuml_2() 
	{
		int answer = ClassLoop1.findSum(12);		
		assertEquals(3, answer);
	}
	@Test
	public void testSuml_3() 
	{
		int answer = ClassLoop1.findSum(44444);		
		assertEquals(20, answer);
	}
	@Test
	public void testSuml_4() 
	{
		int answer = ClassLoop1.findSum(1000000000);		
		assertEquals(1, answer);
	}
	
	//////////////////////////////////
	//6.	������� �����, ������� �������� ���������� ������������ \
	//������������������ ���� ��������� �����, ��������, ������ ����� 123, ������� 321
	//////////////////////////////////
	@Test
	public void testRevers_1() 
	{
		int answer = ClassLoop1.findRevers(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testRevers_2() 
	{
		int answer = ClassLoop1.findRevers(12345);		
		assertEquals(54321, answer);
	}
	@Test
	public void testRevers_3() 
	{
		int answer = ClassLoop1.findRevers(989898);		
		assertEquals(898989, answer);
	}


}
