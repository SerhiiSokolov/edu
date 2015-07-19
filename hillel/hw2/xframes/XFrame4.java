package edu.hillel.hw2.xframes;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class XFrame4 extends JFrame
{
	public XFrame4() 
	{
		setTitle("HW2-4");
		setBounds(400,0,300,200);
		add(new XPanel4());
		setVisible(true);
	}
}
