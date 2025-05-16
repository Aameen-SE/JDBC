package in.jdbc.may15.productmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteProduct {
    public static void main(String[] args) throws Exception{
        String quantity="0";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","aameen");

        PreparedStatement ps = con.prepareStatement("Delete from products where quantity=?");
        ps.setString(1,quantity);


        int i =ps.executeUpdate();
        if(i>0)
            System.out.println("success");
        else
            System.out.println("not updated ");
    }
}
