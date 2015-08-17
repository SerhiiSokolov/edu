package edu.hillel.hw9.db;
import java.util.ArrayList;

public class DS_Mock implements DS 
{

	@Override
	public void create(Person p) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Person> read() 
	{
		ArrayList<Person> pp = new ArrayList<Person>();
		
		pp.add( new Person(10, "Vasia", "Pupkin", 23) );
		pp.add( new Person(14, "kasia", "Pupkin", 23) );
		pp.add( new Person(19, "Pasia", "Pupkin", 23) );
		pp.add( new Person(22, "Sasia", "Pupkin", 23) );
		pp.add( new Person(24, "Gasia", "Pupkin", 23) );
		
		return pp;
	}

	@Override
	public void update(Person p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub

	}

}
