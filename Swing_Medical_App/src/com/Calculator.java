package com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator   extends  JFrame implements ActionListener

{
  public static void main(String[] args) 
  {
	  Calculator cal  =new Calculator();
	  cal.setVisible(true);
	  cal.setSize(500, 500);
	  cal.setTitle("Calculator");
	 // cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
  }
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,sum,sub,div,multi,eq;
  JTextField jta;
  JLabel msg;
  public Calculator() 
  {
	  setLayout(null);
	  msg  =new JLabel("Calculator");
	  add(msg);
	  jta  =new JTextField(200);
	  jta.setBackground(Color.cyan);
	  
	  msg.setBounds(200, 50, 100, 20);
	  jta.setBounds(200, 100, 300, 30);
	  add(jta);
	  b1  =new JButton("1");
	  add(b1);
	  b1.setBounds(200, 140, 50, 30);
	  b2  =new JButton("2");
	  add(b2);
	  b2.setBounds(260, 140, 50, 30);
	  b3  =new JButton("3");
	  add(b3);
	  b3.setBounds(320, 140, 50, 30);
	  b4  =new JButton("4");
	  add(b4);
	  b4.setBounds(380, 140, 50, 30);
	  b5  =new JButton("5");
	  add(b5);
	  b5.setBounds(440, 140, 50, 30);
	  sum  =new JButton("+");
	  add(sum);
	  sum.setBounds(200, 180, 50, 30);
	  sub  =new JButton("-");
	  add(sub);
	  sub.setBounds(260, 180, 50, 30);
	  multi  =new JButton("*");
	  add(multi);
	  multi.setBounds(320, 180, 50, 30);
	  div  =new JButton("/");
	  add(div);
	  div.setBounds(380, 180, 50, 30);
	  eq  =new JButton("=");
	  add(eq);
	  eq.setBounds(440, 180, 50, 30);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  sum.addActionListener(this);
	  eq.addActionListener(this);
  }
  static int op=0,a=0,b=0,flag=0;
  @Override
  public void actionPerformed(ActionEvent e)
  {
	
	 
	//System.out.println("action performed call");
	  if(e.getSource()==b1)
	  {
		  jta.setText(b1.getText());  //  jta.setText(jta.getText().concat("1"));
		  if(flag==0)
		  {
			  a  =  Integer.parseInt(b1.getText());
			  flag =1;
		  }
		  else
		  {
			  b  =  Integer.parseInt(b1.getText());
		  }
	  }
	  if(e.getSource()==b2)
	  {
		  jta.setText(b2.getText());
		  if(flag==0)
		  {
			  a  =  Integer.parseInt(b2.getText());
			  flag =1;
		  }
		  else
		  {
			  b  =  Integer.parseInt(b2.getText());
		  }
	  }
	  if(e.getSource()==sum)
	  {
		  jta.setText("");
		 
		  op=1;
	  }
	  if(e.getSource()==sub)
	  {
		  jta.setText("");
		  op=2;
	  }
	  
	  if(e.getSource()==eq)
	  {
		  System.out.println("op  :"+op);
		     switch(op)
		     {
		     		case 1 :  int sum  = a+b;
		     				  System.out.println(sum);
		     		 		  jta.setText(sum+"");	
		     				  break;
		     		case 2 :  int sub  = a-b;
   		 		  			  jta.setText(sub+"");	
   		 		  			   break;
		     }
	  }
	  
	
	
  }
  
}
