package in.jdbc.may21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDetails {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","aameen");
        PreparedStatement ps=con.prepareStatement("Delete from employees where id=?");
        ps.setString(1,"id");
        int i = ps.executeUpdate();
        if(i>0)
            System.out.println("succesfully deleted ");
        else
            System.out.println("Deletion failed ");
    }
}
