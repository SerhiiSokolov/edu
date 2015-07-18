package edu.hilllel.hw1.ifelse;

public class ClassBase1 {
	public static void main (String[] args){
		int a=2;
		int b=2;
		int answer=testEven(a,b);
		System.out.println(answer);
	}
	public static int testEven(int a, int b){
		if (a%2==0) return a*b;
		else return a+b;
	}
}
