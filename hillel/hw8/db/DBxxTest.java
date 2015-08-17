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
		rs=db.getByAge(18, 19);
		String[][] actual=db.toArray(rs);
		String[][] expected={{"�����","��������","18"},{"����","�����������","19"}}; 
		assertArrayEquals(expected, actual);

		rs.last();
		assertEquals(2, rs.getRow());
	}

	@Test
	public void testGetByFirstLater() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByFirstLater();
		String[][] actual=db.toArray(rs);
		String[][] expected={{"�����","��������"},{"������","�������"},{"�����","�����"}}; 
		assertArrayEquals(expected, actual);

		rs.last();
		assertEquals(3, rs.getRow());
	}

	@Test
	public void testGetEvenId() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getEvenId();
		String[][] actual=db.toArray(rs);
		String[][] expected={{"2","������","�����������"},
				{"4","������","������"},
				{"6","����","��������"},
				{"8","������","������"},
				{"10","������","������"},
				{"12","�������","������"},
				{"14","������","�������"},
				{"16","����","��������"},
				{"18","����","�����������"},
				{"20","�����","�������"},
				{"22","����","�����"},
				{"24","��������","�������"},
				{"26","�����","�����"}};
		assertArrayEquals(expected, actual);
		rs.last();
		assertEquals(13, rs.getRow());
	}

	@Test
	public void testGetByMiddleChar()throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByMiddleChar("�");
		String[][] actual=db.toArray(rs);
		String[][] expected={{"������","������"},{"������","����������"},{"����������","�������"}}; 
		assertArrayEquals(expected, actual);

		rs.last();
		assertEquals(3, rs.getRow());
	}
}
