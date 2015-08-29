package edu.hillel.hw12.db;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AddPanel extends JPanel 
{
	public AddPanel()
	{
		setLayout(null);
		
		JTextArea idArea=new JTextArea();
		idArea.setText("ID");
		add(idArea);
	}
}
