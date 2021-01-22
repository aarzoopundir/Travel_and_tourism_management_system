package travel;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 954, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 527, 452);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel.setBounds(31, 39, 101, 33);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(211, 42, 289, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_1.setBounds(31, 101, 84, 26);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 94, 289, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_2.setBounds(31, 157, 101, 21);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(211, 145, 289, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Security Questions");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_3.setBounds(31, 207, 173, 26);
		panel.add(lblNewLabel_3);
		Choice c1=new Choice();
		c1.add("Your Lucky Number");
		c1.add("Your favorite childhood superhero?");
		c1.add("Your bestfriend?");
		c1.add("Your father's middle name");
		c1.add("Your favorite colour?");
		c1.setBounds(211,207,289,40);
		panel.add(c1);
		
		JLabel lblNewLabel_4 = new JLabel("Answer");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_4.setBounds(31, 261, 116, 26);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 261, 294, 33);
		panel.add(textField_3);
		textField_3.setColumns(10);
		 
		ImageIcon i1=new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\signup.png");
		Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l6=new JLabel(i3);
		l6.setBounds(618,56,270,294);
		getContentPane().add(l6);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String name=textField_1.getText();
				String password=textField_2.getText();
				String security=c1.getSelectedItem();
				String answer=textField_3.getText();

				try {
					if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")){
						 JOptionPane.showMessageDialog(null, "Fill all the required fields");
					 }
					else {
					Conn c=new Conn();
					String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Account created successfully");
					
					setVisible(false);
					new Login().setVisible(true);
					}
					
				}catch(Exception ex) {
					 ex.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(new Color(176, 224, 230));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		btnNewButton.setBounds(88, 339, 140, 33);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(176, 224, 230));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		btnNewButton_1.setBounds(264, 339, 140, 33);
		panel.add(btnNewButton_1);
	}
}
