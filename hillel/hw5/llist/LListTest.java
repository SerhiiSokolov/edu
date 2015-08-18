package edu.hillel.hw5.llist;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LListTest 
{
	EList rr=null;
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers()
	{
		return Arrays.asList(new Object[][]{
			//{ new AList0() },
			//{ new AList1() },
			//{ new AList2() },
			{ new AListR() }
			//{ new LList1() },
			//{ new LList2() },
			//{ new LListR() }
		});
	}
	public LListTest(EList zz)
	{
		rr=zz;
	}
	
	@Before
	public void setUp()
	{
		rr.clear();
	}
	//=====================================
	// size, init, toArray
	//=====================================
	@Test
	public void testSize_null() 
	{
		int[] ini = null;
		rr.init(ini);
		assertEquals(0, rr.size());
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSize_0() 
	{

		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.size());
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSize_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		assertEquals(1, rr.size());
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSize_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(2, rr.size());
		int[] exp = {10,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSize_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		assertEquals(7, rr.size());
		int[] exp = {10,20,33,77,11,24,19};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	//=====================================
	// clear
	//=====================================
	@Test
	public void testClear() 
	{
		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		assertEquals(7, rr.size());
		rr.clear();
		assertEquals(0, rr.size());
	}
	
	//=====================================
	// Get
	//=====================================
		
	@Test (expected = ListIsEmptyException.class)
	public void testGet() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.get(0);
	}
	
	@Test (expected = ListIsEmptyException.class)
	public void testGet_OutRange1() 
	{
		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.get(25);
	}
	
	@Test (expected = ListIsEmptyException.class)
	public void testGet_OutRange2() 
	{
		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.get(-1);
	}
	
	@Test
	public void testGet_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		assertEquals(10, rr.get(0));
	}
	@Test
	public void testGet_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(20, rr.get(1));
	}
	@Test
	public void testGet_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		assertEquals(77, rr.get(3));
	}
	
	//=====================================
	// Set
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testSet_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.set(2,99);
		assertEquals(0, rr.size());
		assertEquals(0, rr.get(2));
	}
	@Test
	public void testSet_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.set(0,99);
		assertEquals(1, rr.size());
		assertEquals(99, rr.get(0));
	}
	@Test
	public void testSet_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.set(1,99);
		assertEquals(2, rr.size());
		assertEquals(99, rr.get(1));
	}
	@Test
	public void testSet_many() 
	{
		int[] ini = {10,20,33,77,11,24,19,};
		rr.init(ini);
		rr.set(6,99);
		assertEquals(7, rr.size());
		assertEquals(99, rr.get(6));
		int[] exp = {10,20,33,77,11,24,99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSet_many2() 
	{
		int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,15,13,15,16,12,8,19,20};
		rr.init(ini);
		rr.set(2,99);
		assertEquals(20, rr.size());
		assertEquals(99, rr.get(2));
		int[] exp = {10,20,99,77,11,24,19,10,4,19,11,14,15,13,15,16,12,8,19,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = ListIsEmptyException.class)
	public void testSet_outrange() 
	{
		int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,15,13,15,16,12,8,19,20};
		rr.init(ini);
		rr.set(35,99);
		assertEquals(20, rr.size());
		assertEquals(99, rr.get(2));
		int[] exp = {10,20,99,77,11,24,19,10,4,19,11,14,15,13,15,16,12,8,19,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	//=====================================
	// addStart
	//=====================================
	@Test
	public void testAddStart() 
	{

		int[] ini = {};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(1, rr.size());
		assertEquals(99, rr.get(0));
		int[] exp = {99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(2, rr.size());
		assertEquals(99, rr.get(0));
		int[] exp = {99,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(3, rr.size());
		assertEquals(99, rr.get(0));
		int[] exp = {99,10,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(8, rr.size());
		assertEquals(99, rr.get(0));
		int[] exp = {99,10,20,33,77,11,24,19};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	//=====================================
	// addEnd
	//=====================================
	@Test
	public void testAddEnd() 
	{

		int[] ini = {};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(1, rr.size());
		assertEquals(99, rr.get(rr.size()-1));
		int[] exp = {99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(2, rr.size());
		assertEquals(99, rr.get(rr.size()-1));
		int[] exp = {10,99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(3, rr.size());
		assertEquals(99, rr.get(rr.size()-1));
		int[] exp = {10,20,99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(8, rr.size());
		assertEquals(99, rr.get(rr.size()-1));
		int[] exp = {10,20,33,77,11,24,19,99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	
	//=====================================
	// addPos
	//=====================================
	@Test
	public void testAddPos_0() 
	{

		int[] ini = {};
		rr.init(ini);
		rr.addPos(0,99);
		assertEquals(1, rr.size());
		assertEquals(99, rr.get(0));
		int[] exp = {99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddPos_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		rr.addPos(1,99);
		assertEquals(2, rr.size());
		assertEquals(99, rr.get(1));
		int[] exp = {10,99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddPos_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.addPos(1,99);
		assertEquals(3, rr.size());
		assertEquals(99, rr.get(1));
		int[] exp = {10,99,20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddPos_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.addPos(1,99);
		assertEquals(8, rr.size());
		assertEquals(99, rr.get(1));
		int[] exp = {10,99,20,33,77,11,24,19};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	//=====================================
	// delStart
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testDelStart_0()
	{
		int[] ini = {};
		rr.init(ini);
		rr.delStart();
	}
	@Test
	public void testDelStart_1()
	{

		int[] ini = {10};
		rr.init(ini);
		rr.delStart();
		assertEquals(0, rr.size());
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}
	@Test
	public void testDelStar_2()
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.delStart();
		assertEquals(1, rr.size());
		int[] exp = {20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}
	@Test
	public void testDelStart_many()
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.delStart();
		assertEquals(6, rr.size());
		int[] exp = {20,33,77,11,24,19};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}

	//=====================================
	// delEnd
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testDelEnd_0()
	{
		int[] ini = {};
		rr.init(ini);
		rr.delEnd();	
	}@Test
	public void testDelEnd_1()
	{

		int[] ini = {10};
		rr.init(ini);
		rr.delEnd();
		assertEquals(0, rr.size());
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}
	@Test
	public void testDelEnd_2()
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.delEnd();
		assertEquals(1, rr.size());
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}
	@Test
	public void testDelEnd_many()
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.delEnd();
		assertEquals(6, rr.size());
		int[] exp = {10,20,33,77,11,24};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}

/*	//=====================================
	// delPos
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testDelPos_0()
	{		
		int[] ini = {};
		rr.init(ini);
		rr.delPos(0);	
	}
	@Test
	public void testDelPos_1()
	{
		int[] ini = {10};
		rr.init(ini);
		rr.delPos(0);
		assertEquals(0, rr.size());
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}
	@Test
	public void testDelPos_2()
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.delPos(0);
		assertEquals(1, rr.size());
		int[] exp = {20};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}
	@Test
	public void testDelPos_many()
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.delPos(3);
		assertEquals(6, rr.size());
		int[] exp = {10,20,33,11,24,19};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);		
	}

	//=====================================
	// Min
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testMin_0()
	{	
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.min());
	}	
	@Test
	public void testMin_1()
	{	
		int[] ini = {10};
		rr.init(ini);
		assertEquals(10, rr.min());
	}
	@Test
	public void testMin_2()
	{	
		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(10, rr.min());
	}
	@Test
	public void testMin_many()
	{	
		int[] ini = {10,20,33,77,11};
		rr.init(ini);
		assertEquals(10, rr.min());
	}

	//=====================================
	// Max
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testMax_0()
	{	
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.max());
	}	
	@Test
	public void testMax_1()
	{	
		int[] ini = {10};
		rr.init(ini);
		assertEquals(10, rr.max());
	}
	@Test
	public void testMax_2()
	{	
		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(20, rr.max());
	}
	@Test
	public void testMax_many()
	{	
		int[] ini = {10,20,33,77,11};
		rr.init(ini);
		assertEquals(77, rr.max());
	}

	//=====================================
	// MinInd
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testMinInd_0()
	{	
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.minInd());
	}	
	@Test
	public void testMinInd_1()
	{	
		int[] ini = {10};
		rr.init(ini);
		assertEquals(0, rr.minInd());
	}
	@Test
	public void testMinInd_2()
	{	
		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(0, rr.minInd());
	}
	@Test
	public void testMinInd_many()
	{	
		int[] ini = {10,20,33,77,11,5};
		rr.init(ini);
		assertEquals(5, rr.minInd());
	}

	@Test
	public void testMinInd_many2()
	{	
		int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,15,13,15,16,12,8,19,20};
		rr.init(ini);
		assertEquals(8, rr.minInd());
	}

	//=====================================
	// MaxInd
	//=====================================
	@Test (expected = ListIsEmptyException.class)
	public void testMaxInd_0()
	{	
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.maxInd());
	}	
	@Test
	public void testMaxInd_1()
	{	
		int[] ini = {10};
		rr.init(ini);
		assertEquals(0, rr.maxInd());
	}
	@Test
	public void testMaxInd_2()
	{	
		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(1, rr.maxInd());
	}
	@Test
	public void testMaxInd_many()
	{	
		int[] ini = {10,20,33,77,11};
		rr.init(ini);
		assertEquals(3, rr.maxInd());
	}

	@Test
	public void testMaxInd_many2()
	{	
		int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,99,13,15,16,12,8,19,20};
		rr.init(ini);
		assertEquals(12, rr.maxInd());
	}

	//=====================================
	// sort
	//=====================================
	@Test
	public void testSort_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.sort();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		rr.sort();
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_2() 
	{

		int[] ini = {77,11};
		rr.init(ini);
		rr.sort();
		int[] exp = {11,77};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.sort();
		int[] exp = {10,11,19,20,24,33,77};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_many2()
	{	
		int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,99,13,15,16,12,8,19,20};
		rr.init(ini);
		rr.sort();
		int[] exp = {4,8,10,10,11,11,12,13,14,15,16,19,19,19,20,20,24,33,77,99};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	
	//=====================================
	// reverse
	//=====================================
	@Test
	public void testReverse_0() 
	{

		int[] ini = {};
		rr.init(ini);
		rr.reverse();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		rr.reverse();
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.reverse();
		int[] exp = {20,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_many() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.reverse();
		int[] exp = {19,24,11,77,33,20,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	//=====================================
	// halfReverse
	//=====================================
	@Test
	public void testHalfReverse_0() 
	{

		int[] ini = {};
		rr.init(ini);
		rr.halfReverse();
		int[] exp = {};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testHalfReverse_1() 
	{

		int[] ini = {10};
		rr.init(ini);
		rr.halfReverse();
		int[] exp = {10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testHalfReverse_2() 
	{

		int[] ini = {10,20};
		rr.init(ini);
		rr.halfReverse();
		int[] exp = {20,10};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testHalfReverse_many_even() 
	{

		int[] ini = {10,20,33,11,24,19};
		rr.init(ini);
		rr.halfReverse();
		int[] exp = {11,24,19,10,20,33};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testHalfReverse_many_odd() 
	{

		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.halfReverse();
		int[] exp = {11,24,19,77,10,20,33};
		int[] act = rr.toArray();
		assertArrayEquals(exp, act);
	}
*/}
