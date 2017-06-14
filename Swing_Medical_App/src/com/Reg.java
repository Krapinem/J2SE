package com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Reg   extends JFrame
{
		public static void main(String[] args) 
		{
				Reg reg  =new Reg();
				reg.setVisible(true);
				reg.setTitle("MyReg");
				reg.setSize(500, 500);
				reg.setResizable(false);
		}
		JLabel fl,ln,gender,country;
		JTextField tfn,tln;
		JPanel jp1,jp2,jp3,jp4,jp5,jp6,jpmain,jpmain1;
		JRadioButton male,female;
		ButtonGroup bg;
		JComboBox item;
		
		public Reg() 
		{
			jpmain  =new JPanel();
			jpmain.setLayout(new GridLayout(4,1));
			jpmain1 =new JPanel();
			jpmain1.setLayout(new BorderLayout());
			jp1 =new JPanel();
			GridLayout gl = new GridLayout(2,2);
			jp1.setLayout(gl);
			 fl  =new JLabel("First Name");
			 ln  =new JLabel("Last Name");
			 tfn  =new JTextField(40);
			 tln  =new JTextField(40);
			 jp1.add(fl);
			 jp1.add(tfn);
			 jp1.add(ln);
			 jp1.add(tln);
			 jpmain.add(jp1);
			 jp2 =new JPanel();
			 GridLayout gl1 = new GridLayout(1,3);
			 jp2.setLayout(gl1);
			 gender =new JLabel("Gender");
			 male  =new JRadioButton("Male");
			 female  =new JRadioButton("FeMale");
			 bg  =new ButtonGroup();
			 bg.add(male);
			 bg.add(female);
			 jp2.add(gender);
			 jp2.add(male);
			 jp2.add(female);
			 jpmain.add(jp2);
			 jp3  =new JPanel();
			 jp3.setLayout(new GridLayout(1, 2));
			 jp3.add(new JLabel("Country"));
			 item  =new JComboBox();
			 item.addItem("IND");
			 item.addItem("PAK");
			 item.addItem("CHINA");
			 jp3.add(item);
			 jpmain.add(jp3);
			 jp4  =new JPanel();
			 jp4.setLayout(new FlowLayout(FlowLayout.CENTER,50,0));
			 jp4.add(new JButton("OK"));
			 jp4.add(new JButton("REG"));
			 jp4.add(new JButton("CANCEL"));
			 jpmain.add(jp4,BorderLayout.SOUTH);
			 add(jpmain);
				
			 
		}
}
