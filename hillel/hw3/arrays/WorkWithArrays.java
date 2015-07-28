package edu.hillel.hw3.arrays;

public class WorkWithArrays 
{
	public static void main(String[] args) {
		MainArray array=new MainArray();
		try
		{
			////////////////////////////////////
			//Init array
			////////////////////////////////////
			int[] ar={10,30,54,77,11,22,99,3};
			//int[] ar={10,11};
			array.initArray(ar);
			array.printArray();

			//Get array size
			System.out.println("Array size="+array.getSize());

			//Add element as first
			array.addStart(110);
			array.printArray();

			//Add element as last
			array.addEnd(120);
			array.printArray();

			//Add element to position
			array.addPos(2, 999);
			array.printArray();

			//Delete first element
			System.out.println("Deleted first element="+array.delStart());
			array.printArray();

			//Delete last element
			System.out.println("Deleted end element="+array.delEnd());
			array.printArray();

			//Delete element from position
			System.out.println(array.delPos(2));
			array.printArray();

			//Find min element
			System.out.println("Min="+array.findMin());

			//Find max element
			System.out.println("Max="+array.findMax());

			//Find index of min element
			System.out.println("MinIndex="+array.findMinIndex());

			//Find index of max element
			System.out.println("MaxIndex="+array.findMaxIndex());

			//Sort array
			System.out.println("Sort array");
			array.sort();
			array.printArray();

			//Revers array
			System.out.println("Revers array");
			array.revers();
			array.printArray();

			//Halfrevers array
			System.out.println("HalfRevers array");
			array.halfRevers();
			array.printArray();
			////////////////////////////////////
			//Clear array
			////////////////////////////////////
			array.clearArray();
			array.printArray();
		}
		catch (IllegalArgumentException|ArrayIndexOutOfBoundsException|NullPointerException errObj)
		{
			System.out.println("Error");
		}
	}
}
