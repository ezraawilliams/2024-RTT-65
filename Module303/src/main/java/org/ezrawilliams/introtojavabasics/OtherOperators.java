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
       /* int a=3, b=4;
        boolean r;

        /*
        equal to == - if the values of both of the operands are the same then it returns true:

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


        //Logical AND:  a=3, b=4
        System.out.println(a<b && b<a); //TRUE and FALSE so it returns FALSE
        System.out.println(a>b && b>a); //FALSE and TRUE so it returns FALSE
        System.out.println(a<b && b>a); //TRUE and TRUE so it returns TRUE

        //LOGICAL OR:
        System.out.println(a<b || b<a); //TRUE or FALSE  so it returns TRUE
        System.out.println(a>b || b>a); //FALSE or TRUE so it returns TRUE
        System.out.println(a<b || b>a); //TRUE or TRUE so it returns TRUE*/

        //ASSIGNMENT OPERATORS:
        int x=0;
        x = x+5; //x+=5;
        x = x - 5; //x-=5
        //Shortened version - x*=5, x/=5;
        x = x * 5;//x*=5
        x = x / 5; //x/=5
        x = x % 5; //x%=5
        x  = x << 5; //x<<=5
        x = x >> 5; //x>>=5
        x = x & 5; //x&=5
        x = x | 5; //x|=5
        x = x ^ 5; //x^5

        //Unary Operators:
        int a=20, b=10, c=0, d=20, e=40, f=30;

        //Unary minus:
        int result = -a;
        System.out.println(result);

        //increment operator:
        //Post-increment:
        c = b++;
        System.out.println("Value of c (b++) = " + c);
        //Value of c (b++) = 10
        System.out.println("Value of b = " + b);

        // what the initial values were:  int a=20, b=10, c=0, de=20, e=40, f=30;
        //Pre-increment:
        c = ++a; // a = a + 1
        System.out.println("Value of c (++a) = " + a);
        //Value of c (++a) = 21
        System.out.println("Value of a = " + a);

        // what the initial values were:  int a=20, b=10, c=0, d=20, e=40, f=30;
        //Post-decrement:
        c = e--;
        System.out.println("Value of c (e--) = " + c);
        //Value of c (e--) = 40
        System.out.println("Value of e = " + e);

        //Pre-decrement:
        c = --d;
        System.out.println("Value of c (--d) = " + c);
        //Value of c (--d) = 19
        System.out.println("Value of d = " + d);














    }



}
