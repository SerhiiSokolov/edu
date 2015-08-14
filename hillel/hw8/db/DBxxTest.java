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
		String[][] expected={{"Света","Соколова","18"},{"Надя","Подопригора","19"}}; 
		assertArrayEquals(expected, actual);

		rs.last();
		assertEquals(2, rs.getRow());
	}

	@Test
	public void testGetByFirstLater() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByFirstLater();
		String[][] actual=db.toArray(rs);
		String[][] expected={{"Света","Соколова"},{"Сергей","Соколов"},{"Пуйло","Путин"}}; 
		assertArrayEquals(expected, actual);

		rs.last();
		assertEquals(3, rs.getRow());
	}

	@Test
	public void testGetEvenId() throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getEvenId();
		String[][] actual=db.toArray(rs);
		String[][] expected={{"2","Андрей","Ковалинский"},
				{"4","Максим","Петров"},
				{"6","Анна","Соколова"},
				{"8","Сергей","Иванов"},
				{"10","Андрей","Пшонка"},
				{"12","Николай","Азаров"},
				{"14","Наташа","Ростова"},
				{"16","Хрен","Табачник"},
				{"18","Надя","Подопригора"},
				{"20","Борис","Моисеев"},
				{"22","Саша","Какой"},
				{"24","Виктория","Никакая"},
				{"26","Пуйло","Путин"}};
		assertArrayEquals(expected, actual);
		rs.last();
		assertEquals(13, rs.getRow());
	}

	@Test
	public void testGetByMiddleChar()throws ClassNotFoundException, SQLException {
		db=new DBxx();
		rs=db.getByMiddleChar("ш");
		String[][] actual=db.toArray(rs);
		String[][] expected={{"Андрей","Пшонка"},{"Андрей","Калашников"},{"Александра","Пушкина"}}; 
		assertArrayEquals(expected, actual);

		rs.last();
		assertEquals(3, rs.getRow());
	}
}
