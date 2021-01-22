package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 421);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 292, 392);
		panel.setLayout(null);
		contentPane.add(panel);
		ImageIcon i1=new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\login.png");
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(34,112,206,208);
		panel.add(l1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(292, 22, 375, 337);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(43, 43, 133, 20);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		textField.setBounds(43, 74, 287, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_1.setBounds(43, 114, 204, 20);
		panel_1.add(lblNewLabel_1);
		
		 btnNewButton = new JButton("Login");
		 btnNewButton.addActionListener(this);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		btnNewButton.setBounds(87, 213, 89, 32);
		panel_1.add(btnNewButton);
		
		
	   btnNewButton_1 = new JButton("Sign up");
	   btnNewButton_1.addActionListener(this);
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(176, 224, 230));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(202, 213, 89, 33);
		panel_1.add(btnNewButton_1);
		
		
		 btnNewButton_2 = new JButton("Forgot Password");
		 btnNewButton_2.addActionListener(this);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(176, 224, 230));
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		btnNewButton_2.setBounds(120, 259, 147, 33);
		panel_1.add(btnNewButton_2);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(43, 145, 287, 29);
		panel_1.add(passwordField);
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnNewButton) {
			try {
				String username=textField.getText();
				String password=passwordField.getText();
				String sql="select * from account where username = '"+username+"' AND password = '"+password+"'";
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery(sql);
				if(rs.next()) {
					this.setVisible(false);
					new Loading(username).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter valid credentials!");
				}
			}catch(Exception ae) {}
		}
		else if(e.getSource()==btnNewButton_1) {
			new Signup().setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==btnNewButton_2) {
			this.setVisible(false);
			new ForgotPassword().setVisible(true);
		}
		
	}
	

}
