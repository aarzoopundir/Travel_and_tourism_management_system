package travel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Prity
 */
public class Payment extends JFrame{
    
    public Payment(){
        
        getContentPane().setLayout(null);
        setBounds(250, 70, 800, 600);
        
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 360, 62);
        getContentPane().add(label);
        
        ImageIcon i7 = new ImageIcon("C:\\Users\\ranaa\\eclipse-workspace\\Travel management system\\src\\travel\\icons\\icons\\paytm.jpeg");
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 132, 800, 600);
        getContentPane().add(l4);
        
        JButton pay = new JButton("Pay");
        pay.setForeground(new Color(255, 255, 255));
        pay.setBackground(new Color(176, 224, 230));
        pay.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Paytm().setVisible(true);
            }
        });
        pay.setBounds(420, 32, 80, 40);
        getContentPane().add(pay);
    
        JButton back=new JButton("Back");
        back.setForeground(new Color(255, 255, 255));
        back.setBackground(new Color(176, 224, 230));
        back.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(512, 32, 80, 40);
        getContentPane().add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Payment().setVisible(true);
    }
    
}