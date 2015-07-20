package edu.hilllel.hw1.func;

public class ClassFunc1 {	
	public static void main (String[] args){

		////////////////////////////////////
		//1.	�������� ��������� �������� ��� ������ �� ������ ���. 
		////////////////////////////////////
		int day=1;
		String s=findDay(day);
		System.out.println(s);

		////////////////////////////////////
		//2.	������ ����� (0-999), �������� ������ � �������� �����.
		////////////////////////////////////
		int number=900;
		System.out.println(number);
		s=getText(number);
		System.out.println(s);

		////////////////////////////////////
		//3.	������ ������, ������� �������� �����, ���������� �������� (0-999). �������� ���� �����
		////////////////////////////////////
		String test1="nine hundred twenty-five";
		int digit=convert(test1);
		System.out.println(test1);
		System.out.println(digit);
		////////////////////////////////////
		//4.	����� ���������� ����� ����� ������� � ��������� ���������� ������������.
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
		case 1: temp="����"; break;
		case 2: temp="���"; break;
		case 3: temp="���"; break;
		case 4: temp="������"; break;
		case 5: temp="����"; break;
		case 6: temp="�����"; break;
		case 7: temp="����"; break;
		case 8: temp="������"; break;
		case 9: temp="������"; break;
		case 10: temp="������"; break;
		case 11: temp="�����������"; break;
		case 12: temp="����������"; break;
		case 13: temp="����������"; break;
		case 14: temp="������������"; break;
		case 15: temp="����������"; break;
		case 16: temp="�����������"; break;
		case 17: temp="����������"; break;
		case 18: temp="������������"; break;
		case 19: temp="������������"; break;
		default : temp=""; break;
		}
		return temp;
	}

	public static String get2(int number)
	{
		String temp;
		switch (number)
		{
		case 1: temp="��� "; break;
		case 2: temp="������ "; break;
		case 3: temp="������ "; break;
		case 4: temp="��������� "; break;
		case 5: temp="������� "; break;
		case 6: temp="�������� "; break;
		case 7: temp="������� "; break;
		case 8: temp="��������� "; break;
		case 9: temp="��������� "; break;
		default : temp="���� "; break;
		}
		return temp;
	}

	public static String get3(int number)
	{
		String temp;
		switch (number)
		{
		case 2: temp="�������� "; break;
		case 3: temp="�������� "; break;
		case 4: temp="����� "; break;
		case 5: temp="��������� "; break;
		case 6: temp="���������� "; break;
		case 7: temp="��������� "; break;
		case 8: temp="����������� "; break;
		case 9: temp="��������� "; break;
		default : temp="���� "; break;
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
