package in.jdbc.may14.student;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchStudentsDetail {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");

        PreparedStatement pr=con.prepareStatement("select * from students");
        ResultSet rs =pr.executeQuery();

        while (rs.next()){

            System.out.println("Id : "+rs.getString("id"));
            System.out.println("Name : "+rs.getString("name"));
            System.out.println("Email : "+rs.getString("email"));
            System.out.println("Marks : "+rs.getString("marks"));
            System.out.println("------------------------------");

        }

    }
}
