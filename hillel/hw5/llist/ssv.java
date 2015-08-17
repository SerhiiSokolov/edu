package edu.hillel.hw5.llist;

public class ssv {

	public static void main(String[] args) {
		AListR rr=new AListR();
		int[] ini = {10,20};
		rr.init(ini);
		printarr(rr);
		System.out.println();
		for(int i=0;i<7;i++){
			rr.addEnd(i+1);
			rr.printArray();
		}
		rr.reverse();
		rr.printArray();

	}
	
	public static void printarr(AListR ar){
		int[] rr=ar.toArray();
		for(int i=0;i<rr.length;i++){
			System.out.print(rr[i]+", ");
		}
	}

}
