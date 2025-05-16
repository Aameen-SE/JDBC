package in.jdbc.may15.productmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchProduct {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","aameen");

        PreparedStatement ps = con.prepareStatement("select * from products");
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            String product_id1=rs.getString("product_id");
            String name1=rs.getString("name");
            String price1 = rs.getString("price");
            String quantity1=rs.getString("quantity");
            System.out.println("Product_Id : "+product_id1+" \n name : "+name1+" \n price : "+price1+" \n quantity : "+quantity1+"\n ------------");
        }
    }
}
