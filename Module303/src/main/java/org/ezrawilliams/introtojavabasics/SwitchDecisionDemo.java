package org.ezrawilliams.introtojavabasics;
/*
The switch statement is also called the case statement:

 */

import java.util.Scanner;

public class SwitchDecisionDemo {
    public static void main(String[] args) {
        /*
        Give the user instructions depending on the day of the week:
        Timetable format:
         */
        String dayOfTheWeek, instruction;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        dayOfTheWeek = in.nextLine();

        switch(dayOfTheWeek){
            case "Sunday"://if (dayOfTheWeek == "Sunday"...
                instruction = "Make all the beds";
                break;//if it is Sunday change instruction to make bads
            //and LEAVE THE SWITCH statement
            case "Monday":
                instruction = "Do your school work";
                break;
                case "Tuesday":
                    instruction = "Wash he dishes";
                    break;
            default:
                instruction = "Something went wrong";
                break;
        }
        /*
        Switch statements have limitations, you cannot do complex
        comparisons using a switch statement but you can with an if
         */
    }
}
