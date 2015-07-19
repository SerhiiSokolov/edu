package edu.hillel.hw2.xframes;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class XFrame2 extends JFrame
{
	public XFrame2() 
	{
		setTitle("HW2-2");
		setBounds(400,0,300,200);
		add(new XPanel2());
		setVisible(true);
	}
}
