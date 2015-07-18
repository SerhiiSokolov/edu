package edu.hilllel.hw1.loop;

public class ClassLoop1 {
	static Integer[] test=new Integer[2];
	public static void main (String[] args){
		int size=99;
		int sum=sumEven(size);
		System.out.println("Sum="+sum);
		int countNumberOfEven=countEven(size);
		System.out.println("Number of even="+countNumberOfEven);
		System.out.println("Sum="+ClassLoop1.test[0]+" , count="+ClassLoop1.test[1]);
	}
	public static int sumEven(int size){
		int sum=0;
		ClassLoop1.test[1]=0;
		for(int i=1;i<=size;i++){
			if(i%2==0) {
				sum+=i;
				ClassLoop1.test[0]=sum;
				ClassLoop1.test[1]++;
			}
		}
		return sum;
	}
	public static int countEven(int size){
		int count=0;
		for(int i=1;i<=size;i++){
			if(i%2==0) count++;
		}
		return count;
	}
}
