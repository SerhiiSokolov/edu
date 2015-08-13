package edu.hillel.hw8.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBxx {
	private Statement st;
	private ResultSet rs;

	public ResultSet getByAge(int startAge, int endAge) throws ClassNotFoundException, SQLException {
		st=getConnection();
		String query="SELECT FirstName, LastName, Age "
				+ "FROM PERSON "
				+ "WHERE AGE>="+startAge+" and AGE<="+endAge;		
		rs=st.executeQuery(query);		
		printRS(rs);
		return rs;
	}

	public ResultSet getByFirstLater() throws ClassNotFoundException, SQLException {
		st=getConnection();
		rs=st.executeQuery("SELECT DISTINCT FirstName, LastName "
				+ "FROM PERSON "
				+ "WHERE LEFT(FirstName,1)=LEFT(LastName,1)");		
		printRS(rs);
		return rs;
	}

	public ResultSet getEvenId() throws ClassNotFoundException, SQLException {
		st=getConnection();
		rs=st.executeQuery("SELECT Id, FirstName, LastName "
				+ "FROM PERSON "
				+ "WHERE Id%2=0");
		printRS(rs);
		return rs;
	}

	public ResultSet getByMiddleChar(String s) throws ClassNotFoundException, SQLException {
		st=getConnection();
		String query="SELECT FirstName, LastName "
				+ "FROM Person "
				+ "WHERE LastName like '%_"+s+"_%'";
		rs=st.executeQuery(query);
		
		printRS(rs);
		return rs;
	}
	
	private Statement getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_UPDATABLE);
	}

	public void printRS(ResultSet rs) throws ClassNotFoundException, SQLException{
		int x = rs.getMetaData().getColumnCount();
		while(rs.next()){
			for(int i=1; i<=x;i++){
				System.out.print(rs.getString(i) + ", ");
			}
			System.out.println();
		}
	}
}
