package edu.hillel.hw2.xframes;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class XFrame extends JFrame
{
	public XFrame() 
	{
		setTitle("HW2");
		setBounds(0,0,300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new XPanel());
		setVisible(true);
	}
}
