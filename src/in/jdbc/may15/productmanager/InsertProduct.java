package in.jdbc.may15.productmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertProduct {
    public static void main(String[] args) throws Exception{
        String product_id ="125" ;
        String name ="powder";
        String price ="255";
        String quantity ="0";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","aameen");

        PreparedStatement ps = con.prepareStatement("Insert into products values(?,?,?,?)");
        ps.setString(1,product_id);
        ps.setString(2,name);
        ps.setString(3,price);
        ps.setString(4,quantity);

        int i =ps.executeUpdate();
        if(i>0){
            System.out.println("Success ");
        }
        else
            System.out.println("Not Added ");

    }
}
