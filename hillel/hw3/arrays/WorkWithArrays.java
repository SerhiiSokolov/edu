package edu.hillel.hw3.arrays;

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
		int[] ar=FillArray.fill(initSize);		
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
		////////////////////////////////////
		//Clear array
		////////////////////////////////////
		array.clearArray();
	}
}
