package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.db.DBConnection;

public class AddNewMedicine  extends JFrame  implements ActionListener 
{
	  JLabel nmd,mbn,mtype;
	  JTextField tnmd;
	  JComboBox cmtype;
	  JButton save,all;
	  
	  public AddNewMedicine() 
	  {
		  setLayout(null);
		  nmd  =new JLabel("New Medicine Detail");
		  mbn  =new JLabel("Medicine Batch No");
		  mtype =new JLabel("Medicine Type");
		  tnmd  =new JTextField(20);
		  cmtype =new  JComboBox();
		  cmtype.addItem("A");
		  cmtype.addItem("C");
		  cmtype.addItem("D");
		  nmd.setBounds(200, 50, 150, 40);
		  add(nmd);
		  mbn.setBounds(100, 150, 100, 20);
		  add(mbn);
		  tnmd.setBounds(200, 150, 60, 20);
		  add(tnmd);

		  mtype.setBounds(280, 150, 100, 20);
		  add(mtype);
		  cmtype.setBounds(400, 150, 60, 20);
		  add(cmtype);
		  save  =new JButton("Save");
		  all  =new JButton("All");
		  save.setBounds(180, 200, 80, 30);
		  add(save);
		  all.setBounds(280, 200, 80, 30);
		  add(all);
		  save.addActionListener(this); 
		  all.addActionListener(this);
	  }
	  @Override
	  public void actionPerformed(ActionEvent e) 
	  {
		  if(e.getSource()==save)
		  {
		   int mb  =  Integer.parseInt(tnmd.getText());
		   String mt =  cmtype.getSelectedItem().toString();
		   System.out.println(mb+" :"+mt);
		   Connection con=null;
		   Statement stmt =null;
		   try
		   {
		    con  = DBConnection.getConnection();
		    stmt  = con.createStatement();
		   String sql ="insert into medicine values("+mb+",'"+mt+"')";
		   System.out.println(sql);
		   stmt.executeUpdate(sql);
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   DBConnection.closeResource(con, stmt);
		   }
		 }
		 if(e.getSource()==all)
		 {
			System.out.println("all");
			 Connection con  =null;
			 Statement stmt =null;
			 JTable table=null;
			 DefaultTableModel dtm =null;
			 String sql  = "select *from medicine";
			 ResultSet rs  =null;//virtual table inside java
			 try
			 {
				 con  = DBConnection.getConnection();
				 stmt  = con.createStatement();
				 rs  = stmt.executeQuery(sql);
				 
				 dtm  =new DefaultTableModel();
				 table  =new JTable(dtm);
				 dtm.addColumn("Med Batch");
				 dtm.addColumn("Med Type");
				 int count=0;
				 while(rs.next())
				 {
					 dtm.insertRow(count,new Object[]{rs.getInt(1),rs.getString(2)});
					 count++;
				 }
				 JScrollPane jsp  =new JScrollPane(table);
				 jsp.setBounds(150, 350, 300, 50);
				/* JPanel jp =new JPanel();
				 jp.setBounds(150, 350, 300, 150);
				 jp.add(jsp);
				 add(jp);*/
				 add(jsp);
				 
				 
			 }
			 catch(Exception ex)
			 {
				 ex.printStackTrace();
			 }
		 } 
	  }
	
}
