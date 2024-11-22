/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

/**
 *
 * @author Sanjana Fernando
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdHome extends JFrame implements ActionListener{
    
    JButton add;
    
    AdHome(){
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/homebg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Colombo institute of Studies");
        heading.setBounds(190,40,1120, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 50));
        heading.setForeground(Color.WHITE);
        image.add(heading);
        
        JLabel heading2 = new JLabel("Employee Management System");
        heading2.setBounds(170,90,1120, 60);
        heading2.setFont(new Font("Raleway", Font.BOLD, 50));
        heading2.setForeground(Color.WHITE);
        image.add(heading2);
        
        JLabel heading3 = new JLabel("Admin");
        heading3.setBounds(800,200,1120, 60);
        heading3.setFont(new Font("Raleway", Font.BOLD, 30));
        heading3.setForeground(Color.WHITE);
        image.add(heading3);
        
        add = new JButton("Add Employee");
        add.setBounds(780,280, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        setSize(1120, 630);
        setLocation(150, 100);
        setVisible(true);
        
    }
    
      public void actionPerformed(ActionEvent ae) {
         setVisible(false);
        new AddEmployee();
         
     }
    
    
     public static void main(String[] args) {
        new AdHome();
    }
}
