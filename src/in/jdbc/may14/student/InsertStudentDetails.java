package in.jdbc.may14.student;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudentDetails {

    public static void main(String[] args) throws Exception{

       String id ="456";
        String name ="Kasif";
        String email ="kasif@gmai.com";
        String marks ="79.7";

        //Create a Java program using JDBC that
        // connects to a MySQL database and performs the following operations on a table named students:

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");
        PreparedStatement ps = con.prepareStatement("Insert into students value(?,?,?,?)");
        ps.setString(1,id);
        ps.setString(2,name);
        ps.setString(3,email);
        ps.setString(4,marks);

        int i =ps.executeUpdate();
        if(i>0)
            System.out.println("success");
        else
            System.out.println("insertion failed");



    }
}
