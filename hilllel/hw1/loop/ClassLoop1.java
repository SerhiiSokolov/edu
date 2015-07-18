package edu.hilllel.hw1.loop;

public class ClassLoop1 
{
	public static void main (String[] args)
	{
		///////////////////////////////////
		//1.Найти сумму четных чисел и их количество в диапазоне от 1 до 99
		//////////////////////////////////
		int size=99;
		int sum=sumEven(size);
		int countNumberOfEven=countEven(size);
		System.out.print("Sum="+sum);
		System.out.println(". Number of even="+countNumberOfEven);
		
		//////////////////////////////////
		//2.Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
		//////////////////////////////////
		int x=6;
		boolean primeNumber=testPrime(x);
		if(primeNumber) System.out.println("x is a prime");
		else System.out.println("x not prime");
		
		///////////////////////////////////
		//3.Найти корень натурального числа с точностью до целого 
		//(рассмотреть вариант последовательного подбора и метод бинарного поиска)
		///////////////////////////////////
		x=10000;
		int square=findSquare(x);
		System.out.println(square);
		
		///////////////////////////////////
		//4.Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
		///////////////////////////////////
		int chislo=3;
		int factorial=findFactorial(chislo);
		System.out.println(factorial);
		
		///////////////////////////////////
		//5.Посчитать сумму цифр заданного числа
		///////////////////////////////////
		
	}
	
	
	public static int sumEven(int size)	
	{
		int sum=0;
		for(int i=1;i<=size;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static int countEven(int size)
	{
		int count=0;
		for(int i=1;i<=size;i++)
		{
			if(i%2==0) count++;
		}
		return count;
	}
	
	public static boolean testPrime(int x)
	{
		boolean test=true;
		for(int i=2;i<x;i++)
		{
			if (x%i==0) 
			{
				test=false;
				break;
			}
		}
		return test;
	}
	
	public static int findSquare(int x)
	{
		int temp=0;
		do 
		{
			temp++;
		} while (temp*temp<=x);
		return temp-1;
	}

	public static int findFactorial(int x)
	{
		int temp=1;
		for(int i=2;i<=x;i++)
		{
			temp*=i;
		}
		return temp;
	}
	
	
}
