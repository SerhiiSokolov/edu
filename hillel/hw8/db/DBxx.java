package edu.hillel.hw8.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBxx {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public ResultSet getByAge(int startAge, int endAge) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		st = conn.createStatement();
		String querry="SELECT FirstName, LastName, Age FROM PERSON WHERE AGE>="+startAge+" and AGE<="+endAge;
		rs=st.executeQuery(querry);
		while(rs.next())
		{
			System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getInt(3));
		}
		return rs;
	}
	
	public ResultSet getByFirstLater() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		st = conn.createStatement();
		rs=st.executeQuery("SELECT DISTINCT FirstName, LastName FROM PERSON WHERE LEFT(FirstName,1)=LEFT(LastName,1)");
		while(rs.next())
		{
			System.out.println(rs.getString(1) + ", " + rs.getString(2));
		}
		return rs;
	}
	
	public ResultSet getEvenId() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		st = conn.createStatement();
		rs=st.executeQuery("SELECT Id, FirstName, LastName FROM PERSON WHERE Id%2=0");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+", " + rs.getString(2) + ", " + rs.getString(3));
		}
		return rs;
	}
	
	public ResultSet getByMiddleChar(String s) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		st = conn.createStatement();
		String querry="SELECT FirstName, LastName FROM Person WHERE LastName like '%_"+s+"_%'";
		rs=st.executeQuery(querry);
		while(rs.next())
		{
			System.out.println(rs.getString(1) + ", " + rs.getString(2));
		}
		return rs;
	}
	
	public void closeAll()throws ClassNotFoundException, SQLException {
		rs.close();
		st.close();
		conn.close();
	}
}
