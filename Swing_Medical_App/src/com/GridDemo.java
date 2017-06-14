package com;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridDemo extends JFrame
{
		public static void main(String[] args) 
		{
			
				GridDemo  gd  =new GridDemo();
				gd.setVisible(true);
				gd.setSize(500, 500);
				gd.setTitle("GridLayout");
		}
		
		public GridDemo() 
		{
		  GridLayout gl  =new GridLayout(5, 5); //ROW COL
		  setLayout(gl);
		  for(int i=0;i<5;i++)
		  {
			  for(int j=0;j<5;j++)
			  {
				  if(i==j)
				  {
					  add(new JLabel(i+"")).setBackground(Color.CYAN);
				  }
				  else
				  {
					  add(new JButton(i+"")).setBackground(Color.GREEN);
				  }
			  }
		  }
		}
}
