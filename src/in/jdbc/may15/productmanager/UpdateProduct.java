package in.jdbc.may15.productmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateProduct {
    public static void main(String[] args) throws Exception {
        String product_id ="135";
        String name ="powder";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","aameen");

        PreparedStatement ps = con.prepareStatement("Update products set product_id=? where name=?");
        ps.setString(1,product_id);
        ps.setString(2,name);

        int i =ps.executeUpdate();
        if(i>0)
            System.out.println("success");
        else
            System.out.println("not updated ");
    }
}
