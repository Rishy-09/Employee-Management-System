package employee.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "mysqlpassword");
            s = c.createStatement();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

//5 steps of jdbc connectivity
//1. Register the Driver Class
//2. Creating the connection String
//3. Creating statement
//4. Executing mysql queries
//5. Closing the connections