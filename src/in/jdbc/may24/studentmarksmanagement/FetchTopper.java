package in.jdbc.may24.studentmarksmanagement;
//Fetch and display the details of the student who scored the highest marks in a specific subject.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchTopper {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","aameen");
        PreparedStatement ps = con.prepareStatement("Select * from student where subject=? order by marks desc limit 1");
        ps.setString(1,"Maths");
        ResultSet rs = ps.executeQuery();

        if(rs.next()){

            System.out.println("Roll No : "+rs.getString("roll_no")+"\n Name : "+rs.getString("name")+"\n Subject : "+rs.getString("subject")+"\n Marks :  "+rs.getInt("marks") );
        }
    }
}
