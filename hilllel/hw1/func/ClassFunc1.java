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
		case 1: sday="Понедельник"; break;
		case 2: sday="Вторник"; break;
		case 3: sday="Среда"; break;
		case 4: sday="Четверг"; break;
		case 5: sday="Пятница"; break;
		case 6: sday="Суббота"; break;
		case 7: sday="Воскресенье"; break;
		default : sday="Happy day"; break;
		}
		return sday;
	}
}
