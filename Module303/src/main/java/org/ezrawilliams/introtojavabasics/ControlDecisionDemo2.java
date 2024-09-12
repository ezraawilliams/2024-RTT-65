package org.ezrawilliams.introtojavabasics;

import java.util.Scanner;

public class ControlDecisionDemo2 {
    public static void main(String[] args) {
        int i=1, j=2, k=4;

        if (i>j){
            if (i>k) {
                System.out.println("A");
            }
            }
        else
                System.out.println("B");

        //Nested decision statements:
        /*
        check age; if they are younger than 18 the price is 5.00
        if they are 18 or older, they the price is 10.00, however, if
        they are 65 and older, they get a discount of 5%
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        double price=0, discount=0.05;

        if (age<18){
            price = 5.00;
        } else {
            price = 10.00;
            if (age >= 65){
                price = price- (price*discount);
            }
        }

    }
}
