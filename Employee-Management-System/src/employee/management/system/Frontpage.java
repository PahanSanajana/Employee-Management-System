package employee.management.system;


/**
 *
 * @author Sanjana Fernando
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Frontpage extends JFrame implements ActionListener {
    
    JButton clickhere , clickhere2;
    
    Frontpage() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("COLOMBO INSTITUTE OF STUDIES HR SYSTEM");
        heading.setBounds(20, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 50));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/frontpg.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        clickhere = new JButton("HR LOGIN");
        clickhere.setBounds(400, 430, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        clickhere2 = new JButton("ADMIN LOGIN");
        clickhere2.setBounds(400, 330, 300, 70);
        clickhere2.setBackground(Color.BLACK);
        clickhere2.setForeground(Color.WHITE);
        clickhere2.addActionListener(this);
        image.add(clickhere2); 
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        
       
    }
    
    public void actionPerformed(ActionEvent as) {
             if (as.getSource() == clickhere) {
            setVisible(false);
            new Login();
        }  else {
            setVisible(false);
            new Adlogin();
        }
    }
    
    public static void main(String args[]) {
        Frontpage splash = new Frontpage();
    }
}

