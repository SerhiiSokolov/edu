package edu.hilllel.hw1.array;

import java.util.Arrays;
public class ClassArray1 {	
	public static void main (String[] args)
	{
		///////////////////////////////////
		//1.	Найти минимальный элемент массива
		///////////////////////////////////
		int[] array=new int[]{5,2,1,4,-10,6,0,8,9,10};
		//int[] zeroarray=new int[]{};
		//int[] array2El=new int[]{5,-10};
		try
		{
			int min=findMin(array);
			System.out.println(min);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		//////////////////////////////////////
		//2.	Найти максимальный элемент массива
		//////////////////////////////////////
		try
		{
			int max=findMax(array);
			System.out.println(max);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		//////////////////////////////////////		
		//3.	Найти индекс минимального элемента массива
		//////////////////////////////////////
		try
		{
			int minIndex=findMinIndex(array);
			System.out.println(minIndex);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		//////////////////////////////////////
		//4.	Найти индекс максимального элемента массива
		//////////////////////////////////////
		try
		{
			int index=findMaxIndex(array);
			System.out.println(index);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		//////////////////////////////////////
		//5.	Посчитать сумму элементов массива с нечетными индексами
		//////////////////////////////////////
		try
		{
			int sum=findSum(array);
			System.out.println(sum);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0 or 1");
		}
		//////////////////////////////////////
		//6.	Сделать реверс массива (массив в обратном направлении)
		//////////////////////////////////////
		int[] array1=new int[]{1,2,3,4,5,6,7,8,9,10};
		try
		{
			array=reversArray(array1);
			printArray(array);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}
		//////////////////////////////////////
		//7.	Посчитать количество нечетных элементов массива
		//////////////////////////////////////
		int[] array2=new int[]{1,1,1,1,1,1};
		try
		{
			int odd=countOdd(array2);
			System.out.println(odd);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}
		//////////////////////////////////////
		//8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
		//////////////////////////////////////
		try
		{
			int[] arrayEx=arrayExchange(array);
			printArray(arrayEx);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}
		//////////////////////////////////////
		//9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
		//////////////////////////////////////
		try
		{
			int[] arrayBubble=sortArrayBubble(array);
			printArray(arrayBubble);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		try
		{
			int[] arraySelect=sortArraySelect(array);
			printArray(arraySelect);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		try
		{
			int[] arrayInsert=sortArrayInsert(array);
			printArray(arrayInsert);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}

		/////////////////////////////////////////////
		//10. Отсортировать массив (Quick, Merge, Shell, Heap)
		////////////////////////////////////////////
		//Quick
		int[] arrayQ={10,9,8,7,6,5,4,3,2,1,0};
		try
		{
			int[] arrayQuick=sortArrayQuick(arrayQ);
			System.out.println("quick");
			printArray(arrayQuick);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}
		//Merge
		int[] arrayMerge={11,9,8,7,6,5,4,3,2,1,0};
		try
		{
			int[] arraySortedMerge=sortMerge(arrayMerge);
			printArray(arraySortedMerge);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Array length is 0");
		}
	}

	public static int findMin(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int min=0;
		min=array[0];
		for (int i=1; i<array.length;i++){
			if (array[i]<min) min=array[i];
		}
		return min;
	}

	public static int findMax(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int max=array[0];
		for (int i=1; i<array.length;i++)
		{
			if (array[i]>max) max=array[i];
		}
		return max;
	}

	public static int findMinIndex(int[] array)
	{
		int index=0;
		if (array.length==0) 
			throw new IllegalArgumentException();
		for (int i=1; i<array.length;i++)
		{
			if (array[i]<array[index]) index=i;
		}
		return index;
	}

	public static int findMaxIndex(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int index=0;
		for (int i=1; i<array.length;i++)
		{
			if (array[i]>array[index]) index=i;
		}
		return index;
	}

	public static int findSum(int[] array)
	{
		if (array.length==0||array.length==1) 
			throw new IllegalArgumentException();
		int sum=0;
		for (int i=1; i<array.length;i+=2)
		{
			sum+=array[i];
		}
		return sum;
	}

	public static int[] reversArray(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int[] temp=new int[(array.length)];
		int size=array.length-1;
		for (int i=0; i<array.length;i++)
		{
			temp[size-i]=array[i];
		}
		return temp;
	}

	public static int countOdd(int[] array){
		if (array.length==0) 
			throw new IllegalArgumentException();
		int size=array.length, count=0;
		for(int i=0;i<size;i++){
			if (array[i]%2!=0) count++;
		}
		return count;
	}

	public static int[] sortArrayBubble(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int size=array.length;
		int temp;

		for (int i=0; i<size;i++)
		{
			for(int j=size-1;j>i;j--)
			{
				if(array[j]<array[j-1])
				{
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		return array;
	}

	public static int[] sortArraySelect(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int size=array.length;
		int k,x;		
		for(int i=0;i<size;i++) 
		{
			k=i;
			x=array[i];

			for(int j=i+1;j<size;j++)
			{
				if(array[j]>x)
				{
					k=j;
					x=array[j];	     				
				}			
			}
			array[k]=array[i];
			array[i]=x;
		}
		return array;
	}

	public static int[] sortArrayInsert(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
		int size=array.length, x, j;
		for(int i=0;i<size;i++)
		{
			x=array[i];
			for (j=i-1;j>=0&&array[j]>x;j--)
				array[j+1]=array[j];
			array[j+1] = x;
		}
		return array;
	}

	public static int[] sortArrayQuick(int[] array){
		if (array.length==0) 
			throw new IllegalArgumentException();
		Arrays.sort(array);
		return array;
	}

	public static int[] arrayExchange(int[] array)
	{
		if (array.length==0) 
			throw new IllegalArgumentException();
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
		return array;
	}

	public static int[] sortMerge(int[] arr) {
		if (arr.length==0) 
			throw new IllegalArgumentException();
		int len = arr.length;
		if (len < 2) return arr;
		int middle = len / 2;
		return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
				sortMerge(Arrays.copyOfRange(arr, middle, len)));
	}
	public static int[] merge(int[] arr_1, int[] arr_2) {
		int len_1 = arr_1.length, len_2 = arr_2.length;
		int a = 0, b = 0, len = len_1 + len_2;
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			if (b < len_2 && a < len_1) {
				if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
				else result[i] = arr_1[a++];
			} else if (b < len_2) {
				result[i] = arr_2[b++];
			} else {
				result[i] = arr_1[a++];
			}
		}
		return result;
	}
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
}
