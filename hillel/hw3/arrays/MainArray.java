package edu.hillel.hw3.arrays;

import java.util.Arrays;

public class MainArray 
{
	private int[] array;

	//This method return size of array
	public int getSize()
	{
		if(array==null) throw new IllegalArgumentException();
		return array.length;
	}

	//This method initialize array, copy data from passed array
	public void initArray(int[] arr)
	{
		if(arr==null) throw new IllegalArgumentException();
		array=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			array[i]=arr[i];
		}
	}

	//Method clear array by making new reference to null-array
	public void clearArray()
	{
		if(array==null)array=new int[0];
		else
			{
			int[] tempArray=new int[0];
			array=tempArray;
			}
	}

	//Add value to zero position
	public void addStart(int startValue)
	{
		if(array==null) throw new IllegalArgumentException();
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
		if(array==null) throw new IllegalArgumentException();
		int[] tempArray=new int[array.length+1];
		for (int i=0;i<array.length;i++) tempArray[i]=array[i];
		tempArray[array.length]=endValue;
		array=tempArray;
	}

	//Add element to position
	public void addPos(int position, int value)
	{
		if(array==null||position<0||position>array.length+1) throw new IllegalArgumentException();
		if (position==array.length) addEnd(value);
		if (position==0) addStart(value);
		else
		{
			int[] tempArray=new int[array.length+1];

			int i=0;
			for(i=0;i<=position;i++)
			{
				tempArray[i]=array[i];
			}
			tempArray[i-1]=value;
			while (i<tempArray.length)
			{
				tempArray[i]=array[i-1];
				i++;
			}
			array=tempArray;
		}
	}

	//Method delete zero-element from array and return his value
	public int delStart()
	{
		if(array==null||array.length==0) throw new IllegalArgumentException();
		int startValue=array[0];
		int[] tempArray=new int[array.length-1];
		for(int i=1;i<array.length;i++) tempArray[i-1]=array[i];
		array=tempArray;
		return startValue;
	}

	//Method delete last element from array and return his value
	public int delEnd()
	{
		if(array==null||array.length==0) throw new IllegalArgumentException();
		int lastValue=array[array.length-1];
		int[] tempArray=new int[array.length-1];
		for(int i=0;i<array.length-1;i++) tempArray[i]=array[i];
		array=tempArray;
		return lastValue;
	}

	//Method delete element from position and return his value
	public int delPos(int position)
	{
		if(array==null||array.length==0||position<0||position>array.length-1) throw new IllegalArgumentException();
		int elemenFromPosition=array[position];
		int[] tempArray=new int[array.length-1];
		for(int i=0;i<position;i++) tempArray[i]=array[i];
		for(int i=position+1;i<array.length;i++) tempArray[i-1]=array[i];
		array=tempArray;
		return elemenFromPosition;
	}

	//Find min element and return his value
	public int findMin()
	{
		if(array==null||array.length==0) throw new IllegalArgumentException();
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
		if(array==null||array.length==0) throw new IllegalArgumentException();
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
		if(array==null||array.length==0) throw new IllegalArgumentException();
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
		if(array==null||array.length==0) throw new IllegalArgumentException();
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
		if(array==null) throw new IllegalArgumentException();
		if(array.length>1) qsort(array, 0, array.length-1);
	}
	private void qsort(int[] array, int first, int last)
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
		if(array==null) throw new IllegalArgumentException();
		if(array.length>1)
		{
			int[] tempArray=new int[array.length];
			for(int i=0; i<array.length;i++)
			{
				tempArray[array.length-1-i]=array[i];
			}
			array=tempArray;
		}
	}

	//Change first half array and second half
	public void halfRevers()
	{
		if(array==null) throw new IllegalArgumentException();
		if(array.length>1)
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
	}

	//Method return array
	public int[] getArray() 
	{
		if(array==null) throw new IllegalArgumentException();
		return array;
	}

	//Method return first element
	public int getStart() 
	{
		if(array==null) throw new IllegalArgumentException();
		return array[0];
	}

	//Method return last element
	public int getEnd() 
	{
		if(array==null) throw new IllegalArgumentException();
		return array[array.length-1];
	}

	//Method  return element from position
	public int getPos(int position) 
	{
		if(array==null) throw new IllegalArgumentException();
		return array[position];
	}

	//Print whole array
	public void printArray()
	{
		if(array==null) throw new IllegalArgumentException();
		for(int i=0;i<array.length;i++)
		{
			System.out.print("["+array[i]+"] ");
		}
		System.out.println();
	}


	//Print array from "start" to "stop", include both points 
	public void printArray(int start, int stop)
	{
		if(array==null) throw new IllegalArgumentException();
		for(int i=start;i<=stop;i++)
		{
			System.out.print("["+array[i]+"] ");
		}
		System.out.println();
	}
}
