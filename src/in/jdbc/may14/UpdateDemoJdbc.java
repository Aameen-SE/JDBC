package in.jdbc.may14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemoJdbc {
    public static void main(String[] args) throws Exception {
        String email1="aameen@gmail.com";
        String city1 = "Kolkata";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");

        PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
        ps.setString(1,city1);
        ps.setString(2,email1);

        int i =ps.executeUpdate();
        if(i>0)
            System.out.println("succes");
        else
            System.out.println("not updated");
    }
}
