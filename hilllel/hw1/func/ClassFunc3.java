package edu.hilllel.hw1.func;

public class ClassFunc3 {	
	public static void main (String[] args){
		String test1="nine hundred twenty-five";
		int digit=convert(test1);
		System.out.println(test1);
		System.out.println(digit);
	}
	
	public static int convert(String test1){
		int n=0;
		String[] test2=test1.split(" ");
		
		if (test1.contains("hundred")){
			n=100*findNumber(test2[0]);
		}
		
		if (test1.contains("-")){			
			String[] test3=test2[test2.length-1].split("-");
			n=n+findTen(test3[0])*10+findNumber(test3[1]);
		}
		
		if(test2.length==1||test2.length==3){
			n=n+findTen(test2[test2.length-1])*10;
			n=n+findNumber(test2[test2.length-1]);			
		}
		return n;

	}
	
	public static int findNumber(String strNumber){
		int sday=0;
		String[] one={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		for (int i=0; i<one.length;i++){
			if (strNumber.equals(one[i])){
				sday=i;
				break;
			}
		}
		
		return sday;
	}
	
	public static int findTen(String strNumber){
		int sday=0;
		String[] one={"zero","zero","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		for (int i=0; i<one.length;i++){
			if (strNumber.equals(one[i])){
				sday=i;
				break;
			}
		}
		
		return sday;
	}
	
}
