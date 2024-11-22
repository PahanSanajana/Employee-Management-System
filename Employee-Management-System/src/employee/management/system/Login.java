
package employee.management.system;


/**
 *
 * @author Sanjana Fernando
 */ 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword;
    
    Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Colombo Institute Of Studies EMS");
        heading.setBounds(80, 20, 400, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 23));
        add(heading);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 100, 100, 30);
        add(lblusername);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 100, 150, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 150, 100, 30);
        add(lblpassword);
        
        tfpassword = new JTextField(); 
        tfpassword.setBounds(150, 150, 150, 30);
        add(tfpassword);
        
        JButton login = new JButton("HR LOGIN");
        login.setBounds(150, 210, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginpg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 70, 200, 200);
        add(image);
        
        setSize(600, 350);
        setLocation(450, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home();
   
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}