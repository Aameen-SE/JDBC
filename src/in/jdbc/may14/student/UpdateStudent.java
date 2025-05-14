package in.jdbc.may14.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {
    public static void main(String[] args) throws Exception {
        String marks1 ="53.6";
        String email1 ="kasif@gmai.com";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");
        PreparedStatement ps = con.prepareStatement("Update students set marks=? where email=?");
        ps.setString(1,marks1);
        ps.setString(2,email1);

        int i=ps.executeUpdate();
        if(i>0)
            System.out.println("updated succesfully");
        else
            System.out.println("updation failed");
    }
}
