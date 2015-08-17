package edu.hillel.hw9.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DS_H2 implements DS
{

	@Override
	public void create(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Person> read() 
	{
		ArrayList<Person> pp = new ArrayList<Person>();
		try 
		{
			Class.forName("org.h2.Driver");

			Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM PERSON");
			while(rs.next())
			{
				pp.add( new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)) );
			}
			rs.close();
			st.close();
			conn.close();

		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
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
