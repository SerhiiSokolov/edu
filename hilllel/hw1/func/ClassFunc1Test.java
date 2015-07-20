package edu.hilllel.hw1.func;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassFunc1Test {

	////////////////////////////////////
	//1.	ѕолучить строковое название дн€ недели по номеру дн€. 
	////////////////////////////////////
	@Test
	public void testArrayMin_1() 
	{
		String answer = ClassFunc1.findDay(1);		
		assertEquals("ѕонедельник", answer);
	}
	@Test
	public void testArrayMin_2() 
	{
		String answer = ClassFunc1.findDay(5);		
		assertEquals("ѕ€тница", answer);
	}	

	////////////////////////////////////
	//2.	¬водим число (0-999), получаем строку с прописью числа.
	////////////////////////////////////
	@Test
	public void testFunc2_1() 
	{
		String answer = ClassFunc1.getText(9);		
		assertEquals("дев€ть", answer);
	}
	
	@Test
	public void testFunc2_2() 
	{
		String answer = ClassFunc1.getText(11);		
		assertEquals("одиннадцать", answer);
	}
	
	@Test
	public void testFunc2_3() 
	{
		String answer = ClassFunc1.getText(20);		
		assertEquals("двадцать ", answer);
	}
	
	@Test
	public void testFunc2_4() 
	{
		String answer = ClassFunc1.getText(29);		
		assertEquals("двадцать дев€ть", answer);
	}
	@Test
	
	public void testFunc2_5() 
	{
		String answer = ClassFunc1.getText(100);		
		assertEquals("сто ", answer);
	}
	
	public void testFunc2_6() 
	{
		String answer = ClassFunc1.getText(201);		
		assertEquals("двести один", answer);
	}
	
	public void testFunc2_7() 
	{
		String answer = ClassFunc1.getText(412);		
		assertEquals("четыреста двенадцать", answer);
	}
	
	public void testFunc2_8() 
	{
		String answer = ClassFunc1.getText(651);		
		assertEquals("шестьсот п€тьдес€т один", answer);
	}
	
	////////////////////////////////////
	//3.	¬водим строку, котора€ содержит число, написанное прописью (0-999). ѕолучить само число
	////////////////////////////////////
	@Test
	public void testFunc3_9() 
	{
		int answer = ClassFunc1.convert("nine");		
		assertEquals(9, answer);
	}
	
	@Test
	public void testFunc3_11() 
	{
		int answer = ClassFunc1.convert("eleven");		
		assertEquals(11, answer);
	}
	
	@Test
	public void testFunc3_20() 
	{
		int answer = ClassFunc1.convert("twenty");		
		assertEquals(20, answer);
	}
	
	@Test
	public void testFunc3_29() 
	{
		int answer = ClassFunc1.convert("twenty-nine");		
		assertEquals(29, answer);
	}
	@Test
	
	public void testFunc3_100() 
	{
		int answer = ClassFunc1.convert("one hundred");		
		assertEquals(100, answer);
	}
	
	public void testFunc3_201() 
	{
		int answer = ClassFunc1.convert("two hundred one");		
		assertEquals(201, answer);
	}
	
	public void testFunc3_411() 
	{
		int answer = ClassFunc1.convert("four hundred eleven");		
		assertEquals(411, answer);
	}
	
	public void testFunc3_651() 
	{
		int answer = ClassFunc1.convert("six hundred fifty-one");		
		assertEquals(651, answer);
	}
	
	////////////////////////////////////
	//4.	Ќайти рассто€ние между двум€ точками в двумерном декартовом пространстве.
	////////////////////////////////////
	@Test
	public void testFindDistance_0() 
	{
		double answer = ClassFunc1.findDistance(0,0,0,0);		
		assertEquals(0.000, answer, 0.001);
	}
	@Test
	public void testFindDistance_1() 
	{
		double answer = ClassFunc1.findDistance(0,1,0,1);		
		assertEquals(1.41421, answer, 0.001);
	}
}
