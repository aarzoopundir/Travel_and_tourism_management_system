package travel;
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.border.EmptyBorder;


import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewCustomers extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;
	private JLabel l3,l4,l5,l6,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lb18,lb19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCustomers frame = new ViewCustomers("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public ViewCustomers(String username) throws SQLException {
		setBackground(new Color(255, 255, 255));
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 80, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(231, 322, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblAvailability = new JLabel("Username");
		lblAvailability.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAvailability.setBounds(10, 23, 90, 30);
		contentPane.add(lblAvailability);
		lb11 = new JLabel();
		lb11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb11.setBounds(100, 23, 90, 30);
		contentPane.add(lb11);
		
		lblCleanStatus = new JLabel("Id Type");
		lblCleanStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCleanStatus.setBounds(10, 83, 90, 23);
		contentPane.add(lblCleanStatus);
		lb12 = new JLabel();
		lb12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb12.setBounds(100, 83, 90, 23);
		contentPane.add(lb12);
		
		lblNewLabel = new JLabel("Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 147, 90, 23);
		contentPane.add(lblNewLabel);
		lb13 = new JLabel("Number");
		lb13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb13.setBounds(100, 147, 90, 23);
		contentPane.add(lb13);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 214, 90, 23);
		contentPane.add(lblNewLabel_1);
		lb14 = new JLabel("Name");
		lb14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb14.setBounds(100, 214, 90, 23);
		contentPane.add(lb14);


		
		lblId = new JLabel("Gender");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(10, 276, 90, 23);
		contentPane.add(lblId);
		lb15 = new JLabel("Gender");
		lb15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb15.setBounds(100, 276, 90, 23);
		contentPane.add(lb15);
                
                l3 = new JLabel("Country");
                l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(423, 27, 111, 23);
		contentPane.add(l3);
		lb16 = new JLabel("Country");
        lb16.setFont(new Font("Tahoma", Font.BOLD, 14));
lb16.setBounds(534, 27, 111, 23);
contentPane.add(lb16);
                
               l4 = new JLabel("Address");
               l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(423, 83, 111, 23);
		contentPane.add(l4);
		lb17 = new JLabel("Address");
        lb17.setFont(new Font("Tahoma", Font.BOLD, 14));
	lb17.setBounds(534, 83, 111, 23);
	contentPane.add(lb17);
                
                 l5 = new JLabel("Phone");
                 l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(423, 147, 100, 23);
		contentPane.add(l5);
		 lb18 = new JLabel("Phone");
         lb18.setFont(new Font("Tahoma", Font.BOLD, 14));
lb18.setBounds(534, 147, 100, 23);
contentPane.add(lb18);
                
                 l6 = new JLabel("Email");
                 l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(423, 214, 90, 23);
		contentPane.add(l6);
		lb19 = new JLabel("Email");
        lb19.setFont(new Font("Tahoma", Font.BOLD, 14));
lb19.setBounds(534, 214, 90, 23);
contentPane.add(lb19);
		
		ImageIcon i1  = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\viewall.jpg");
        Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(29,349,626,201);
        getContentPane().add(l1);
        
        ImageIcon i4  = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\viewall.jpg");
        Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(640,349,626,201);
        getContentPane().add(l2);
        


        
        try{
            Conn c = new Conn();
                String sql = "select * from customer where username = '"+username+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()) {
                	lb11.setText(rs.getString("username"));
                	lb12.setText(rs.getString("id"));
                	lb13.setText(rs.getString("numb"));
                	lb14.setText(rs.getString("name"));
                	lb15.setText(rs.getString("gender"));
                	lb16.setText(rs.getString("country"));
                	lb17.setText(rs.getString("address"));
                	lb18.setText(rs.getString("phone"));
                	lb19.setText(rs.getString("email"));
                	
                }
               
        }
        catch(Exception e1){
                e1.printStackTrace();
        }

                
                getContentPane().setBackground(Color.WHITE);
	}}
