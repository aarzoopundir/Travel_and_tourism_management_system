package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class ForgotPassword extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword frame = new ForgotPassword();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ForgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1044, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon i1=new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\forgotpassword.jpg");
		Image i2=i1.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l6=new JLabel(i3);
		l6.setBounds(754,104,219,216);
		getContentPane().add(l6);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(22, 25, 678, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel.setBounds(23, 25, 113, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_1.setBounds(23, 73, 81, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Security Question");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_2.setBounds(23, 125, 209, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_3.setBounds(23, 173, 113, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_4.setBounds(23, 220, 139, 26);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(277, 28, 258, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(277, 76, 258, 31);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 128, 391, 31);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 176, 258, 31);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(277, 226, 258, 31);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		 btnNewButton = new JButton("Back");
		 btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		btnNewButton.setBounds(214, 297, 139, 39);
		panel.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("Search");
		 btnNewButton_1.addActionListener(this);
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		btnNewButton_1.setBounds(545, 27, 123, 32);
		panel.add(btnNewButton_1);
		
		 btnNewButton_2 = new JButton("Retrieve");
		 btnNewButton_2.addActionListener(this);
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		btnNewButton_2.setBounds(545, 175, 123, 32);
		panel.add(btnNewButton_2);
	}
	public void actionPerformed(ActionEvent ae) {
		Conn c=new Conn();
		if(ae.getSource()==btnNewButton_1) {
			try {
				String sq1="select * from account where username = '"+textField.getText()+"'";
				ResultSet rs=c.s.executeQuery(sq1);
				while(rs.next()) {
					textField_1.setText(rs.getString("name"));
					textField_2.setText(rs.getString("question"));
				}
			}catch(Exception e) {}
		}
		else if(ae.getSource()==btnNewButton_2) {
			try {
				String sq1="select * from account where answer = '"+textField_3.getText()+"' AND username ='"+textField.getText()+"'";
				ResultSet rs=c.s.executeQuery(sq1);
				while(rs.next()) {
					textField_4.setText(rs.getString("password"));
				}
			}catch(Exception e) {}
		}
		else if(ae.getSource()==btnNewButton) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
	}
}
