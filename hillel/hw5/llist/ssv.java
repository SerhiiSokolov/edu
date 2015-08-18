package edu.hillel.hw5.llist;

public class ssv {

	public static void main(String[] args) {
		AListR rr=new AListR();
		int[] ini = {10};
		rr.init(ini);
		printarr(rr);
		System.out.println();
		for(int i=0;i<10;i++){
			rr.addEnd(i+2);
			rr.printArray();
		}
		rr.addPos(1,99);
		//System.out.println(rr.minInd());
		rr.printArray();
		rr.addPos(1,99);
		//System.out.println(rr.minInd());
		rr.printArray();
		printarr(rr);

	}
	
	public static void printarr(AListR ar){
		int[] rr=ar.toArray();
		for(int i=0;i<rr.length;i++){
			System.out.print(rr[i]+", ");
		}
	}

}
