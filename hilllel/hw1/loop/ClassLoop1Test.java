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
	public void testPrime_0() 
	{
		boolean answer = ClassLoop1.testPrime(0);		
		assertEquals(false, answer);
	}
	@Test
	public void testPrime_1() 
	{
		boolean answer = ClassLoop1.testPrime(1);		
		assertEquals(true, answer);
	}
	@Test
	public void testPrime_2() 
	{
		boolean answer = ClassLoop1.testPrime(2);		
		assertEquals(true, answer);
	}
	@Test
	public void testPrime_3() 
	{
		boolean answer = ClassLoop1.testPrime(3);		
		assertEquals(true, answer);
	}
	@Test
	public void testPrime_4() 
	{
		boolean answer = ClassLoop1.testPrime(4);		
		assertEquals(false, answer);
	}
	
	///////////////////////////////////
	//3.����� ������ ������������ ����� � ��������� �� ������ 
	//(����������� ������� ����������������� ������� � ����� ��������� ������)
	///////////////////////////////////
	@Test
	public void testSquare_0() 
	{
		int answer = ClassLoop1.consistentFindSquare(0);		
		assertEquals(0, answer);
	}
	@Test
	public void testSquare_1() 
	{
		int answer = ClassLoop1.consistentFindSquare(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testSquare_2() 
	{
		int answer = ClassLoop1.consistentFindSquare(2);		
		assertEquals(1, answer);
	}
	@Test
	public void testSquare_4() 
	{
		int answer = ClassLoop1.consistentFindSquare(4);		
		assertEquals(2, answer);
	}
	@Test
	public void testSquare_130() 
	{
		int answer = ClassLoop1.consistentFindSquare(130);		
		assertEquals(11, answer);
	}
	
	///////////////////////////////////
	//4.��������� ��������� ����� n. n! = 1*2*�*n-1*n;!
	///////////////////////////////////
	@Test
	public void testFactorial_0() 
	{
		int answer = ClassLoop1.findFactorial(0);		
		assertEquals(1, answer);
	}
	@Test
	public void testFactorial_1() 
	{
		int answer = ClassLoop1.findFactorial(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testFactorial_2() 
	{
		int answer = ClassLoop1.findFactorial(2);		
		assertEquals(2, answer);
	}
	@Test
	public void testFactorial_10() 
	{
		int answer = ClassLoop1.findFactorial(10);		
		assertEquals(3628800, answer);
	}	
	///////////////////////////////////
	//5.��������� ����� ���� ��������� �����
	///////////////////////////////////
	@Test
	public void testSuml_0() 
	{
		int answer = ClassLoop1.findSum(0);		
		assertEquals(0, answer);
	}
	@Test
	public void testSuml_1() 
	{
		int answer = ClassLoop1.findSum(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testSuml_12() 
	{
		int answer = ClassLoop1.findSum(12);		
		assertEquals(3, answer);
	}
	@Test
	public void testSuml_44444() 
	{
		int answer = ClassLoop1.findSum(44444);		
		assertEquals(20, answer);
	}
	@Test
	public void testSuml_1000000000() 
	{
		int answer = ClassLoop1.findSum(1000000000);		
		assertEquals(1, answer);
	}
	
	//////////////////////////////////
	//6.	������� �����, ������� �������� ���������� ������������ \
	//������������������ ���� ��������� �����, ��������, ������ ����� 123, ������� 321
	//////////////////////////////////
	@Test
	public void testRevers_0() 
	{
		int answer = ClassLoop1.findRevers(0);		
		assertEquals(0, answer);
	}
	@Test
	public void testRevers_1() 
	{
		int answer = ClassLoop1.findRevers(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testRevers_123456() 
	{
		int answer = ClassLoop1.findRevers(12345);		
		assertEquals(54321, answer);
	}
	@Test
	public void testRevers_989898() 
	{
		int answer = ClassLoop1.findRevers(989898);		
		assertEquals(898989, answer);
	}
}
