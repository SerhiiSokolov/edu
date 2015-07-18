package edu.hilllel.hw1.array;

public class ClassArray1 {	
	public static void main (String[] args)
	{
		///////////////////////////////////
		//1.	Найти минимальный элемент массива
		///////////////////////////////////
		int[] array=new int[]{5,2,1,4,-10,6,0,8,9,10};
		int min=findMin(array);
		printArray(array);
		System.out.println(min);
		
		//////////////////////////////////////
		//2.	Найти максимальный элемент массива
		//////////////////////////////////////
		int max=findMax(array);
		System.out.println(max);
		
		//////////////////////////////////////		
		//3.	Найти индекс минимального элемента массива
		//////////////////////////////////////
		int minIndex=findMinIndex(array);
		System.out.println(minIndex);
		
		//////////////////////////////////////
		//4.	Найти индекс максимального элемента массива
		//////////////////////////////////////
		int index=findMaxIndex(array);
		System.out.println(index);
		
		//////////////////////////////////////
		//5.	Посчитать сумму элементов массива с нечетными индексами
		//////////////////////////////////////
		int sum=findSum(array);
		System.out.println(sum);
		
		//////////////////////////////////////
		//6.	Сделать реверс массива (массив в обратном направлении)
		//////////////////////////////////////
		int[] array1=new int[]{1,2,3,4,5,6,7,8,9,10};
		array=reversArray(array1);
		printArray(array);
		
		//////////////////////////////////////
		//7.	Посчитать количество нечетных элементов массива
		//////////////////////////////////////
		int[] array2=new int[]{1,1,1,1,1,1};
		int odd=countOdd(array2);
		System.out.println(odd);
		
		//////////////////////////////////////
		//8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3  4, результат 3 4 1 2
		//////////////////////////////////////
		
		
		//////////////////////////////////////
		//9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
		//////////////////////////////////////
		sortArrayBubble(array);
		printArray(array);
		
		sortArraySelect(array);
		printArray(array);
		
		sortArrayInsert(array);
		printArray(array);

	}
	
	public static int findMin(int[] array)
	{
		int min=array[0];
		for (int i=1; i<array.length;i++)
		{
			if (array[i]<min) min=array[i];
		}
		return min;
	}
	
	public static int findMax(int[] array)
	{
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
		for (int i=1; i<array.length;i++)
		{
			if (array[i]<array[index]) index=i;
		}
		return index;
	}
	
	public static int findMaxIndex(int[] array)
	{
		int index=0;
		for (int i=1; i<array.length;i++)
		{
			if (array[i]>array[index]) index=i;
		}
		return index;
	}
	
	public static int findSum(int[] array)
	{
		int sum=0;
		for (int i=1; i<array.length;i+=2)
		{
			sum+=array[i];
		}
		return sum;
	}
	
	public static int[] reversArray(int[] array)
	{
		int[] temp=new int[(array.length)];
		int size=array.length-1;
		for (int i=0; i<array.length;i++)
		{
			temp[size-i]=array[i];
		}
		return temp;
	}
	
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
	
	public static int countOdd(int[] array){
		int size=array.length, count=0;
		for(int i=0;i<size;i++){
			if (array[i]%2!=0) count++;
		}
		return count;
	}
	
	public static void sortArrayBubble(int[] array)
	{
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
	}
	
	public static void sortArraySelect(int[] array)
	{
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

	}
	
	public static void sortArrayInsert(int[] array)
	{
		int size=array.length, x, j;
		for(int i=0;i<size;i++)
		{
			x=array[i];
			for (j=i-1;j>=0&&array[j]>x;j--)
					array[j+1]=array[j];
			array[j+1] = x;
		}

	}
	
}
