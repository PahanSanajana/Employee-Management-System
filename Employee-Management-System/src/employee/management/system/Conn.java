package employee.management.system;

/**
 *
 * @author Sanjana Fernando
 */

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///colombost", "root", "Pahan@123San");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
