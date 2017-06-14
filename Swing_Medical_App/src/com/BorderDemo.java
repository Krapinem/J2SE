package com;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderDemo extends JFrame 
{
	public static void main(String[] args) 
	{
	   BorderDemo bd  =new BorderDemo();
	   			  bd.setSize(400, 500);
	   			  bd.setTitle("Border Layout");
	   			  bd.setVisible(true);
		
	}
	JButton w,s,n,e,c;
	public BorderDemo() 
	{
		 //BorderLayout bl =new BorderLayout();
		 BorderLayout bl =new BorderLayout(50,40);
		 setLayout(bl);
		 w  =new JButton("WEST");
		 s  =new JButton("SOUTH");
		 n  =new JButton("NORTH");
		 e  =new JButton("EAST");
		 c  =new JButton("CENTER");
		 add(w,BorderLayout.WEST);
		 add(s,BorderLayout.SOUTH);
		 add(n,BorderLayout.NORTH);
		 add(e,BorderLayout.EAST);
		 add(c);
		 
	}
}
