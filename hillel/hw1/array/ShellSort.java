package edu.hillel.hw1.array;

import java.util.Random;

public class ShellSort {
	public static void main(String[] args) {
		int size=100;
		int[] array=fillArray(size);
		printArray(array);
		array=sortShell(array);
		printArray(array);
		testArray(array);
	}
	public static int[] sortShell(int array[])
	{
		int size=array.length;
		int d=size/2;
		int temp;
		while(d>0){
			for(int i=0;i<(size-d);i++){
				int j=i;
				while(j>=0 && array[j]>array[j+d]){
					temp=array[j];
					array[j]=array[j+d];
					array[j+d]=temp;
					j--;
				}
			}
			d=d/2;
		}
		return array;
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
