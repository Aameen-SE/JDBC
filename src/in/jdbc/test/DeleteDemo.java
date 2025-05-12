package in.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
    public static void main(String[] args) throws Exception {
    String email1="aameen@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","aameen");
        PreparedStatement pre = con.prepareStatement("delete from register where email=?");
        pre.setString(1,email1);
       int count= pre.executeUpdate();

       if(count>0){
           System.out.println("Deleted Succesfully");
       }
       else
           System.out.println("Deletion Failed ");
    }
}
