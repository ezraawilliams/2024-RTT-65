package org.ezrawilliams.introtojavabasics;

public class IterationStatementsLoopsPractice {
    public static void main(String[] args) {
        //Printing numbers from 1-100:
        /*
        initialization - where do we start? i=1
        continuation condition - dictates how many times (iterations)
        increment - how many skips we want - i+1 - we skip by one
         */
        for(int i=1; i<=100; i++){
            System.out.println(i);
        } //end of for loop on line 11
        //We are printing Welcome to Full Stack Java 100 times:
        for (int j=0; j<100; j++){
            System.out.println("Welcome to Full Stack Java!");
        } // end of for loop on line 15


        int weeks = 3;
        int days = 7;

        // outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) {//iterates 3 times
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {// every time THIS inner for loop iterates
                System.out.println("  Day: " + j);
            } //inner for loop ends here - the one that starts on line 28
        }//outer for loop ends here - the one that starts on line 24


    }//end of main method
}//end of IterationStatementsLoopsPractice class
