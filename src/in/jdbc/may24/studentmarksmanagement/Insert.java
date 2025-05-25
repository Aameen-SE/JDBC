package in.jdbc.may24.studentmarksmanagement;

//Insert multiple student records (use batch insertion).

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","aameen");
        PreparedStatement ps = con.prepareStatement("Insert into student value(?,?,?,?)");
        ps.setString(1,"101");
        ps.setString(2,"Aameen");
        ps.setString(3,"Maths");
        ps.setInt(4,90);
        ps.addBatch();

        ps.setString(1,"102");
        ps.setString(2,"Arsalan");
        ps.setString(3,"Maths");
        ps.setInt(4,80);
        ps.addBatch();

        ps.setString(1,"103");
        ps.setString(2,"Kashif");
        ps.setString(3,"Maths");
        ps.setInt(4,85);
        ps.addBatch();

        ps.setString(1,"104");
        ps.setString(2,"Rahul");
        ps.setString(3,"Maths");
        ps.setInt(4,65);
        ps.addBatch();

        int[] i =ps.executeBatch();
        if(i.length>=0)
            System.out.println("Success");
        else
            System.out.println("Insertion Failed ");
    }
}
