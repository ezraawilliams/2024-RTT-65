package main.java.org.ezrawilliams;

import java.sql.*;

public class JDBCDriverDemo {
    public static void main(String[] args) {
        Connection conn = null; //creating a connection from Java to the database
        Statement stmt = null;//The object that allows us to prepare our query and executes
        ResultSet result = null;// This will hold the results after the query is executed
        String dburl = "jdbc:mysql://localhost:3307/classicmodels";
        String user = "root";
        String password = "password";
        try {
            conn = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            String SelectSQL = "Select * FROM employees";
            stmt = conn.createStatement();//converts the string to a sql statement
            result = stmt.executeQuery(SelectSQL);//executes it
            while (result.next()) {
                String name = result.getString("firstName");
                String email = result.getString("email");
                System.out.println(name + " | " + email);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
