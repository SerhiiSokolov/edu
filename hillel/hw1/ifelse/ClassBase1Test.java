package edu.hillel.hw1.ifelse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassBase1Test {

	///////////////////////////////////
	//1.Если а – четное посчитать а*б, иначе а+б
	//////////////////////////////////
	@Test
	public void testEven_1() 
	{
		int answer = ClassBase1.testEven(1, 1);		
		assertEquals(2, answer);
	}
	@Test
	public void testEven_2() 
	{
		int answer = ClassBase1.testEven(2, 1);		
		assertEquals(2, answer);
	}
	@Test
	public void testEven_3() 
	{
		int answer = ClassBase1.testEven(11, 1);		
		assertEquals(12, answer);
	}
	@Test
	public void testEven_4() 
	{
		int answer = ClassBase1.testEven(16, 10);		
		assertEquals(160, answer);
	}
	
	//////////////////////////////////
	//2.Определить какой четверти принадлежит точка с координатами (х,у)
	/////////////////////////////////
	@Test
	public void testQuarter_1() 
	{
		int answer = ClassBase1.testQuarter(1, 1);		
		assertEquals(1, answer);
	}
	@Test
	public void testQuarter_2() 
	{
		int answer = ClassBase1.testQuarter(2, -1);		
		assertEquals(2, answer);
	}
	@Test
	public void testQuarter_3() 
	{
		int answer = ClassBase1.testQuarter(-2, 1);		
		assertEquals(4, answer);
	}
	@Test
	public void testQuarter_4() 
	{
		int answer = ClassBase1.testQuarter(-2, -3);		
		assertEquals(3, answer);
	}
	public void testQuater_zero5(){
		int answer=ClassBase1.testQuarter(0, 5);
		assertEquals(0, answer);
	}

	//////////////////////////////////
	//3.Найти сумму только положительных из трех чисел
	//////////////////////////////////
	@Test
	public void sumPositive_1() 
	{
		int answer = ClassBase1.sumPositive(1,1,1);		
		assertEquals(3, answer);
	}
	@Test
	public void sumPositive_2() 
	{
		int answer = ClassBase1.sumPositive(1,-1,1);		
		assertEquals(2, answer);
	}
	@Test
	public void sumPositive_3() 
	{
		int answer = ClassBase1.sumPositive(2,10,-5);		
		assertEquals(12, answer);
	}
	@Test
	public void sumPositive_4() 
	{
		int answer = ClassBase1.sumPositive(-2,-3,-4);		
		assertEquals(0, answer);
	}
	
	/////////////////////////////////
	//4.Посчитать выражение макс(а*б*с, а+б+с)+3
	/////////////////////////////////
	@Test
	public void testMax_1() 
	{
		int answer = ClassBase1.findMax(2,2,3);		
		assertEquals(15, answer);
	}
	@Test
	public void testMax_2() 
	{
		int answer = ClassBase1.findMax(3,1,4);		
		assertEquals(15, answer);
	}
	@Test
	public void testMax_3() 
	{
		int answer = ClassBase1.findMax(2,10,-5);		
		assertEquals(10, answer);
	}
	@Test
	public void testMax_4() 
	{
		int answer = ClassBase1.findMax(-2,-3,-4);		
		assertEquals(-6, answer);
	}
	
	/////////////////////////////////
	//5.Написать программу определения оценки студента по его рейтингу
	/////////////////////////////////
	@Test
	public void testGrade_1() 
	{
		int answer = ClassBase1.findGrade(10);		
		assertEquals('F', answer);
	}
	@Test
	public void testGrade_2() 
	{
		int answer = ClassBase1.findGrade(21);		
		assertEquals('E', answer);
	}
	@Test
	public void testGrade_3() 
	{
		int answer = ClassBase1.findGrade(45);		
		assertEquals('D', answer);
	}
	@Test
	public void testGrade_4() 
	{
		int answer = ClassBase1.findGrade(74);		
		assertEquals('C', answer);
	}
	@Test
	public void testGrade_5() 
	{
		int answer = ClassBase1.findGrade(88);		
		assertEquals('B', answer);
	}
	@Test
	public void testGrade_6() 
	{
		int answer = ClassBase1.findGrade(99);		
		assertEquals('A', answer);
	}

}
