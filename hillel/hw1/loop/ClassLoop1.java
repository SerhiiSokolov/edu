package edu.hillel.hw1.loop;

public class ClassLoop1 
{
	public static void main (String[] args)
	{
		///////////////////////////////////
		//1.Ќайти сумму четных чисел и их количество в диапазоне от 1 до 99
		//////////////////////////////////
		int size=99;
		int sum=sumEven(size);
		int countNumberOfEven=countEven(size);
		System.out.print("Sum="+sum);
		System.out.println(". Number of even="+countNumberOfEven);

		//////////////////////////////////
		//2.ѕроверить простое ли число? (число называетс€ простым, если оно делитс€ только само на себ€ и на 1)
		//////////////////////////////////
		int x=4;
		boolean primeNumber=testPrime(x);
		if(primeNumber) System.out.println("x is a prime");
		else System.out.println("x not prime");

		///////////////////////////////////
		//3.Ќайти корень натурального числа с точностью до целого 
		//(рассмотреть вариант последовательного подбора и метод бинарного поиска)
		///////////////////////////////////
		x=2;
		try
		{
			int square=consistentFindSquare(x);
			System.out.println("Square from consistent="+square);
			square=binaryFindSquare(x);
			System.out.println("Square from binary="+square);
			square=(int)binaryFindSquareRec(x,0,x);
			System.out.println("Square from binary with recursion="+square);
		}
		catch (IllegalArgumentException errObj)
		{
			System.out.println("Number<0");
		}
		///////////////////////////////////
		//4.¬ычислить факториал числа n. n! = 1*2*Е*n-1*n;!
		///////////////////////////////////
		int chislo=3;
		int factorial=findFactorial(chislo);
		System.out.println(factorial);

		///////////////////////////////////
		//5.ѕосчитать сумму цифр заданного числа
		///////////////////////////////////
		chislo=1111111111;
		sum=findSum(chislo);
		System.out.println(sum);

		//////////////////////////////////
		//6.	¬ывести число, которое €вл€етс€ зеркальным отображением \
		//последовательности цифр заданного числа, например, задано число 123, вывести 321
		//////////////////////////////////
		chislo=10;
		System.out.println(chislo);
		int revers=findRevers(chislo);
		System.out.println(revers);

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
		if(x==0) test=false;
		else if (x==1) test=true;
		else 
		{
			for(int i=2;i<x;i++)
			{
				if (x%i==0) 
				{
					test=false;
					break;
				}
			}
		}
		return test;
	}

	public static int consistentFindSquare(int x)
	{
		if (x<0) 
			throw new IllegalArgumentException();
		int temp=0;
		if (x==0) temp=0;
		else if (x==1) temp=1;
		else 
		{
			do 
			{
				temp++;
			} while (temp*temp<=x);
			temp--;
		}
		return temp;
	}

	public static int binaryFindSquare(int x)
	{
		if (x<0) 
			throw new IllegalArgumentException();
		int start=0;
		int stop=x;
		long square;
		if(x==0) square=0;
		else if(x==1) square=1;
		else
		{
			do 
			{

				square=(start+stop)/2;
				if (square*square==x) break;
				else if (square*square>x) 
				{
					stop=(start+stop)/2;
				}
				else if (square*square<x)
				{
					start=(start+stop)/2;
				}
			} while ((stop-start)>1);
		}
		System.out.println("start="+start+", stop="+stop);
		if(square*square!=x) square--;
		return (int)square;
	}

	public static int findFactorial(int x)
	{
		int temp=1;
		if(x==0||x==1) temp=1;
		else
		{
			for(int i=2;i<=x;i++)
				temp*=i;
		}
		return temp;
	}

	public static int findSum(int x)
	{
		int temp=0;
		while (x/10>0)
		{
			temp=temp+x%10;
			x/=10;
		} 
		temp+=x;
		return temp;
	}

	public static int findRevers(int x)
	{
		int temp=0;
		int mnog=10;
		while (x/10>0)
		{
			temp=temp*mnog+x%10;
			x/=10;
		} 
		temp=temp*10+x;
		return temp;
	}

	public static long binaryFindSquareRec(int x, int start, int stop)
	{
		if (x<0) 
			throw new IllegalArgumentException();
		long square;
		if(x==0) square=0;
		else if (x==1) square=1;
		else
		{
			square=(start+stop)/2;
			if (square*square==x) return square;
			if((stop-start)==1) return square; 
			else if(square*square>x) square=binaryFindSquareRec(x,start,(start+stop)/2);
			else square=binaryFindSquareRec(x,(start+stop)/2,stop);
		}
		return square;
	}
}
