package edu.hillel.hw12.db;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MyTModel extends AbstractTableModel
{
	DS ds=new DS_H2();
	ArrayList<Person> pp=null;

	
	public MyTModel() 
	{
		pp=ds.read();
	}

	@Override
	public int getColumnCount() 
	{
		return 4;
	}

	@Override
	public int getRowCount() 
	{
		return pp.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return null;
	}

}
