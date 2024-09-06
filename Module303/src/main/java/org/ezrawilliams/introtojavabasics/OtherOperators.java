package org.ezrawilliams.introtojavabasics;
/*
Now we will go over the other operators:
Relational Operators
Conditional Operators
Assignment Operators
Unary Operators
 */

public class OtherOperators {
    /*
    Relational Operators - compare two values and return a boolean value:
    equal to (==), not equal to (!=), greater than(>), less than(<), >=, <=, instanceof
     */
    public static void main(String[] args) {
        int a=3, b=4;
        boolean r;

        /*
        equal to == - if the values of both of the operands are the same then it returns true:
         */
        r = (a == b); //one = is for assignment, two = is for comparison of equality
        System.out.println(r); //false
        r = (a != b);
        System.out.println(r); //true
        r = (a > b);
        System.out.println(r); //false
        r = (a < b);
        System.out.println(r); //true
        r = (a>=b);
        System.out.println(r); //false
        r = (a<=b);
        System.out.println(r); //true

        /*
         Conditional Operators: used to combine conditional statements and return a boolean value
         They are SHORT CIRCUIT - I WILL EXPLAIN
         */

        //Logical AND:  a=3, b=4
        System.out.println(a<b && b<a); //TRUE and FALSE so it returns FALSE
        System.out.println(a>b && b>a); //FALSE and TRUE so it returns FALSE
        System.out.println(a<b && b>a); //TRUE and TRUE so it returns TRUE

        //LOGICAL OR:
        System.out.println(a<b || b<a); //TRUE or FALSE  so it returns TRUE
        System.out.println(a>b || b>a); //FALSE or TRUE so it returns TRUE
        System.out.println(a<b || b>a); //TRUE or TRUE so it returns TRUE




    }



}
