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
public class BookHotel extends JFrame {
	private JPanel contentPane;
        JTextField t1,t2;
        Choice c1,c2,c3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookHotel frame = new BookHotel("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookHotel(String username) {
		setBounds(160, 50, 1100, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\book.jpg");
                Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,69,700,410);
                getContentPane().add(la1);
		
		JLabel lblName = new JLabel("BOOK HOTEL");
		lblName.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 25));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                JLabel la2 = new JLabel("Username :");
                la2.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		la2.setBounds(35, 70, 200, 29);
		contentPane.add(la2);
                
                JLabel l1 = new JLabel(username);
		l1.setBounds(271, 70, 200, 29);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Select Hotel :");
                lblId.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblId.setBounds(35, 110, 200, 29);
		contentPane.add(lblId);
                
                c1 = new Choice();
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from hotels");
                    while(rs.next()){
                        c1.add(rs.getString("name"));
                    }

                    rs.close();
                }catch(SQLException e){}

                c1.setBounds(271, 110, 150, 30);
                getContentPane().add(c1);
                
                JLabel la3 = new JLabel("Total Persons");
                la3.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		la3.setBounds(35, 150, 200, 29);
		contentPane.add(la3);
                
                t1 = new JTextField();
                t1.setText("0");
		t1.setBounds(271, 150, 150, 29);
		contentPane.add(t1);
		t1.setColumns(10);
                
                JLabel la4 = new JLabel("Number of Days");
                la4.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
                la4.setBounds(35, 190, 200, 29);
		contentPane.add(la4);
		
		t2 = new JTextField();
		t2.setText("0");
		t2.setBounds(271, 190, 150, 29);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JLabel la5 = new JLabel("AC / Non-AC");
		la5.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		la5.setBounds(35, 230, 200, 29);
		contentPane.add(la5);
                
                c2 = new Choice();
                c2.add("AC");
                c2.add("Non-AC");
                c2.setBounds(271, 230, 150, 30);
                getContentPane().add(c2);

                
		JLabel la6 = new JLabel("Food Included :");
		la6.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		la6.setBounds(35, 270, 200, 29);
		contentPane.add(la6);
                
                c3 = new Choice();
                c3.add("Yes");
                c3.add("No");
                c3.setBounds(271, 270, 150, 30);
                getContentPane().add(c3);
                
		JLabel lbl1 = new JLabel("ID :");
		lbl1.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lbl1.setBounds(35, 310, 200, 29);
		contentPane.add(lbl1);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 310, 200, 29);
		contentPane.add(l2);
		
		JLabel lbl2 = new JLabel("Number :");
		lbl2.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lbl2.setBounds(35, 350, 200, 29);
		contentPane.add(lbl2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 350, 200, 29);
		contentPane.add(l3);
           	
		JLabel lbl3 = new JLabel("Phone :");
		lbl3.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lbl3.setBounds(35, 390, 200, 29);
		contentPane.add(lbl3);
                
                JLabel l4 = new JLabel();
		l4.setBounds(271, 390, 200, 29);
		contentPane.add(l4);

		
		JLabel lblDeposite = new JLabel("Total Price :");
		lblDeposite.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblDeposite.setBounds(35, 430, 200, 29);
		contentPane.add(lblDeposite);
		
		JLabel l5 = new JLabel();
		l5.setBounds(271, 430, 200, 29);
                l5.setForeground(Color.RED);
		contentPane.add(l5);
                
                try{

                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l2.setText(rs.getString("id"));
                        l3.setText(rs.getString("numb"));
                        l4.setText(rs.getString("phone"));
                        
                    }

                    rs.close();
                }catch(SQLException e){}
                
                JButton b1 = new JButton("Check Price");
                b1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "select * from hotels where name = '"+c1.getSelectedItem()+"'";
                                ResultSet rs = c.s.executeQuery(q1);
                                if(rs.next()){
                                    
                                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                                    int food = Integer.parseInt(rs.getString("food_charges"));
                                    int ac = Integer.parseInt(rs.getString("ac_charges"));
                                    
                                    int persons = Integer.parseInt(t1.getText());
                                    int days = Integer.parseInt(t2.getText());
                                    
                                    String acprice = c2.getSelectedItem();
                                    String foodprice = c3.getSelectedItem();
                                    
                                    
                                    if(persons * days > 0) {
                                        int total = 0;
                                        total += acprice.equals("AC") ? ac : 1;
                                        total += foodprice.equals("Yes") ? food : 1;
                                        total += cost;
                                        total = total * persons * days;
                                        l5.setText("Rs "+total);
                                    }
                                    
                                    
                                }
                                
	    		}catch(Exception ee){
	    			System.out.println(ee.getMessage());
	    		}
                        }
		});
		b1.setBounds(50, 470, 140, 42);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		JButton btnNewButton = new JButton("Book");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookHotel values('"+l1.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
		btnNewButton.setBounds(200, 470, 140, 42);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(350, 470, 140, 42);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(new Color(255, 245, 238));
	}
}