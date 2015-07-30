package edu.hillel.hw4.arrays;

public class AMain {

	public static void main(String[] args) {
		EList rr = new AList2();
		//int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,99,13,15,16,12,8,19,20};
		int[] ini = {10,20,33,77,11,24,19,3};
		rr.init(ini);
		rr.printArray();
		rr.reverse();
		rr.printArray();
		/*rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();
		rr.delPos(0);
		rr.printArray();*/
	}
	
}
