package edu.hillel.hw9.db;
import java.util.ArrayList;

public class PMain 
{

	public static void main(String[] args) 
	{
		//DS ds = new DS_Mock();
		DS ds = new DS_H2();		
		//DS ds= new DS_MySQL();
		//DS ds= new DS_PostgreSQL();
		ArrayList<Person> pp = ds.read();
		print(pp);

		Person p=new Person(27, "Vasia", "Pupkin", 23);
		ds.create(p);
		print(pp);

		p=new Person(27,"Vasia", "Pupkin", 24);
		ds.update(p);
		
		pp = ds.read();
		print(pp);

		ds.delete(p);
		print(pp);

	}

	public static void print(ArrayList<Person> pp)
	{
		System.out.println("start print");
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}
}
