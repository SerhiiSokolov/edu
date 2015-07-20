package edu.hilllel.hw1.func;

public class ClassFunc1 {	
	public static void main (String[] args){

		////////////////////////////////////
		//1.	Получить строковое название дня недели по номеру дня. 
		////////////////////////////////////
		int day=1;
		String s=findDay(day);
		System.out.println(s);

		////////////////////////////////////
		//2.	Вводим число (0-999), получаем строку с прописью числа.
		////////////////////////////////////
		int number=900;
		System.out.println(number);
		s=getText(number);
		System.out.println(s);

		////////////////////////////////////
		//3.	Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число
		////////////////////////////////////
		String test1="nine hundred twenty-five";
		int digit=convert(test1);
		System.out.println(test1);
		System.out.println(digit);
		////////////////////////////////////
		//4.	Найти расстояние между двумя точками в двумерном декартовом пространстве.
		////////////////////////////////////
		int x0=0, x1=1, y0=0, y1=1;
		double distance=findDistance(x0,x1,y0,y1);
		System.out.println(distance);

	}


	public static String findDay(int day)
	{
		String sday;
		switch (day)
		{
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

	public static String getText(int number)
	{
		String textNumber="";
		int[] count={-1,-1,-1};
		devide(count, number);

		if (count[0]>0)
		{
			textNumber=get2(count[0]);
		}

		if (count[1]>1)
		{
			textNumber=textNumber.concat(get3(count[1]));
		}

		if (count[1]==1 || count[1]==0)
		{
			int temp=count[1]*10+count[2];
			textNumber=textNumber.concat(get1(temp));
		}
		else textNumber=textNumber.concat(get1(count[2]));
		return textNumber;	
	}

	public static String get1(int number)
	{
		String temp;
		switch (number)
		{
		case 1: temp="один"; break;
		case 2: temp="два"; break;
		case 3: temp="три"; break;
		case 4: temp="четыре"; break;
		case 5: temp="пять"; break;
		case 6: temp="шесть"; break;
		case 7: temp="семь"; break;
		case 8: temp="восемь"; break;
		case 9: temp="девять"; break;
		case 10: temp="десять"; break;
		case 11: temp="одиннадцать"; break;
		case 12: temp="двенадцать"; break;
		case 13: temp="тринадцать"; break;
		case 14: temp="четырнадцать"; break;
		case 15: temp="пятнадцать"; break;
		case 16: temp="шестнадцать"; break;
		case 17: temp="семнадцать"; break;
		case 18: temp="восемнадцать"; break;
		case 19: temp="девятнадцать"; break;
		default : temp=""; break;
		}
		return temp;
	}

	public static String get2(int number)
	{
		String temp;
		switch (number)
		{
		case 1: temp="сто "; break;
		case 2: temp="двести "; break;
		case 3: temp="триста "; break;
		case 4: temp="четыреста "; break;
		case 5: temp="пятьсот "; break;
		case 6: temp="шестьсот "; break;
		case 7: temp="семьсот "; break;
		case 8: temp="восемьсот "; break;
		case 9: temp="девятьсот "; break;
		default : temp="ноль "; break;
		}
		return temp;
	}

	public static String get3(int number)
	{
		String temp;
		switch (number)
		{
		case 2: temp="двадцать "; break;
		case 3: temp="тридцать "; break;
		case 4: temp="сорок "; break;
		case 5: temp="пятьдесят "; break;
		case 6: temp="шестьдесят "; break;
		case 7: temp="семьдесят "; break;
		case 8: temp="восемьдесят "; break;
		case 9: temp="девяносто "; break;
		default : temp="ноль "; break;
		}
		return temp;
	}

	public static void devide(int[]count, int number)
	{
		int i=2;
		while (number/10>0)
		{
			count[i]=number%10;
			number/=10;
			i--;
		}
		count[i]=number%10;
	}

	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static int convert(String test1)
	{
		int n=0;
		String[] test2=test1.split(" ");
		
		if (test1.contains("hundred"))
		{
			n=100*findNumber(test2[0]);
		}
		
		if (test1.contains("-"))
		{			
			String[] test3=test2[test2.length-1].split("-");
			n=n+findTen(test3[0])*10+findNumber(test3[1]);
		}
		
		if(test2.length==1||test2.length==3)
		{
			n=n+findTen(test2[test2.length-1])*10;
			n=n+findNumber(test2[test2.length-1]);			
		}
		return n;

	}
	
	public static int findNumber(String strNumber)
	{
		int sday=0;
		String[] one={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		for (int i=0; i<one.length;i++)
		{
			if (strNumber.equals(one[i]))
			{
				sday=i;
				break;
			}
		}
		
		return sday;
	}
	
	public static int findTen(String strNumber)
	{
		int sday=0;
		String[] one={"zero","zero","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		for (int i=0; i<one.length;i++)
		{
			if (strNumber.equals(one[i]))
			{
				sday=i;
				break;
			}
		}
		
		return sday;
	}

	public static double findDistance(int x0, int x1, int y0, int y1)
	{
		double rezult=0;
		int x=Math.abs(x0-x1);
		int y=Math.abs(y0-y1);
		rezult=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
		return rezult;
	}
}
