package in.jdbc.may21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchAndPrint {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","aameen");
        PreparedStatement ps=con.prepareStatement("Select * from employees");
        ResultSet rs =ps.executeQuery();

        while (rs.next()){
            String id =rs.getString("id");
            String name = rs.getString("name");
            String department = rs.getString("department");
            String salary =rs.getString("salary");

            System.out.println(" Id : "+id+"\n Name : "+name+" \n Department : "+department+"\n Salary : "+salary+"\n --------");

        }
    }
}
