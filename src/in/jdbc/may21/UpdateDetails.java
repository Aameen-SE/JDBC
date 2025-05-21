package in.jdbc.may21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDetails {
    public static void main(String[] args)  throws  Exception{
        String depatment = "AI";
        String id ="127";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","aameen");
        PreparedStatement ps = con.prepareStatement("Update employees set department=? where id=?");
        ps.setString(1,depatment);
        ps.setString(2,id);

        int i =ps.executeUpdate();
        if(i>0)
            System.out.println("succesfully updated");
        else
            System.out.println("Updation failed");
    }
}
