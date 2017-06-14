package com.java.piet.hod;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration extends JFrame implements ActionListener
{

	private JTextField name;
	private JRadioButton male,female;
	private JTextField email;
	private JTextField phone;
	private JTextField pincode;
	private final ButtonGroup gender = new ButtonGroup();
	private JPasswordField password;
	private JPasswordField confirmpassword;
	private JButton submit,cancel,clear;
	private JComboBox country;
	private JPopupMenu popupMenu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setForeground(Color.GRAY);
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.CYAN);
		getContentPane().add(panel, BorderLayout.PAGE_START);
		
		JLabel lblRegistrationForm = new JLabel("REGISTRATION FORM");
		lblRegistrationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblRegistrationForm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.CYAN);
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("102px"),
				ColumnSpec.decode("left:143px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("max(66px;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(76px;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("79px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("max(58dlu;default)"),},
			new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel, "2, 4, left, top");
		
		name = new JTextField();
		name.setBackground(new Color(175, 238, 238));
		name.setToolTipText("");
		panel_1.add(name, "4, 4, 3, 1, fill, top");
		name.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblGender, "2, 6");
		
		male = new JRadioButton("Male");
		male.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gender.add(male);
		male.setBackground(Color.CYAN);
		panel_1.add(male, "4, 6");
		
		female = new JRadioButton("Female");
		female.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gender.add(female);
		female.setBackground(Color.CYAN);
		panel_1.add(female, "6, 6");
		
		JLabel lblNewLabel_1 = new JLabel("Email ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1, "2, 8, left, top");
		
		email = new JTextField();
		email.setBackground(new Color(175, 238, 238));
		panel_1.add(email, "4, 8, 3, 1, fill, default");
		email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_2, "2, 10, left, default");
		
		password = new JPasswordField();
		password.setBackground(new Color(175, 238, 238));
		panel_1.add(password, "4, 10, 3, 1, fill, default");
		
		JLabel lblNewLabel_3 = new JLabel("Confirm Password:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_3, "2, 12, left, default");
		
		confirmpassword = new JPasswordField();
		confirmpassword.setBackground(new Color(175, 238, 238));
		panel_1.add(confirmpassword, "4, 12, 3, 1, fill, default");
		
		JLabel lblNewLabel_4 = new JLabel("Phone No:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_4, "2, 14, left, default");
		
		phone = new JTextField();
		phone.setBackground(new Color(175, 238, 238));
		panel_1.add(phone, "4, 14, 3, 1, fill, default");
		phone.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Country:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_5, "2, 16, left, default");
		
		String[] countries = new String[]{ "","United Kingdom","United States","Afghanistan","Albania","Algeria","American Samoa","Andorra","Angola","Anguilla","Antarctica","Antigua And Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bosnia And Herzegowina","Botswana","Bouvet Island","Brazil","British Indian Ocean Territory","Brunei Darussalam","Bulgaria","Burkina Faso","Burundi","Cambodia","Cameroon","Canada","Cape Verde","Cayman Islands","Central African Republic","Chad","Chile","China","Christmas Island","Cocos (Keeling) Islands","Colombia","Comoros","Congo","Congo, The Democratic Republic Of The","Cook Islands","Costa Rica","Cote D'Ivoire","Croatia (Local Name: Hrvatska)","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica","Dominican Republic","East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia","Falkland Islands (Malvinas)","Faroe Islands","Fiji","Finland","France","France, Metropolitan","French Guiana","French Polynesia","French Southern Territories","Gabon","Gambia","Georgia","Germany","Ghana","Gibraltar","Greece","Greenland","Grenada","Guadeloupe","Guam","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Heard And Mc Donald Islands","Holy See (Vatican City State)","Honduras","Hong Kong","Hungary","Iceland","India","Indonesia","Iran (Islamic Republic Of)","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kiribati","Korea, Democratic People's Republic Of","Korea, Republic Of","Kuwait","Kyrgyzstan","Lao People's Democratic Republic","Latvia","Lebanon","Lesotho","Liberia","Libyan Arab Jamahiriya","Liechtenstein","Lithuania","Luxembourg","Macau","Macedonia, Former Yugoslav Republic Of","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Martinique","Mauritania","Mauritius","Mayotte","Mexico","Micronesia, Federated States Of","Moldova, Republic Of","Monaco","Mongolia","Montserrat","Morocco","Mozambique","Myanmar","Namibia","Nauru","Nepal","Netherlands","Netherlands Antilles","New Caledonia","New Zealand","Nicaragua","Niger","Nigeria","Niue","Norfolk Island","Northern Mariana Islands","Norway","Oman","Pakistan","Palau","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Pitcairn","Poland","Portugal","Puerto Rico","Qatar","Reunion","Romania","Russian Federation","Rwanda","Saint Kitts And Nevis","Saint Lucia","Saint Vincent And The Grenadines","Samoa","San Marino","Sao Tome And Principe","Saudi Arabia","Senegal","Seychelles","Sierra Leone","Singapore","Slovakia (Slovak Republic)","Slovenia","Solomon Islands","Somalia","South Africa","South Georgia, South Sandwich Islands","Spain","Sri Lanka","St. Helena","St. Pierre And Miquelon","Sudan","Suriname","Svalbard And Jan Mayen Islands","Swaziland","Sweden","Switzerland","Syrian Arab Republic","Taiwan","Tajikistan","Tanzania, United Republic Of","Thailand","Togo","Tokelau","Tonga","Trinidad And Tobago","Tunisia","Turkey","Turkmenistan","Turks And Caicos Islands","Tuvalu","Uganda","Ukraine","United Arab Emirates","United States Minor Outlying Islands","Uruguay","Uzbekistan","Vanuatu","Venezuela","Viet Nam","Virgin Islands (British)","Virgin Islands (U.S.)","Wallis And Futuna Islands","Western Sahara","Yemen","Yugoslavia","Zambia","Zimbabwe"};
		country = new JComboBox(countries);
		country.setForeground(Color.BLACK);
		country.setBackground(new Color(175, 238, 238));
		country.setMaximumRowCount(10);
		panel_1.add(country, "4, 16, 3, 1, fill, top");
		
		JLabel lblNewLabel_7 = new JLabel("Pin Code:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_7, "2, 18, left, default");
		
		pincode = new JTextField();
		pincode.setBackground(new Color(175, 238, 238));
		panel_1.add(pincode, "4, 18, 3, 1, fill, default");
		pincode.setColumns(10);
		
		submit = new JButton("Submit");
		submit.setBackground(new Color(175, 238, 238));
		panel_1.add(submit, "4, 20");
		
		popupMenu = new JPopupMenu("You Have Registered Successfully");
		addPopup(submit, popupMenu);
		
		clear = new JButton("Clear");
		clear.setBackground(new Color(175, 238, 238));
		panel_1.add(clear, "6, 20");
		
		cancel = new JButton("Cancel");
		cancel.setBackground(new Color(175, 238, 238));
		panel_1.add(cancel, "8, 20");
		
		submit.addActionListener(this);
		clear.addActionListener(this);
		cancel.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
	}

	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource()==submit)
		{
			if(password.getText().equals(confirmpassword.getText()))
			{
			JdbcCon con = new JdbcCon();
			
			String gender_FM = "";
			if(male.isSelected())
			{
				gender_FM=male.getText();
			}
			else if(female.isSelected())
			{
				gender_FM=female.getText();
			}
			
			int reg_id = con.getid();
			String statement = "Insert into registration values ("+(reg_id+1)+",\""+name.getText()+"\",\""+gender_FM+"\",\""+password.getText()+"\",\""+email.getText()+"\","+phone.getText()+",\""+country.getSelectedItem()+"\","+pincode.getText()+")";
			boolean result=con.connection(statement);
			
			clear();
			
				PopUp pop = new PopUp();
				pop.setVisible(true);
			dispose();
			
			}
		}
		
		
		if(event.getSource()==clear)
		{
			clear();
			
		}
		
		
		if(event.getSource()==cancel)
		{
			dispose();
		}
			
	}

	private void clear()
	{
		name.setText("");
		gender.clearSelection();
		email.setText("");
		password.setText("");
		confirmpassword.setText("");
		phone.setText("");
		pincode.setText("");
		country.setSelectedIndex(0);
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
