package edu.hillel.hw4.stars;

public class Stars 
{
	public static void main (String[] args)
	{
		int size=7;
		System.out.println("Stars1");
		stars1(size);
		System.out.println("Stars2");
		stars2(size);
		System.out.println("Stars3");
		stars3(size);
		System.out.println("Stars4");
		stars4(size);
		System.out.println("Stars5");
		stars5(size);
		System.out.println("Stars6");
		stars6(size);
		System.out.println("Stars7");
		stars7(size);
		System.out.println("Stars8");
		stars8(size);
		System.out.println("Stars9");
		stars9(size);
		System.out.println("Stars10");
		stars10(size);
		System.out.println("Stars11");
		stars11(size);
	}
	
	public static void stars1(int size)
	{
		for(int x=1;x<=size;x++)
		{
			for (int y=1; y<=size;y++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void stars2(int size)
	{
		for(int x=1;x<=size;x++)
		{
			for(int y=1;y<=size;y++){
				if(x==1||x==size||y==1||y==size)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void stars3(int size)
	{
		for(int x=1;x<=size;x++)
		{
			for(int y=1;y<=size;y++)
			{
				if(y>=x) System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void stars4(int size)
	{
		for(int x=1;x<=size;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void stars5(int size)
	{
		for(int x=1;x<=size;x++)
		{
			for(int y=1;y<=size;y++)
			{
				if(y>=x) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public static void stars6(int size)
	{
		for(int y=1;y<=size;y++)
		{
			for(int x=1;x<=size;x++)
			{
				if(x<=(size-y)) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void stars7(int size)
	{
		for(int x=1;x<=size/2+1;x++)
		{
			for(int y=1;y<=size;y++)
			{
				if(y<=size-x+1 && y>=x) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void stars8(int size)
	{
		for(int x=size/2+1;x<=size;x++)
		{
			for(int y=1;y<=size;y++)
			{
				if(y>=(size-x+1)&&y<=x) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void stars9(int size)
	{
		for(int x=1;x<=size;x++){
			for(int y=1;y<=size/2+1;y++)
			{
				if(y<=x&&y<=size-x+1) System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void stars10(int size)
	{
		for(int x=1;x<=size;x++)
		{
			for(int y=1;y<=size;y++)
			{
				if(y>=x&&y>=size-x+1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void stars11(int size)
	{
		for(int x=0;x<size;x++)
		{
			for(int y=0;y<size;y++)
			{
				if(y==x||y==size-x-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
