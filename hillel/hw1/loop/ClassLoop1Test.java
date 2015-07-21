package edu.hillel.hw1.loop;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassLoop1Test {

	///////////////////////////////////
	//1.Ќайти сумму четных чисел и их количество в диапазоне от 1 до 99
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
	//2.ѕроверить простое ли число? (число называетс€ простым, если оно делитс€ только само на себ€ и на 1)
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
	//3.Ќайти корень натурального числа с точностью до целого 
	//(рассмотреть вариант последовательного подбора и метод бинарного поиска)
	///////////////////////////////////
	//ћетод перебора
	@Test  (expected=IllegalArgumentException.class)
	public void testSquare_Negativ() 
	{
		int answer = ClassLoop1.consistentFindSquare(-10);		
		assertEquals(0, answer);
	}
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
	
	//Ѕинарный поиск перебором
	/*@Test  (expected=IllegalArgumentException.class)
	public void testSquareBinary_Negativ() 
	{
		int answer = ClassLoop1.binaryFindSquare(-10);		
		assertEquals(0, answer);
	}
	@Test
	public void testSquareBinary_0() 
	{
		int answer = ClassLoop1.binaryFindSquare(0);		
		assertEquals(0, answer);
	}
	@Test
	public void testSquareBinary_1() 
	{
		int answer = ClassLoop1.binaryFindSquare(1);		
		assertEquals(1, answer);
	}
	@Test
	public void testSquareBinary_2() 
	{
		int answer = ClassLoop1.binaryFindSquare(2);		
		assertEquals(1, answer);
	}
	@Test
	public void testSquareBinary_4() 
	{
		int answer = ClassLoop1.binaryFindSquare(4);		
		assertEquals(2, answer);
	}
	@Test
	public void testSquareBinary_130() 
	{
		int answer = ClassLoop1.binaryFindSquare(130);		
		assertEquals(11, answer);
	}	
	*/
	//Ѕинарный поиск перебором через рекурсию
	@Test  (expected=IllegalArgumentException.class)
	public void testSquareBinaryRecursion_Negativ() 
	{
		int answer = (int)ClassLoop1.binaryFindSquareRec(-10,0,-10);		
		assertEquals(0, answer);
	}
	@Test
	public void testSquareBinaryRecursion_0() 
	{
		int answer = (int)ClassLoop1.binaryFindSquareRec(0,0,0);		
		assertEquals(0, answer);
	}
	@Test
	public void testSquareBinaryRecursion_1() 
	{
		int answer = (int)ClassLoop1.binaryFindSquareRec(1,0,1);		
		assertEquals(1, answer);
	}
	@Test
	public void testSquareBinaryRecursion_2() 
	{
		int answer = (int)ClassLoop1.binaryFindSquareRec(2,0,2);		
		assertEquals(1, answer);
	}
	@Test
	public void testSquareBinaryRecursion_4() 
	{
		int answer = (int)ClassLoop1.binaryFindSquareRec(4,0,4);		
		assertEquals(2, answer);
	}
	@Test
	public void testSquareBinaryRecursion_130() 
	{
		int answer = (int)ClassLoop1.binaryFindSquareRec(130,0,130);		
		assertEquals(11, answer);
	}	
	
	///////////////////////////////////
	//4.¬ычислить факториал числа n. n! = 1*2*Е*n-1*n;!
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
	//5.ѕосчитать сумму цифр заданного числа
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
	//6.	¬ывести число, которое €вл€етс€ зеркальным отображением \
	//последовательности цифр заданного числа, например, задано число 123, вывести 321
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
