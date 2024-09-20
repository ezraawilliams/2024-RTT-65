package org.ezrawilliams.introtojavabasics;/*
/*
Polymorphism - main forms - many things in many ways
Method overloading - main implementations of polymorphism
Overloading - only the signature(method name and parameters) matters
Access modifier, static or non-static, return type DO NOT matter in overloading
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        System.out.println("Enter an integer: ");
        int num2 = in.nextInt();
       //call (invocation) our add method:
        add(num, num2);//num, num2 these are arguments
        int summation = add2(num, num2);//call (invocation)
        System.out.println(summation);
        Student ezraStudent = returnStudent();
            }
    /*
    public (access modifier) - private, protected, (DEFAULT) -kind of optional
    static - the method belongs directly to the class/ optional
    void - the method does not return a value - primitive type, reference type
    method name - convention is to use lower camel case
    in parentheses-The parameters of the method - zero or more parameters
    functions are methods that return a value
    {} - body of the method - method block
     */
    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of the numbers is "+sum);
    }

    public static int add2(int num1, int num2) {
        int sum = num1 + num2;
       return sum; //not optional in a function - method that returns a value
    }

    public static int add(int num1, int num2, int num3) {
        int sum = num1 + num2;
        System.out.
    println("The sum of the numbers is "+sum);
        return sum;
    }

    public static Student returnStudent(){
      //  return new Student();
        Student newStudent = new Student();
        return newStudent;
    }

}
