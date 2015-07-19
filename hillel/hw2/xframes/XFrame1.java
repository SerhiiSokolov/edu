package edu.hillel.hw2.xframes;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class XFrame1 extends JFrame
{
	public XFrame1() 
	{
		setTitle("HW2-1");
		setBounds(400,0,300,200);
		add(new XPanel1());
		setVisible(true);
	}
}
