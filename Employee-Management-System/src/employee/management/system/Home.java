package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/homepg.jpg"));
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
        
        add = new JButton("Add Employee");
        add.setBounds(350,400, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(530,400, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(350,470, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Delete Employee");
        remove.setBounds(530,470, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120, 630);
        setLocation(150, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
