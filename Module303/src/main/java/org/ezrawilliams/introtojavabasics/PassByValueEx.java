package org.ezrawilliams.introtojavabasics;
/*
In programming reference is a value that represents the location of
a piece of data in memory. Usually that reference is not DIRECTLY
accessed.
 */

public class PassByValueEx {
    public static void main(String[] args) {
        int number1 = 100, number2 = 200, addition;
        //call my add method:
        addition = add(number1, number2);
        System.out.println("The sum of these two number is "+addition);
        System.out.println("After the add function is called, the value " +
                "of number1 is "+number1);//they will maintain the original values
        System.out.println("After the add function is called the value of " +
                "number2 is "+number2);

    }

    public static int add(int num1, int num2){
        num1 = num1 + num2;//change value
        return num1;
    }
}
