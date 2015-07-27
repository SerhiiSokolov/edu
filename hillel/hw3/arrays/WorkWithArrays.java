package edu.hillel.hw3.arrays;

import java.util.Random;

public class WorkWithArrays 
{
	public static void main(String[] args) {
		////////////////////////////////////
		//Get array size
		////////////////////////////////////
		MainArray array=new MainArray();
		System.out.println("Array size="+array.getSize());
		
		////////////////////////////////////
		//Init array
		////////////////////////////////////
		int initSize=array.getSize();
		int[] ar=fill(initSize);		
		array.initArray(ar);
		array.printArray();
		array.addStart(110);
		array.printArray();
		array.addEnd(120);
		array.printArray();
		array.addPos(9, 999);
		array.printArray();
		System.out.println(array.delStart());
		array.printArray();
		System.out.println(array.delEnd());
		array.printArray();
		System.out.println(array.delPos(2));
		array.printArray();
		System.out.println("Sort array");
		array.sort();
		array.printArray();
		System.out.println("Revers array");
		array.revers();
		array.printArray();
		System.out.println("HalfRevers array");
		array.halfRevers();
		array.printArray();
		////////////////////////////////////
		//Clear array
		////////////////////////////////////
		array.clearArray();
		array.printArray();
	}
	public static int[] fill(int size){
		int[] array=new int[size];
		Random rand=new Random();
		for (int i=0;i<size;i++){
			array[i]=rand.nextInt(100)+1;
		}
		return array;
	}
}
