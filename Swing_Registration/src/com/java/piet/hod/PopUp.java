package com.java.piet.hod;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PopUp extends JFrame implements ActionListener {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public PopUp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300,100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblYouHaveSucessfully = new JLabel("You Have Sucessfully Registered");
		contentPane.add(lblYouHaveSucessfully, BorderLayout.CENTER);
		
		JButton btnOk = new JButton("OK");
		contentPane.add(btnOk, BorderLayout.EAST);
		btnOk.addActionListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		dispose();
		
		
	}

}
