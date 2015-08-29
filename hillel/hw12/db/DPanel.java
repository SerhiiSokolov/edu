package edu.hillel.hw12.db;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DPanel extends JPanel
{
	JTable tbl = null;
	TModel mdl = null;
	public DPanel()
	{
		setLayout(null);
		
		mdl = new TModel();
		tbl = new JTable(mdl);
		JScrollPane sp = new JScrollPane(tbl);
		sp.setBounds(10, 10, 400, 300);
		add(sp);
				
		String[] selectDB={
				"MySQL",
				"H2",
				"Mock",
				"PostgreSQL"
		};

		JComboBox boxSelectDB=new JComboBox(selectDB);
		boxSelectDB.setBounds(410, 10, 120, 20);
		boxSelectDB.setEditable(false);
		add(boxSelectDB);
		boxSelectDB.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String db=(String)boxSelectDB.getSelectedItem();
				mdl.setDS(db);
				tbl.revalidate();
			}
		});
		
		JLabel idLabel=new JLabel("Id");
		idLabel.setBounds(10,320,100,20);		
		add(idLabel);
		
		JLabel fNameLabel=new JLabel("FName");
		fNameLabel.setBounds(120,320,100,20);
		add(fNameLabel);
		
		JLabel lNameLabel=new JLabel("LName");
		lNameLabel.setBounds(230,320,100,20);
		add(lNameLabel);
		
		JLabel ageLabel=new JLabel("Age");
		ageLabel.setBounds(340,320,100,20);
		add(ageLabel);
		
		JTextField idField=new JTextField();
		idField.setBounds(10,340,100,20);
		add(idField);
		
		JTextField fNameField=new JTextField();
		fNameField.setBounds(120,340,100,20);
		add(fNameField);
		
		JTextField lNameField=new JTextField();
		lNameField.setBounds(230,340,100,20);
		add(lNameField);
		
		JTextField ageField=new JTextField();
		ageField.setBounds(340,340,100,20);
		add(ageField);
		
		JButton btnCreate=new JButton("Create");
		btnCreate.setBounds(10, 370, 100, 20);
		add(btnCreate);
		btnCreate.addActionListener(new ActionListener() 
		{			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String[] args={idField.getText(),fNameField.getText(),lNameField.getText(),ageField.getText()};
				mdl.create(args);				
				tbl.revalidate();
				tbl.invalidate();
				tbl.revalidate();
			}
		});
		
		JButton btnRead = new JButton("Read");
		btnRead.setBounds(120, 370, 100, 20);
		add(btnRead);
		btnRead.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tbl.invalidate();
				tbl.revalidate();
			}
		});
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(230,370, 100, 20);
		add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String[] args={idField.getText(),fNameField.getText(),lNameField.getText(),ageField.getText()};
				mdl.update(args);
				tbl.revalidate();
			}
		});
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(340,370, 100, 20);
		add(btnDelete);
		btnDelete.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				mdl.delete(Integer.valueOf(idField.getText()));
				tbl.revalidate();
			}
		});
	}
}
