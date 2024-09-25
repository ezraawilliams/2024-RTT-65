package org.ezrawilliams.introtojavabasics;
/*
An abstract class MAY have both regular and abstract methods.
 */

public abstract class AbstractStudent {
    static final protected String COLLEGENAME = "Per scholas";
    protected String username;
    protected String password;
    protected int rollNumber;

    // abstract method
    public abstract  void displayInformation();
    public abstract String[] getFullName(String[] fullname);

    // regular methods
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


}
