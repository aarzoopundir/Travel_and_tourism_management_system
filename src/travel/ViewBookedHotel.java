package travel;

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
public class ViewBookedHotel extends JFrame {
	private JPanel contentPane;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBookedHotel frame = new ViewBookedHotel("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewBookedHotel(String username)  {
		setBounds(280, 50, 850, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\bookedDetails.jpg");
                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(443,70,350,374);
                getContentPane().add(la1);
		
		JLabel lblName = new JLabel("VIEW BOOKED HOTEL DETAILS");
		lblName.setFont(new Font("Engravers MT", Font.BOLD, 20));
		lblName.setBounds(88, 11, 444, 53);
		contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Username :");
                lb3.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lb3.setBounds(35, 70, 151, 29);
		contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Name :");
                lblId.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblId.setBounds(35, 110, 151, 29);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Number of Persons :");
                lb2.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lb2.setBounds(35, 150, 151, 29);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("Number of Days :");
		lblName_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblName_1.setBounds(35, 190, 151, 29);
		contentPane.add(lblName_1);
		
		JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("AC / Non-AC :");
		lblGender.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblGender.setBounds(35, 230, 151, 29);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Food Included (Yes/No) :");
		lblCountry.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblCountry.setBounds(35, 270, 189, 29);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("ID :");
		lblReserveRoomNumber.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblReserveRoomNumber.setBounds(35, 310, 189, 29);
		contentPane.add(lblReserveRoomNumber);
                
                JLabel l7 = new JLabel();
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		JLabel lblCheckInStatus = new JLabel("Number :");
		lblCheckInStatus.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblCheckInStatus.setBounds(35, 350, 189, 29);
		contentPane.add(lblCheckInStatus);
                
                JLabel l8 = new JLabel();
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		JLabel lblDeposite = new JLabel("Phone :");
		lblDeposite.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblDeposite.setBounds(35, 390, 189, 29);
		contentPane.add(lblDeposite);
		
		JLabel l9 = new JLabel();
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);
                
                JLabel la2 = new JLabel("Cost :");
                la2.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		la2.setBounds(35, 430, 189, 29);
		contentPane.add(la2);
		
		JLabel l10 = new JLabel();
		l10.setBounds(271, 430, 200, 14);
		contentPane.add(l10);
                
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from bookHotel where username = '"+username+"'");
                    while(rs.next()){
                        l1.setText(rs.getString(1));
                        l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l7.setText(rs.getString(7));
                        l8.setText(rs.getString(8));
                        l9.setText(rs.getString(9));
                        l10.setText(rs.getString(10));
                        
                        
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
		btnExit.setBounds(160, 470, 136, 41);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(new Color(240, 248, 255));
	}
}