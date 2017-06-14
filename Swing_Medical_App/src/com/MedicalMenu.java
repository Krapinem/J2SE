package com;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MedicalMenu  extends JFrame  implements ActionListener
{
		public static void main(String[] args) 
		{
				MedicalMenu mm  =new MedicalMenu();
				mm.setVisible(true);
				mm.setTitle("Medical Menu");
				mm.setSize(500, 500);
				
		}
		JMenuBar menu;
		JMenu su,me,ab,ex,re;
		JMenuItem anm,sm,um,dm,som;
		
		public MedicalMenu() 
		{
			menu  =  new JMenuBar();
			su =new JMenu("Supplier");
			me  =new JMenu("Medicine");
			re =new JMenu("Report");
			ab =new JMenu("About");
			ex  = new JMenu("Exit");
			menu.add(su);
			menu.add(me);
			menu.add(re);
			menu.add(ab);
			menu.add(ex);
			anm  =new JMenuItem("Add New Medicine");
			sm  =new JMenuItem("Search Medicine");
			um  =new JMenuItem("Update Medicine");
			dm =new JMenuItem("Delete Medicine");
			som  =new JMenuItem("Stock of Medicine");
			me.add(anm);
			me.add(sm);
			me.add(um);
			me.add(dm);
			me.add(som);
			
			
			
			add(menu,BorderLayout.NORTH);
			anm.addActionListener(this);
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
				AddNewMedicine nm =new AddNewMedicine();
				nm.setVisible(true);
				nm.setSize(500, 500);
				nm.setTitle("New Medicine");
		
		}

}
