package org.ezrawilliams;

public class SQLQueries {
    public final static String GetEmployeeByID="SELECT * FROM employees WHERE employeeNumber=? ";
    public final static String GetEmployeeBySalary= "SELECT * FROM employees WHERE salary = ?";
    //Select all employees whose officecode is 1 and 4:
    public final static String GetEmployeesByOfficeCode = "SELECT * FROM employees WHERE " +
            "officeCode IN (?,?)";
    //Select all orderdetails whose orderNumber is 10100 and 10102:
    public final static String GetOrderDetailsPerOrderNumber  = "SELECT * FROM orderdetails " +
            "WHERE orderNumber IN (?,?)";
    /*Update the extension number of employees whose officecode is 2, and the new extension
    number will be "5698"
     */
    public static final String UpdateEmployeeExtensionNumber = "UPDATE employees SET extension = ? " +
            "WHERE officeCode =?";

    //Select all employees whose last name is less than five characters in length:
    public static final String ShowEmpLastNameLessThanFive = "SELECT * FROM employees WHERE" +
            " length(lastName)<?";
}
