package edu.hillel.hw12.db;
import java.util.ArrayList;

public interface DS 
{
	void create(Person p);
	ArrayList<Person> read();
	void update(Person p);
	void delete(Person p);
}
