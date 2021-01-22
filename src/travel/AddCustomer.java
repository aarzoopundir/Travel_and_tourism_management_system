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
public class AddCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
        JComboBox comboBox;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddCustomer(String username) throws SQLException {
		System.out.println(username);
                setBounds(400, 120, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\newcustomer.jpg");
                Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(431,53,368,421);
                getContentPane().add(l1);
		
		JLabel lblName = new JLabel("NEW CUSTOMER FORM");
		lblName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblName.setBounds(74, 0, 277, 53);
		contentPane.add(lblName);
                
                JLabel l3 = new JLabel("Username :");
                l3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		l3.setBounds(35, 70, 127, 20);
		contentPane.add(l3);
                
                t7 = new JTextField();
		t7.setBounds(208, 70, 213, 20);
		contentPane.add(t7);
		t7.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
                lblId.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblId.setBounds(35, 110, 114, 20);
		contentPane.add(lblId);
                
                comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
		comboBox.setBounds(208, 110, 213, 20);
		contentPane.add(comboBox);
                
                JLabel l2 = new JLabel("Number :");
                l2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		l2.setBounds(35, 150, 127, 20);
		contentPane.add(l2);
                
                t1 = new JTextField();
		t1.setBounds(208, 150, 213, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblName_1.setBounds(35, 190, 107, 20);
		contentPane.add(lblName_1);
		
		t2 = new JTextField();
		t2.setBounds(208, 190, 213, 20);
		contentPane.add(t2);
		t2.setColumns(10);

                
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblGender.setBounds(35, 230, 114, 20);
		contentPane.add(lblGender);
                
                r1 = new JRadioButton("Male");
                r1.setFont(new Font("Raleway", Font.BOLD, 14));
                r1.setBackground(Color.WHITE);
                r1.setBounds(208, 232, 91, 16);
                getContentPane().add(r1);
                
                r2 = new JRadioButton("Female");
                r2.setFont(new Font("Raleway", Font.BOLD, 14));
                r2.setBackground(Color.WHITE);
                r2.setBounds(325, 230, 100, 16);
		getContentPane().add(r2);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblCountry.setBounds(35, 270, 114, 20);
		contentPane.add(lblCountry);
                
                t3 = new JTextField();
		t3.setBounds(208, 270, 213, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblReserveRoomNumber.setBounds(35, 310, 150, 20);
		contentPane.add(lblReserveRoomNumber);
                
                t5 = new JTextField();
		t5.setBounds(208, 310, 213, 20);
		contentPane.add(t5);
		t5.setColumns(10);
           	
		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblCheckInStatus.setBounds(35, 350, 107, 20);
		contentPane.add(lblCheckInStatus);
                
                t6 = new JTextField();
		t6.setBounds(208, 350, 213, 20);
		contentPane.add(t6);
		t6.setColumns(10);
		
		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblDeposite.setBounds(35, 390, 107, 20);
		contentPane.add(lblDeposite);
		
		t8 = new JTextField();
		t8.setBounds(208, 390, 213, 20);
		contentPane.add(t8);
		t8.setColumns(10);
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
                    while(rs.next()){
                        t7.setText(rs.getString("username"));  
                        t2.setText(rs.getString("name"));
                    }
                }catch(Exception e){ }
		
		

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                           
                          
                            try{
	    			String s9 = t7.getText(); //username
                                String s1 = (String)comboBox.getSelectedItem(); 
	    			String s2 =  t1.getText();
	    			String s3 =  t2.getText();
                                String s4 =  radio;
	    			String s5 =  t3.getText();
	    			String s7 =  t5.getText();  //address
                                String s8 =  t6.getText();
                                String s10 = t8.getText(); //email
                                
                                String q1 = "insert into customer values('"+s9+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s7+"','"+s8+"','"+s10+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(new Color(0, 139, 139));
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(new Color(0, 139, 139));
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}