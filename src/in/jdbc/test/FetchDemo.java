package in.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","aameen");
        PreparedStatement pre = con.prepareStatement("select * from register");
        ResultSet rs =pre.executeQuery();
        while(rs.next()){
            String name1 = rs.getString("name");
            System.out.println(name1);

            String email1 = rs.getString("email");
            System.out.println(email1);

            String pass1 = rs.getString("password");
            System.out.println(pass1);

            String gen1 = rs.getString("gender");
            System.out.println(gen1);

            String city1 = rs.getString("city");
            System.out.println(city1);

            System.out.println("");
        }
        con.close();
    }
}
