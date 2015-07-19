package edu.hillel.hw2.xframes;

import javax.swing.JFrame;

public class XFrame3 extends JFrame
{
	public XFrame3() 
	{
		setTitle("HW2-3");
		setBounds(400,0,300,200);
		add(new XPanel3());
		setVisible(true);
	}
}
