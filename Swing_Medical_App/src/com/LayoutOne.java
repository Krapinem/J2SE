package com;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutOne  extends JFrame 
{
		public static void main(String[] args) 
		{
			LayoutOne one  =new LayoutOne();
			one.setVisible(true);
			one.setSize(500, 500);
			one.setTitle("FlowLayout");
			
			one.setResizable(false);
			
			
		}
		JButton all[] =new JButton[10];
		public LayoutOne() 
		{
			//FlowLayout fl =new FlowLayout();

			FlowLayout fl =new FlowLayout(FlowLayout.LEFT,90,70);
			setLayout(fl);
			for(int i=0;i<all.length;i++)
			{
				add(all[i]=new JButton(i+""));
			}
					
		}
}
