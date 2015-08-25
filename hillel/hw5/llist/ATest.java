package edu.hillel.hw5.llist;


public class ATest 
{
	public static void main(String[] args)
	{
		int[] zz = {10,20,30,77,11,24,99};
		EList aa = new LListR();
		aa.init(zz);
		for(Integer i : aa)
		{
			System.out.print(i + ", ");
		}

	}
}
