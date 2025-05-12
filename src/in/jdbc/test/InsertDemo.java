package in.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args) throws Exception {
            String name1 ="Arsalan";
            String email1="arsalan@gmail.com";
            String pass1="arsalan@123";
            String gen1 ="Male";
            String city1="Jammu";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","aameen");

       // PreparedStatement pre = con.prepareStatement("Insert into register value('deepak','deepak@gmail.com','deepak@123','Male','Kerala') ");
        PreparedStatement pre = con.prepareStatement("Insert into register value(?,?,?,?,?)");
        pre.setString(1,name1);
        pre.setString(2,email1);
        pre.setString(3,pass1);
        pre.setString(4,gen1);
        pre.setString(5,city1);

        int i =pre.executeUpdate();

        if(i>0)
            System.out.println("Successfully added");
        else
            System.out.println("Failed");
    }

}
