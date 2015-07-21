package edu.hillel.hw1.array;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {

		int[] array=fillArray(50);
		printArray(array);
		int first=0, last=array.length-1;
		qsort(array,first,last);
		printArray(array);
		testArray(array);
	}

	public static void qsort(int[]array, int first, int last){
		int mid=array[(first+last)/2];
		int f=first, l=last;
		int temp;
		do{
			while(array[f]<mid) f++;
			while(array[l]>mid) l--;
			if(f<=l){
				temp=array[f];
				array[f]=array[l];
				array[l]=temp;
				f++;
				l--;
			}
		}while(f<l);
		if(first<l) qsort(array,first,l);
		if(f<last) qsort(array,f,last);
		
	}
	
	public static void testArray(int[] ar){
		boolean test=true;
		for(int i=0;i<ar.length-1;i++){
			if(ar[i]>ar[i+1]) test=false;
		}
		System.out.println("test="+test);
	}

	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
	
	public static int[] fillArray(int size){
		int[] array=new int[size];
		Random rand=new Random();
		for (int i=0;i<size;i++){
			array[i]=rand.nextInt(100)+1;
		}
		return array;
	}
}
