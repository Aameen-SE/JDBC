package in.jdbc.may24.studentmarksmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","aameen");
        PreparedStatement ps=con.prepareStatement("Update student set marks = ? where roll_no=? ");
        ps.setInt(1,95);
        ps.setString(2,"104");

       int i= ps.executeUpdate();
       if(i>0)
           System.out.println("Success");
       else
           System.out.println("Updation failed");
    }
}
