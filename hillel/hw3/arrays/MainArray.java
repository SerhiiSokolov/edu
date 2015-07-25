package edu.hillel.hw3.arrays;

import java.util.Arrays;

public class MainArray 
{
	private int size=10;
	private int[] array=new int[size];

	//This method return size of array
	public int getSize()
	{
		return size;
	}

	//This method initialize array, copy data from passed array
	public void initArray(int[] array)
	{
		this.array=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			this.array[i]=array[i];
		}
	}

	//Method clear array by making new reference to null-array
	public void clearArray()
	{
		int[] tempArray=new int[0];
		array=tempArray;
	}

	//Add value to zero position
	public void addStart(int startValue)
	{
		int[] tempArray=new int[array.length+1];
		tempArray[0]=startValue;
		for(int i=0;i<array.length;i++)
		{
			tempArray[i+1]=array[i];
		}
		array=tempArray;
	}

	//Add value to last position
	public void addEnd(int endValue)
	{
		int[] tempArray=Arrays.copyOf(array, array.length+1);
		tempArray[tempArray.length-1]=endValue;
		array=tempArray;
	}

	//Add element to position
	public void addPos(int position, int value)
	{
		int[] tempArray=new int[array.length+1];
		System.arraycopy(array, 0, tempArray, 0, position);
		tempArray[position]=value;
		System.arraycopy(array, position, tempArray, position+1, array.length-position);
		array=tempArray;
	}

	//Method delete zero-element from array and return his value
	public int delStart()
	{
		int startValue=array[0];
		int[] tempArray= Arrays.copyOfRange(array, 1, array.length);
		array=tempArray;
		return startValue;
	}
	//Method delete last element from array and return his value
	public int delEnd()
	{
		int lastValue=array[array.length-1];
		int[] tempArray= Arrays.copyOfRange(array, 0, array.length-1);
		array=tempArray;
		return lastValue;
	}

	//Method delete element from position and return his value
	public int delPos(int position)
	{
		int elemenFromPosition=array[position];
		int[] tempArray=new int[array.length-1];
		System.arraycopy(array, 0, tempArray, 0, position);
		System.arraycopy(array, position+1, tempArray, position, array.length-position-1);
		array=tempArray;
		return elemenFromPosition;
	}
	
	//Print whole array
	public void printArray()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print("["+array[i]+"] ");
		}
		System.out.println();
	}

	//Print array from "start" to "stop", include both points 
	public void printArray(int start, int stop)
	{
		for(int i=start;i<=stop;i++)
		{
			System.out.print("["+array[i]+"] ");
		}
		System.out.println();
	}


}
