package in.jdbc.may14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemoJdbc {
    public static void main(String[] args) throws Exception{

        String name1 ="arsalan";
        String email1 ="arsalan@gmail.com";
        String pass1 = "arsalan@123";
        String gend1 = "Male";
        String city1 = "Jammu";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");

       // PreparedStatement ps = con.prepareStatement("Insert into register value('deepak','deepak@gmail.com','deepak@123','male','Kolkata')");
       // PreparedStatement ps = con.prepareStatement("Insert into register value('"+name1+"','"+email1+"','"+pass1+"','"+gend1+"','"+city1+"')");
        PreparedStatement ps = con.prepareStatement("Insert into register value(?,?,?,?,?)");
        ps.setString(1,name1);
        ps.setString(2,email1);
        ps.setString(3,pass1);
        ps.setString(4,gend1);
        ps.setString(5,city1);

        int i =ps.executeUpdate();

        if(i>0){
            System.out.println("success");
        }
        else
            System.out.println("Not successful");
    }

}
