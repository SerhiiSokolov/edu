package edu.hillel.hw3.digits;

public class Digits 
{
	public static void main (String[] args)
	{
		int size=7;
		digits1(size);
		System.out.println("");
		digits2(size);
		System.out.println("");
		digits3(size);
		System.out.println("");
		digits4(size);
		System.out.println("");
		
	}
	
	public static void digits1(int size)
	{
		for(int digit=1;digit<=size;digit++)
		{
			for(int i=1;i<=size;i++)
			{
				System.out.print(digit+" ");
			}
			System.out.println("");
		}
	}
	
	public static void digits2(int size)
	{
		for(int digit=size;digit>=1;digit--)
		{
			for(int i=1;i<=size;i++)
			{
				System.out.print(digit+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static void digits3(int size)
	{
		for(int i=1;i<=size;i++)
		{
			for(int digit=1;digit<=size;digit++)
			{
				System.out.print(digit+" ");
			}
			System.out.println("");
		}
	}
	
	public static void digits4(int size)
	{
		for(int i=1;i<=size;i++)
		{
			for(int digit=size;digit>=1;digit--)
			{
				System.out.print(digit+" ");
			}
			System.out.println("");
		}
	}
}
