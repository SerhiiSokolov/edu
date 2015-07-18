package edu.hilllel.hw1.ifelse;

public class ClassBase1 
{
	public static void main (String[] args)
	{
		///////////////////////////////////
		//1.Если а – четное посчитать а*б, иначе а+б
		//////////////////////////////////
		int answer;
		int a=0;
		int b=2;
		try
		{

			answer=testEven(a,b);
			System.out.println(answer);
		}
		catch(IllegalArgumentException errObj)
		{
			System.out.print("Error in testEven- "+errObj+".");
			System.out.println(" Zero not alowed");
		}
		finally 
		{
			a=2;
			b=2;
			answer=testEven(a,b);
			System.out.println("It is \"finally\" after error with zero in testEven.");
			System.out.println(answer);
			System.out.println();
		}
		
		//////////////////////////////////
		//2.Определить какой четверти принадлежит точка с координатами (х,у)
		/////////////////////////////////
		int x=0;
		int y=2;
		try
		{
			answer=testQuarter(x,y);
			System.out.println(answer);
		}
		catch(IllegalArgumentException errObj)
		{
			System.out.print("Error in testEven- "+errObj+".");
			System.out.println(" Zero not alowed");
		}
		finally 
		{
			x=2;
			y=2;
			answer=testQuarter(x,y);
			System.out.println("Test \"finally\" after error with zero." +answer);
			System.out.println();
		}
		//////////////////////////////////
		//3.Найти сумму только положительных из трех чисел
		//////////////////////////////////
		x=0;
		y=0;
		int z=0;
		try
		{
		answer=sumPositive(x,y,z);
		System.out.println(answer);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.print("Error in sumPositive. Three zero are not alowed");
			System.out.println();
		}
		/////////////////////////////////
		//4.Посчитать выражение макс(а*б*с, а+б+с)+3
		/////////////////////////////////
		a=2;
		b=2;
		int c=3;
		answer=findMax(a,b,c);
		System.out.println(answer);

		/////////////////////////////////
		//5.Написать программу определения оценки студента по его рейтингу
		/////////////////////////////////
		int rating=-10;
		try
		{
		char grade=findGrade(rating);
		System.out.println(grade);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.print("Error in findGrade.");
			System.out.println("Negativ number ore more then 100 are not alowed.");
		}
	}

	public static int testEven(int a, int b)
	{
		if (a==0 || b==0)
			throw new IllegalArgumentException();
		if (a%2==0) return a*b;
		else return a+b;
	}

	public static int testQuarter(int x, int y)
	{
		int result=0;
		if(x==0 || y==0)
			throw new IllegalArgumentException();
		if (x>=0) 
		{
			if (y>=0) result=1;
			else result=2;
		}
		else
		{
			if (y>0) result=4;
			else result=3;
		}
		return result;
	}

	public static int sumPositive(int x, int y, int z)
	{
		if (x==0 && y==0 && z==0)
			throw new IllegalArgumentException();
		int sum=0;
		if (x>=0) sum+=x;
		if (y>=0) sum+=y;
		if (z>=0) sum+=z;
		return sum;
	}

	public static int findMax(int x, int y, int z)
	{
		int result=0;
		if(x*y*z>=(x+y+z)) result=(x*y*z+3);
		else result=(x+y+z+3);
		return result;
	}

	public static char findGrade(int x)
	{
		if(x<0||x>100)
			throw new IllegalArgumentException();
		char grade='F';
		if(x<20) grade='F';
		else if (x<40) grade='E';
		else if (x<60) grade='D';
		else if (x<75) grade='C';
		else if (x<90) grade='B';
		else grade='A';
		return grade;
	}


}
