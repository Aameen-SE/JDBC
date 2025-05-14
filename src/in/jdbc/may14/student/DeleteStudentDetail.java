package in.jdbc.may14.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudentDetail {
    public static void main(String[] args) throws Exception {

        String email1="kasif@gmai.com";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");
        PreparedStatement ps = con.prepareStatement("Delete from students where email=?");
        ps.setString(1,email1);
        int i=ps.executeUpdate();
        if(i>0)
            System.out.println("Deleted succesfully");
        else
            System.out.println("deletion failed");
    }
}
