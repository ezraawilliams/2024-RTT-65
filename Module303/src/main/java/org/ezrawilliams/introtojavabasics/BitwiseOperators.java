package org.ezrawilliams.introtojavabasics;

public class BitwiseOperators {
    public static void main(String[] args)
    {  // Initial values
        int a = 5; //0000 0101
        int b = 7; // 0000 0111

        // bitwise and   // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or    // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
        // bitwise xor  0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not     // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with assignment operator to provide shorthand assignment
        // a=a&b
        a &= b; // shorthand
        System.out.println("a= " + a);

        //ternary operator - shorthand operator - if-else
        int age = 118;
        String result;

        /*if (age < 100){
            result = "Less than 100";
        } else { //if age > 100
            result = "Greater than 100";
        }*/
        //condition ? expression if true : expression if false
        result = age<100 ? "Less than 100" : "Greater than 100";
        System.out.println(result);


    }



}
