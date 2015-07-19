package edu.hillel.hw2.xframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class XPanel extends JPanel 
{
	public XPanel()
	{
		setLayout(null);
		
		JButton btn1=new JButton("Task 1");
		JButton btn2=new JButton("Task 2");
		JButton btn3=new JButton("Task 3");
		JButton btn4=new JButton("Task 4");
		
		btn1.setBounds(10, 10, 100, 40);
		btn2.setBounds(160, 10, 100, 40);
		btn3.setBounds(10, 80, 100, 40);
		btn4.setBounds(160, 80, 100, 40);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		btn1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				new XMain1();				
			}
		});
		
		btn2.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				new XMain2();				
			}
		});
		
		btn3.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				new XMain3();				
			}
		});
		
		btn4.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				new XMain4();				
			}
		});
	}
}
