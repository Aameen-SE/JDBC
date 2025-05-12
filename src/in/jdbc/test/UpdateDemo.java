package in.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
    public static void main(String[] args) throws Exception {

        String city1 ="Mumbai";
        String email1="rahul@gmail.com";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","aameen");
        PreparedStatement pre = con.prepareStatement("update register set city=? where email=?");
        pre.setString(1,city1);
        pre.setString(2,email1);

        int i =pre.executeUpdate();
        if(i>0){
            System.out.println("Updated Succesfully");

        }else
            System.out.println("Updation Failed");
    }
}
