package org.ezrawilliams.introtojavabasics;
/*
Body Mass Index (BMI) is a measure of health on weight.
It is calculated by taking an individual’s weight in kilograms and
dividing by the square of their height in meters.
BMI = (Weight in Kg) / (Height in Meters * Height in Meters)
For example,
weight = 75 kg, height = 1.5 m
BMI = 75 / (1.5*1.5) = 33.33
BMI                 Interpretation

<18.5               Underweight
18.5 <=BMI <25.0    Normal
25.0 <= BMI < 30.0  Overweight
30.0 <= BMI         Obese
 */

import java.util.Scanner;

public class BodyMassIndexExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mass: ");
        double weight = input.nextDouble();

        // User needs to enter height in meters
        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are Normal");
        } else if (bmi >= 25.0 && bmi < 30) {
            System.out.println("You are Enough");
        } else if (bmi >= 30.0) {
            System.out.println("You are a little bit healthy and cute");
        }
        /*
        <18.5               Underweight
        18.5 <=BMI <25.0    Normal
        25.0 <= BMI < 30.0  Enough!
        30.0 <= BMI         Perfect the way you are!
         */

    }


}
