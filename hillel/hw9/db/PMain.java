package edu.hillel.hw9.db;
import java.util.ArrayList;

public class PMain 
{

	public static void main(String[] args) 
	{
		//DS ds = new DS_Mock();
		DS ds = new DS_H2();
		
		ArrayList<Person> pp = ds.read();
		print(pp);
	}

	public static void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}
}
