package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewPakage extends JFrame {
	private JPanel contentPane;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPakage frame = new ViewPakage("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewPakage(String username)  {
		setBounds(260, 130, 843, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\bookedDetails.jpg");
                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(415,39,350,350);
                getContentPane().add(la1);
		
		JLabel lblName = new JLabel("VIEW PACKAGE DETAILS");
		lblName.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblName.setBounds(78, 11, 282, 53);
		contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Username :");
                lb3.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lb3.setBounds(35, 70, 147, 24);
		contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
		l1.setBounds(271, 70, 200, 24);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Package :");
                lblId.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblId.setBounds(35, 110, 120, 24);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 110, 200, 24);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Number of Persons :");
                lb2.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lb2.setBounds(35, 150, 165, 29);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 150, 200, 29);
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("ID :");
		lblName_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblName_1.setBounds(35, 190, 155, 29);
		contentPane.add(lblName_1);
		
		JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 29);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Number :");
		lblGender.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblGender.setBounds(35, 230, 147, 29);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
		l5.setBounds(271, 230, 200, 29);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Phone :");
		lblCountry.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblCountry.setBounds(35, 270, 165, 29);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
		l6.setBounds(271, 270, 200, 29);
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("Price :");
		lblReserveRoomNumber.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblReserveRoomNumber.setBounds(35, 310, 165, 29);
		contentPane.add(lblReserveRoomNumber);
                
                JLabel l7 = new JLabel();
		l7.setBounds(271, 310, 200, 29);
		contentPane.add(l7);
           	
		Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from bookPackage where username = '"+username+"'");
                    while(rs.next()){
                        l1.setText(rs.getString(1));
                        l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l7.setText(rs.getString(7));
                        
                    }

                    rs.close();
                }catch(SQLException e){}

		
		JButton btnExit = new JButton("Back");
		btnExit.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(160, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(new Color(255, 250, 240));
	}
}