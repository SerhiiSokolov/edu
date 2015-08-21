package edu.hillel.hw5.llist;

public class ssv {

	public static void main(String[] args) {
		EList rr=new LListR();
		int[] ini = {10,20,33,77,11,24,19};
		rr.init(ini);
		rr.halfReverse();
		printarr(rr);
	}
	
	public static void printarr(EList ar){
		int[] rr=ar.toArray();
		for(int i=0;i<rr.length;i++){
			System.out.print(rr[i]+", ");
		}
	}

}
