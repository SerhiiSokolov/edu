package edu.hilllel.hw1.func;

public class ClassFunc1 {	
	public static void main (String[] args){
		int day=1;
		String s=findDay(day);
		System.out.println(s);
	}
	public static String findDay(int day){
		String sday;
		switch (day){
		case 1: sday="�����������"; break;
		case 2: sday="�������"; break;
		case 3: sday="�����"; break;
		case 4: sday="�������"; break;
		case 5: sday="�������"; break;
		case 6: sday="�������"; break;
		case 7: sday="�����������"; break;
		default : sday="Happy day"; break;
		}
		return sday;
	}
}
