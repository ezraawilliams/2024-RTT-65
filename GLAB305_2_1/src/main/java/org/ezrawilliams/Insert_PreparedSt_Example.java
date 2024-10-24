package org.ezrawilliams;
import java.sql.*;
public class Insert_PreparedSt_Example {
    public static void main(String[] args) {
        Connection con = null; //creating a connection from Java to the database
        PreparedStatement prepStmt = null;//The object that allows us to prepare our query and executes
        ResultSet rs = null;// This will hold the results after the query is executed
        String dburl = "jdbc:mysql://localhost:3307/classicmodels";
        String user = "root";
        String password = "password";
        try {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            /* ------ Lets insert one record using a prepared statement ------*/
            /*String sqlQuery = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
            prepStmt = con.prepareStatement(sqlQuery);
            prepStmt.setInt(1, 6);
            prepStmt.setString(2, "Jamil");
            prepStmt.setString(3, "fink");
            prepStmt.setString(4, "JJ@gmail.com");
            prepStmt.setString(5, "2759");
            prepStmt.setInt(6, 1143);
            prepStmt.setInt(7, 9);
            prepStmt.setInt(8, 3);
            prepStmt.setString(9, "Manager");
            int affectedRows = prepStmt.executeUpdate();//returns the number of rows affected:
            System.out.println(affectedRows + " row(s) affected !!");


            /* ------ Lets pull data from the database for an inserted record ------*/
            // Query which needs parameters
           /* prepStmt = con.prepareStatement("select * from employees where employeeNumber = ? ");
            prepStmt.setInt(1, 3);
            // execute select query
            rs = prepStmt.executeQuery();
            // Display function to show the Resultset
            while (rs.next()) {
                System.out.println(rs. getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }

            //Using external query:
            prepStmt = con.prepareStatement(SQLQueries.GetEmployeeByID);
            prepStmt.setInt(1, 1002);
            rs = prepStmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs. getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }

            //Test select all employees whose office code is 1 and 4:
            prepStmt = con.prepareStatement(SQLQueries.GetEmployeesByOfficeCode);
            prepStmt.setInt(1, 1);
            prepStmt.setInt(2, 4);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs. getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("officeCode"));
            }
            //Test select all orderdetails whose orderNumber is 10100 and 10102:
            prepStmt = con.prepareStatement(SQLQueries.GetOrderDetailsPerOrderNumber);
            prepStmt.setInt(1, 10100);
            prepStmt.setInt(2, 10102);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs. getString("orderNumber"));
                System.out.println(rs.getString("productCode"));
            }
            prepStmt = con.prepareStatement(SQLQueries.UpdateEmployeeExtensionNumber);
            prepStmt.setString(1,"5698");
            prepStmt.setInt(2,2);
            prepStmt.executeUpdate();//Doing an update*/

            //Check select all employees whose last name is less than five character in length:
            prepStmt = con.prepareStatement(SQLQueries.ShowEmpLastNameLessThanFive);
            prepStmt.setInt(1,5);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs. getString("firstName"));
                System.out.println(rs.getString("lastname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            prepStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

