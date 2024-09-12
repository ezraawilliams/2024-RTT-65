package org.ezrawilliams.introtojavabasics;
/*
Write a program that lets the user enter decimal dollars and cents,
and outputs the monetary equivalent in single dollars, quarters, dimes, nickels, and
pennies.

For example:
Input:  		3.87
Output:	3 dollars
		3 quarters
		1 dime
		0 nickels
		2 pennies


 */

import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 0;
        int cents=0;
        int dollars = 0;
        double quarters = 0;
        double dimes = 0;
        double nickels = 0;
        double pennies = 0;
        System.out.print("Input: ");

        money = scanner.nextDouble();

        dollars = (int)money;
        cents = (int) ((money-dollars)*100);
        quarters = cents/25;
        //remember that we now need what is LEFT OVER after we get the quarters:
        cents = cents%25; //12
        dimes = cents/10;
        cents = cents%10;
        nickels = cents/5;
        pennies = cents;

        System.out.printf("Output: %d dollars %n %.0f quarters %n" +
                        "%.0f dimes %n%.0f nickels %n%.0f pennies", dollars, quarters,
                dimes, nickels, pennies);


    }
}
