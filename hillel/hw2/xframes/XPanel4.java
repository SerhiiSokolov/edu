package edu.hillel.hw2.xframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class XPanel4 extends JPanel 
{
	static JTextField inputLine=null;
	static int firstNumber=0;
	static String action="+";
	static boolean needClear=false;
	public XPanel4()
	{
		setLayout(null);

		inputLine=new JTextField();
		inputLine.setBounds(10, 10, 320, 20);
		add(inputLine);

		JButton btn1=new JButton("1");
		btn1.setBounds(10,40,50,30);
		add(btn1);

		JButton btn2=new JButton("2");
		btn2.setBounds(70,40,50,30);
		add(btn2);

		JButton btn3=new JButton("3");
		btn3.setBounds(130,40,50,30);
		add(btn3);

		JButton btn4=new JButton("4");
		btn4.setBounds(10,80,50,30);
		add(btn4);

		JButton btn5=new JButton("5");
		btn5.setBounds(70,80,50,30);
		add(btn5);

		JButton btn6=new JButton("6");
		btn6.setBounds(130,80,50,30);
		add(btn6);

		JButton btn7=new JButton("7");
		btn7.setBounds(10,120,50,30);
		add(btn7);

		JButton btn8=new JButton("8");
		btn8.setBounds(70,120,50,30);
		add(btn8);

		JButton btn9=new JButton("9");
		btn9.setBounds(130,120,50,30);
		add(btn9);

		JButton btn0=new JButton("0");
		btn0.setBounds(70,160,50,30);
		add(btn0);

		JButton btnPlus=new JButton("+");
		btnPlus.setBounds(220,40,50,30);
		add(btnPlus);

		JButton btnMinus=new JButton("-");
		btnMinus.setBounds(280,40,50,30);
		add(btnMinus);

		JButton btnMultiply=new JButton("*");
		btnMultiply.setBounds(220,80,50,30);
		add(btnMultiply);

		JButton btnDevide=new JButton("/");
		btnDevide.setBounds(280,80,50,30);
		add(btnDevide);

		JButton btnCalc=new JButton("=");
		btnCalc.setBounds(220,120,110,30);
		add(btnCalc);
		
		JButton btnClear=new JButton("C");
		btnClear.setBounds(220,160,110,30);
		add(btnClear);

		btn1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("1");
			}
		});

		btn2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("2");
			}
		});

		btn3.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("3");
			}
		});

		btn4.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("4");
			}
		});

		btn5.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("5");
			}
		});

		btn6.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("6");
			}
		});

		btn7.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("7");
			}
		});

		btn8.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("8");
			}
		});

		btn9.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("9");
			}
		});

		btn0.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setValue("0");
			}
		});
		
		btnPlus.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setAction("+");
			}
		});
		
		btnMinus.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setAction("-");
			}
		});
		
		btnMultiply.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setAction("*");
			}
		});
		
		btnDevide.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setAction("/");
			}
		});
		
		btnCalc.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				inputLine.setText(calculate());
			}
		});
		
		btnClear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				clearScreen();
			}
		});
	}
	
	public static void clearScreen()
	{
		inputLine.setText("");
	}
	
	public static void setValue(String data)
	{
		if(needClear)
		{
			inputLine.setText("");
			needClear=false;
		}
		inputLine.setText(inputLine.getText()+data);
	}
	
	public static void setFirstNumber()
	{
		try
		{
		firstNumber=Integer.parseInt(inputLine.getText());
		}
		catch (NumberFormatException errObj)
		{
		}
	}

	public static void setAction(String value)
	{
		setFirstNumber();
		action=value;
		inputLine.setText(value);
		needClear=true;
	}
	
	public static String calculate()
	{
		int result=0;
		int x=0, y=0;
		try
		{			
			x=firstNumber;
			y=Integer.parseInt(inputLine.getText());
			if (action.equals("+")) 
			{
				result=x+y;
			}
			else if (action.equals("-"))
			{
				result=x-y;
			}
			else if (action.equals("*"))
			{
				result=x*y;
			}
			else if (action.equals("/")) 
			{
				result=x/y;
			}
		}
		catch (NumberFormatException|NullPointerException errObj)
		{
		}
		catch (ArithmeticException errObj)
		{
			JOptionPane.showMessageDialog(null, "Cant devide by zero");
		}		
		needClear=true;
		return String.valueOf(result);
	}
}
