package edu.hillel.hw5.llist;

public class ssv {

	public static void main(String[] args) {
		AListR rr=new AListR();
		int[] ini = {10,20};
		rr.init(ini);
		printarr(rr);
		System.out.println();
		for(int i=0;i<5;i++){
			rr.addEnd(i+1);
			//printarr(rr);
			//System.out.println();
		}
		//printarr(rr);
		System.out.println();
	}
	
	public static void printarr(AListR ar){
		int[] rr=ar.toArray();
		for(int i=0;i<rr.length;i++){
			System.out.print(rr[i]+", ");
		}
	}

}
