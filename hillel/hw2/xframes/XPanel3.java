package edu.hillel.hw2.xframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class XPanel3 extends JPanel 
{
	JTextField word1=null;
	JTextField word2=null;
	JTextField result=null;
	JTextField action=null;
	public XPanel3()
	{
		setLayout(null);

		word1=new JTextField();
		word1.setBounds(10, 10, 120, 20);
		add(word1);

		word2=new JTextField();
		word2.setBounds(10, 40, 120, 20);
		add(word2);

		action=new JTextField();
		action.setBounds(60, 70, 20, 20);;
		add(action);

		result=new JTextField();
		result.setBounds(10,100,120,20);
		add(result);

		JButton btn=new JButton("=");
		btn.setBounds(10, 130, 120, 20);
		add(btn);
		btn.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				result.setText(calculate(word1.getText(),word2.getText(),action.getText()));
			}

		});

	}
	public static String calculate(String word1, String word2, String action)
	{
		int result=0;
		int x=0, y=0;
		boolean flag=false;
		try
		{
			x=Integer.parseInt(word1);
			y=Integer.parseInt(word2);

			if (action.equals("+")) 
			{
				result=x+y;
				flag=true;
			}
			else if (action.equals("-"))
			{
				result=x-y;
				flag=true;
			}
			else if (action.equals("*"))
			{
				result=x*y;
				flag=true;
			}
			else if (action.equals("/")) 
			{
				result=x/y;
				flag=true;
			}
			if(!flag) JOptionPane.showMessageDialog(null, "Allowed only \"+ - * /\"");
		}
		catch (NumberFormatException errObj)
		{
			JOptionPane.showMessageDialog(null, "Field must be digit");
		}
		return Integer.toString(result);
	}
}
