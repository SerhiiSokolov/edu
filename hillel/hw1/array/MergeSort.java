package edu.hillel.hw1.array;

import java.util.Random;

public class MergeSort {
	static int arsize=100;
	
	public static void main(String[] args) {
		int[] array=fillArray(arsize);
		printArray(array);
		int[] newArray=mergeSort(array,0,array.length-1);
		printArray(newArray);
		testArray(newArray);
	}
	public static int[] mergeSort(int[] array, int first, int last){
		if(first<last){
			int mid=(first+last)/2;
			mergeSort(array, first, mid);
			mergeSort(array, mid+1, last);
			merge(array,first,last);
		}
		return array;
	}
	public static void merge(int[] array, int first, int last){
		int[] ar=new int[arsize];
		int start=first;
		int mid=(first+last)/2;
		int stop=mid+1;
		for(int j=first;j<=last;j++){
			if((start<=mid)&&((stop>last)||(array[start]<array[stop]))){
				ar[j]=array[start];
				start++;
			}
			else{
				ar[j]=array[stop];
				stop++;
			}
		}
		for(int j=first;j<=last;j++) {
			array[j]=ar[j];
		}
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

	public static void printArray(int[] array, int start, int stop)
	{
		for(int i=start;i<=stop;i++)
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