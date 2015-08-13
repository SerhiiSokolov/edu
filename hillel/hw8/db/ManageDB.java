package edu.hillel.hw8.db;

import java.sql.SQLException;

public class ManageDB {
	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		try{
			DBxx db=new DBxx();
			db.getByAge(10, 20);
			db.getByFirstLater();
			db.getByMiddleChar("í");
			db.getEvenId();
		}
		catch (ClassNotFoundException|SQLException errObj)
		{
			System.out.println("Error"+errObj);
		}
	}
}
