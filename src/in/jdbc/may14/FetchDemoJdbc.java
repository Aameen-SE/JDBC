package in.jdbc.may14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDemoJdbc {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_may14","root","aameen");
        PreparedStatement ps = con.prepareStatement("select * from register");
        ResultSet rs =ps.executeQuery();

        while(rs.next()){
            String name1 =rs.getString("name");
            String email1 =rs.getString("email");
            String pass1 =rs.getString("password");
            String gen1 =rs.getString("gender");
            String city1 =rs.getString("city");

            System.out.println("Name : "+name1+" , Email : "+email1+" , Password : "+pass1+" , Gender : "+gen1+" , City : "+city1);
            System.out.println("--------------------");
        }

           }
}
