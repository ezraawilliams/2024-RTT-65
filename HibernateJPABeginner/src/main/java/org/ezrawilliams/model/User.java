package org.ezrawilliams.model;
/*
In POJO style format - private attributes, no-args, default constructor,
getters and setters
 */

import jakarta.persistence.*; //javax.persistence

@Entity //States that this class will model a table in the database
//@Table (name="USER")//if we need to name the table differently than the class name
public class User {
    @Column(name="USER_ID")//optional but we use if we want the column name to be different
    @Id //This will be the primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)//Auto generated values
    private Integer id; //ORB works easier with object - this will be the primary key
    private String fullName;
    private String email;
    private String password;
    private int age;
    private double salary;
    private String city;

    public User() {
    }

    public User(String fullName, String email, String password, int age, double salary, String city) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.salary = salary;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }






}
