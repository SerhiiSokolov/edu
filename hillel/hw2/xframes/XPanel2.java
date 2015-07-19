package edu.hillel.hw2.xframes;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class XPanel2 extends JPanel 
{
	JTextField word1=null;
	JTextField word2=null;
	JTextField result=null;
	public XPanel2()
	{
		setLayout(null);
		
		word1=new JTextField();
		word1.setBounds(10, 10, 120, 20);
		add(word1);
		
		word2=new JTextField();
		word2.setBounds(10, 40, 120, 20);
		add(word2);
		
		result=new JTextField();
		result.setBounds(10,70,120,20);
		add(result);
		
		JButton btn=new JButton("Concat");
		btn.setBounds(10, 110, 120, 20);
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(word1.getText()+word2.getText());
			}
		});

	}
}
