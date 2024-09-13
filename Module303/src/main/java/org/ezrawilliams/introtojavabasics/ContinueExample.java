package org.ezrawilliams.introtojavabasics;
/*
Control statements - break and continue
 */

public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;//increment number by 1

            if (number == 10 || number == 11)
            {
                continue;//skipAndContinue
            }
            System.out.println(number);
            sum += number;
        }
        System.out.println("The sum is " + sum);

    }
}
