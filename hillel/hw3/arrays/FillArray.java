package edu.hillel.hw3.arrays;

import java.util.Random;

public class FillArray 
{
	public static int[] fill(int size){
		int[] array=new int[size];
		Random rand=new Random();
		for (int i=0;i<size;i++){
			array[i]=rand.nextInt(100)+1;
		}
		return array;
	}
}
