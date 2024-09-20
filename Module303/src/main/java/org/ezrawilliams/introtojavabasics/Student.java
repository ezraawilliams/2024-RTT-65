package org.ezrawilliams.introtojavabasics;
/*
A class is a blueprint for creating objects - Student - student objects
data fields - attributes - variables that will hold information about that student
methods - interactions that we have with the student object - things we can do to the object
Reusability = templates and we can use these templates to create objects
Composition = we have all the information we THINK we will need for a student object
 */

public class Student {
    //Data fields/ attributes/ features class variables that will HOLD information about a student:
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String address;
    private long socialSecurityNumber;
    private double grade;
    private String contactPerson;
    public static String schoolName; //Does not depend on the object

    /*
    Constructor - Scanner input = new Scanner(System.in)
    Same name as the class, a special method used to create Student objects
    We can have different flavors of it (what do we mean by FLAVORS)
    Does not have a return type
    It is usually public because we need to access it to create the objects
     */
    public Student(){//no argument, default constructor
        firstName="";
        middleName="";
        lastName="";
        age=0;
        address="";
        socialSecurityNumber=0;
        grade=0;
        contactPerson="";
        String default2 = "These are just default values";
    }

    public Student(String firstName, String middleName, String lastName, int age,
                   String address, long socialSecurityNumber, double grade,
                   String contactPerson){ //All argument constructor
        this.firstName = firstName;/*take the values entered and make them the values
        of the class variables
        this - when we are creating that object THIS is the only object we care ABOUT
        */
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grade = grade;
        this.contactPerson = contactPerson;
    }

    public Student(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        age=0;
        address="";
        socialSecurityNumber=0;
        grade=0;
        contactPerson="";
    }

    /*
    Create a method that prints the Student's full name
     */
    public void printStudentFullName(){
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
    /*
    This one returns a value:
     */
    public String returnStudentName(){
        String fullName=firstName+" "+middleName+" "+lastName;
        return fullName;
    }

    //Mutator methods /setters - use them to SET the values:
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //Accessor methods/getters - use them to GET the values of those attributes:
    public String getFirstName(){
        return firstName;
    }
}
