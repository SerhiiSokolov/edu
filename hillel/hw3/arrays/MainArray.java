package edu.hillel.hw3.arrays;

import java.util.Arrays;

public class MainArray 
{
	//private int size=10;
	private int[] array;
	//=new int[size];

	//This method return size of array
	public int getSize()
	{
		if(array==null) throw new IllegalArgumentException();
		return array.length;
	}

	//This method initialize array, copy data from passed array
	public void initArray(int[] arr)
	{
		array=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			array[i]=arr[i];
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
	
	//Find min element and return his value
	public int findMin()
	{
		int min=array[0];;
		for (int i=1;i<array.length;i++)
		{			
			if(array[i]<min) min=array[i];
		}
		return min;
	}

	//Find max element and return his value
	public int findMax()
	{
		int max=array[0];
		for (int i=1;i<array.length;i++)
		{
			if(array[i]>max) max=array[i];
		}
		return max;
	}

	//Find min element and return his index
	public int findMinIndex()
	{
		int minIndex=0;
		for (int i=1;i<array.length;i++)
		{
			if(array[i]<array[minIndex]) minIndex=i;
		}
		return minIndex;
	}

	//Find min element and return his index
	public int findMaxIndex()
	{
		int maxIndex=0;
		for (int i=1;i<array.length;i++)
		{
			if(array[i]>array[maxIndex]) maxIndex=i;
		}
		return maxIndex;
	}
	
	//Sort array with quick algorithm
	public void sort()
	{
		qsort(array, 0, array.length-1);
	}
	public void qsort(int[] array, int first, int last)
	{
		int mid=array[(first+last)/2];
		int f=first;
		int l=last;
		int temp;
		do
		{
			while(array[f]<mid) f++;
			while(array[l]>mid) l--;

			if(f<=l)
			{
				temp=array[f];
				array[f]=array[l];
				array[l]=temp;
				f++;
				l--;
			}
		}while(f<l);
		if(f<last) qsort(array, f,last);
		if(l>first) qsort(array, first, l);
	}

	//Method revers array
	public void revers()
	{
		int[] tempArray=new int[array.length];
		for(int i=0; i<array.length;i++)
		{
			tempArray[array.length-1-i]=array[i];
		}
		array=tempArray;
	}

	//Change first half array and second half
	public void halfRevers()
	{
		int middle=array.length/2;;
		int[] temp1=Arrays.copyOfRange(array,0,middle);
		if (array.length%2==0) 
		{
			System.arraycopy(array, middle, array, 0, temp1.length);
			System.arraycopy(temp1, 0, array, middle, temp1.length);
		}
		else
		{
			System.arraycopy(array, middle+1, array, 0, temp1.length);
			System.arraycopy(temp1, 0, array, middle+1, temp1.length);
		}
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

	//Method return array
	public int[] getArray() {
		return array;
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
