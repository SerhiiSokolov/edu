package edu.hillel.hw12.db;import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TModel extends AbstractTableModel 
{
	DS ds = new DS_MySQL();
	ArrayList<Person> pp = null;

	public TModel() 
	{	
		pp = ds.read();
	}

	public boolean isCellEditable(int row, int column) 
	{
		return true;
	}

	public void setDS(String set) 
	{
		switch (set) {
		case "Mock":
			ds = new DS_Mock();
			break;
		case "H2":
			ds = new DS_H2();
			break;
		case "MySQL":
			ds= new DS_MySQL();
			break;
		case "PostgreSQL":
			ds = new DS_PostgreSQL();
			break;

		default:
			ds = new DS_Mock();
			break;
		}
		pp = ds.read();
	}

	@Override	
	public String getColumnName(int column) 
	{
		String[] str = {"Id","FName","LName","Age"};
		return str[column];
	}

	@Override
	public int getRowCount() 
	{
		return pp.size();
	}

	@Override
	public int getColumnCount() 
	{
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) 
	{
		Person p = pp.get(rowIndex);

		Object ret = null;

		switch (columnIndex) 
		{
		case 0: ret = p.id;    break;
		case 1: ret = p.fName; break;
		case 2: ret = p.lName; break;
		case 3: ret = p.age;   break;
		}

		return ret;
	}

	public void create(String[] args) 
	{
		Integer id=Integer.valueOf(args[0]);
		String fName=args[1];
		String lName=args[2];
		Integer age=Integer.valueOf(args[3]);
		ds.create(new Person(id, fName, lName, age));
	}
	public void update(String[] args) 
	{
		Integer id=Integer.valueOf(args[0]);
		String fName=args[1];
		String lName=args[2];
		Integer age=Integer.valueOf(args[3]);
		ds.update(new Person(id, fName, lName, age));
	}
	public void delete(int Id)
	{		
		Person temp=null;
		for(Person p:pp)
		{
			if (p.getId()==Id)
			{
				temp=p;
				break;
			}
		}
		ds.delete(temp);
	}
}
