package edu.hillel.hw8.db;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;

public class DBxxTest {

	DBxx db=null;
	private ResultSet rs;
	@Test
	public void testGetByAge() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByAge(10, 20);
		rs.last();
		assertEquals(5, rs.getRow());
	}

	@Test
	public void testGetByFirstLater() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByFirstLater();
		rs.last();
		assertEquals(3, rs.getRow());
	}

	@Test
	public void testGetEvenId() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getEvenId();
		rs.last();
		assertEquals(13, rs.getRow());
	}

	@Test
	public void testGetByMiddleChar()throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByMiddleChar("í");
		rs.last();
		assertEquals(10, rs.getRow());
	}
}
