package in.jdbc.may21;
//Connect to a database named company.
//
//Create a table named employees with the following columns:
//
//id (INT, Primary Key)
//
//name (VARCHAR(50))
//
//department (VARCHAR(50))
//
//salary (DOUBLE)
//
//Insert 3 employee records into the table.
//
//Retrieve and print all employee records from the table.
//
//Update the salary of one employee based on their id.
//
//Delete one employee based on their id.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertCompanyDetails {
    public static void main(String[] args) throws Exception{

        String id ="127";
        String name ="Arsalan";
        String department = "CS" ;
        String salary ="850000";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","aameen");

        PreparedStatement ps= con.prepareStatement("Insert into employees values(?,?,?,?)");
        ps.setString(1,id);
        ps.setString(2,name);
        ps.setString(3,department);
        ps.setString(4,salary);
        int i =ps.executeUpdate();

        if(i>0)
            System.out.println("succes");
        else
            System.out.println("insertion failed");
    }
}
