package edu.hilllel.hw1.array;

public class ClassArray1 {	
	public static void main (String[] args){
		int[] array=new int[]{5,2,1,4,-10,6,0,8,9,10};
		int min=findMin(array);
		System.out.println(min);
	}
	public static int findMin(int[] array){
		int min=array[0];
		for (int i=1; i<array.length;i++){
			if (array[i]<min) min=array[i];
		}
		return min;
	}
}
