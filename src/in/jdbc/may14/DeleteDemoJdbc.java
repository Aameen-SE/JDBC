package in.jdbc.may14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemoJdbc {
    public static void main(String[] args) throws Exception {
        String email1="deepak@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");
        PreparedStatement ps = con.prepareStatement("Delete from register where email=?");
        ps.setString(1,email1);
        int i = ps.executeUpdate();

        if(i>0)
            System.out.println("deleted successfully");
        else
            System.out.println("deletion failed");

    }
}
