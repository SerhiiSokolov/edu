package edu.hillel.hw12.db;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DPanel extends JPanel
{
	JTable tbl = null;
	TModel mdl = null;
	MyTModel myMdl=null;
	
	public DPanel()
	{
		setLayout(null);
		
		mdl = new TModel();
		tbl = new JTable(mdl);
		JScrollPane sp = new JScrollPane(tbl);
		sp.setBounds(10, 10, 400, 300);
		add(sp);
		
		JButton btnRead = new JButton("Read");
		btnRead.setBounds(10,350, 120, 20);
		add(btnRead);
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				mdl.setDS();
				tbl.revalidate();
			}
		});
	}
	
	
}
