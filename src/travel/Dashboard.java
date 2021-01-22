package travel;
import java.awt.Image;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Dashboard extends JFrame implements ActionListener{
	private JButton b13,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b15;
	private JButton b14;
   String username;
	Dashboard(String username){
		this.username=username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0, 0, 102));
		p1.setBounds(0,0,1800,50);
		getContentPane().add(p1);
		
		ImageIcon i4=new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\img.png");
		Image i5=i4.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel l2=new JLabel(i6);
		l2.setBounds(5,0,50,50);
		p1.add(l2);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(65, 0, 225, 50);
		p1.add(lblNewLabel);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0, 0, 102));
		p2.setBounds(0,50,250,900);
		getContentPane().add(p2);
		
		 b1=new JButton("Add personal Details");
		 b1.addActionListener(this);
		b1.setHorizontalAlignment(SwingConstants.LEFT);
		b1.setBackground(new Color(0,0,102));
		b1.setFont(new Font("Tahoma", Font.BOLD,16));
		b1.setForeground(Color.WHITE);
		b1.setBounds(0,0,250,35);
		p2.add(b1);
		
		 b2=new JButton("Update personal Details");
		 b2.addActionListener(this);
		b2.setHorizontalAlignment(SwingConstants.LEFT);
		b2.setBackground(new Color(0,0,102));
		b2.setFont(new Font("Tahoma", Font.BOLD,16));
		b2.setForeground(Color.WHITE);
		b2.setBounds(0,35,250,35);
		p2.add(b2);
		
		 b3=new JButton("View Details");
		b3.setHorizontalAlignment(SwingConstants.LEFT);
		b3.addActionListener(this);
		b3.setBackground(new Color(0,0,102));
		b3.setFont(new Font("Tahoma", Font.BOLD,16));
		b3.setForeground(Color.WHITE);
		b3.setBounds(0,65,250,35);
		p2.add(b3);
		
		 b4=new JButton("Delete personal Details");
		b4.setHorizontalAlignment(SwingConstants.LEFT);
		b4.setBackground(new Color(0,0,102));
		b4.setFont(new Font("Tahoma", Font.BOLD,16));
		b4.setForeground(Color.WHITE);
		b4.setBounds(0,95,250,35);
		p2.add(b4);
		
		 b5=new JButton("Check Package");
		b5.setHorizontalAlignment(SwingConstants.LEFT);
		b5.addActionListener(this);
		b5.setBackground(new Color(0,0,102));
		b5.setFont(new Font("Tahoma", Font.BOLD,16));
		b5.setForeground(Color.WHITE);
		b5.setBounds(0,125,250,35);
		p2.add(b5);
		
		 b6=new JButton("Book package");
		b6.setHorizontalAlignment(SwingConstants.LEFT);
		b6.addActionListener(this);
		b6.setBackground(new Color(0,0,102));
		b6.setFont(new Font("Tahoma", Font.BOLD,16));
		b6.setForeground(Color.WHITE);
		b6.setBounds(0,155,250,35);
		p2.add(b6);
		
	   b7=new JButton("View Package");
		b7.setHorizontalAlignment(SwingConstants.LEFT);
		b7.addActionListener(this);
		b7.setBackground(new Color(0,0,102));
		b7.setFont(new Font("Tahoma", Font.BOLD,16));
		b7.setForeground(Color.WHITE);
		b7.setBounds(0,185,250,35);
		p2.add(b7);
		
		 b8=new JButton("View Hotels");
		b8.setHorizontalAlignment(SwingConstants.LEFT);
		b8.addActionListener(this);
		b8.setBackground(new Color(0,0,102));
		b8.setFont(new Font("Tahoma",Font.BOLD,16));
		b8.setForeground(Color.WHITE);
		b8.setBounds(0,215,250,35);
		p2.add(b8);
		
		 b9=new JButton("Book Hotel");
		b9.setHorizontalAlignment(SwingConstants.LEFT);
		b9.addActionListener(this);
		b9.setBackground(new Color(0,0,102));
		b9.setFont(new Font("Tahoma", Font.BOLD,16));
		b9.setForeground(Color.WHITE);
		b9.setBounds(0,245,250,35);
		p2.add(b9);
		
		 b10=new JButton("View Booked Hotel");
		b10.setHorizontalAlignment(SwingConstants.LEFT);
		b10.addActionListener(this);
		b10.setBackground(new Color(0,0,102));
		b10.setFont(new Font("Tahoma", Font.BOLD,16));
		b10.setForeground(Color.WHITE);
		b10.setBounds(0,275,250,35);
		p2.add(b10);
		
		 b11=new JButton("Destinations");
		b11.setHorizontalAlignment(SwingConstants.LEFT);
		b11.addActionListener(this);
		b11.setBackground(new Color(0,0,102));
		b11.setFont(new Font("Tahoma", Font.BOLD,16));
		b11.setForeground(Color.WHITE);
		b11.setBounds(0,305,250,35);
		p2.add(b11);
		
		 b12=new JButton("Payment");
		b12.setHorizontalAlignment(SwingConstants.LEFT);
		b12.addActionListener(this);
		b12.setBackground(new Color(0,0,102));
		b12.setFont(new Font("Tahoma", Font.BOLD,16));
		b12.setForeground(Color.WHITE);
		b12.setBounds(0,335,250,35);
		p2.add(b12);
		
		 b13=new JButton("Calculator");
		b13.setHorizontalAlignment(SwingConstants.LEFT);
		b13.addActionListener(this);
		b13.setBackground(new Color(0,0,102));
		b13.setFont(new Font("Tahoma", Font.BOLD,16));
		b13.setForeground(Color.WHITE);
		b13.setBounds(0,365,250,35);
		p2.add(b13);
		
		 b14=new JButton("Notepad");
		b14.setHorizontalAlignment(SwingConstants.LEFT);
		b14.addActionListener(this);
		b14.setBackground(new Color(0,0,102));
		b14.setFont(new Font("Tahoma", Font.BOLD,16));
		b14.setForeground(Color.WHITE);
		b14.setBounds(0,395,250,35);
		p2.add(b14);
		
		 b15=new JButton("About");
		b15.setHorizontalAlignment(SwingConstants.LEFT);
		b15.addActionListener(this);
		b15.setBackground(new Color(0,0,102));
		b15.setFont(new Font("Tahoma", Font.BOLD,16));
		b15.setForeground(Color.WHITE);
		b15.setBounds(0,425,250,35);
		p2.add(b15);
		
		ImageIcon i1=new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\home.jpg");
		Image i2=i1.getImage().getScaledInstance(1400, 680,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		l1.setBounds(0,0,1400,680);
		getContentPane().add(l1);
		
		JLabel l4=new JLabel("Travel and Tourism management System");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		l4.setBounds(390,63,1000,60);
		l1.add(l4);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b13) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {}
		}else if(ae.getSource()==b14) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b1) {
			try {
				new AddCustomer(username).setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b2) {
			try {
				new UpdateCustomer(username).setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b3) {
			try {
				new ViewCustomers(username).setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b5) {
			try {
				new CheckPackage().setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b6) {
			try {
				new BookPackage(username).setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b7) {
			try {
				new ViewPakage(username).setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b8) {
			try {
				new CheckHotels().setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b9) {
			try {
				new BookHotel(username).setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b10) {
			try {
				new ViewBookedHotel(username).setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b11) {
			try {
				new Destination().setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b12) {
			try {
				new Payment().setVisible(true);
			}catch(Exception e) {}
		}
		else if(ae.getSource()==b15) {
			try {
				new About().setVisible(true);
			}catch(Exception e) {}
		}
	}
	
	public static void main(String args[]) {
		new Dashboard("").setVisible(true);
	}
}
