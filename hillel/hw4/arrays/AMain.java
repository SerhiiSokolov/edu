package edu.hillel.hw4.arrays;

public class AMain {

	public static void main(String[] args) {
		EList rr = new AList1();
		int[] ini = {10,20,33,77,11,24,19,10,4,19,11,14,15,13,15,16,12,8,19,20};
		rr.init(ini);
		System.out.println("new size="+rr.size());
	}

}
