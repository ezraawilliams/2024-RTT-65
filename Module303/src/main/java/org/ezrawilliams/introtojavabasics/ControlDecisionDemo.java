package org.ezrawilliams.introtojavabasics;
/*
Control Flow Statements: if, if..else, if..else if..else, Switch
 */

import java.util.Scanner;

public class ControlDecisionDemo {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 100;
        num2 = 100;

        if (num1 == num2) {// two equal signs for comparison, one equal sign for assignment
            System.out.println(num1+ " is equal to "+num2); //IF TRUE
        } else {
            System.out.println(num1+ " is not equal to "+num2);
        }

        //Multiway if statement:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = sc.nextInt();

        if (num1%2 == 0){ //checking if there is no remainder when divided by two
            System.out.println(num1+ " is even");
        } else {
            System.out.println(num1+ " is odd");
        }

        if (num1 < 0){
            System.out.println(num1+ " is less than 0");
        } else if (num1>0){
            System.out.println(num1+ " is greater than 0");
        } else {
            System.out.println(num1+ " is equal to 0");
        }

    }
}
