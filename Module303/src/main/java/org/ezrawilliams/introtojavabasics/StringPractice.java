package org.ezrawilliams.introtojavabasics;
/*
Sequence of characters - String variable
String is immutable - means that the state of the string object cannot change after it
is created. We can change the reference to it (WHAT IT HOLDS OR REPRESENTS) but we cannot
change the OBJECT itself (that weird thing with a weird character value in memory)
 */

public class StringPractice {
    public static void main(String[] args) {
        /*
        Creates a new string object (heap)
        Creates a literal "Welcome" in the STRING CONSTANT POOL
         */
        String s = new String("Welcome");

        /*
        String literal
        Since the string already exists in the constant pool, the JVM does not create
        a new string in the constant pool
         */
        String s1 = "Welcome";
        String s2 = " Welcome ";
        String s3 = "welcome";

        //length:
        int length = s2.length(); //9 is the number of characters
        System.out.println(length);
        int length1 = s1.length(); // 7 characters
        System.out.println(length1);

        //isEmpty method - it returns true if the length of the string is zero
        String s4 ="";//length 0 //null string
        int length2 = s4.length();
        System.out.println(length2);
        String s5=" ";
        int length3 = s5.length(); //1
        System.out.println(length3);
        boolean emptyOrNot = s4.isEmpty(); //true
        System.out.println(emptyOrNot);
        boolean emptyOrNot2 = s5.isEmpty();//false
        System.out.println(emptyOrNot2);

        //isBlank - contains only white spaces:
        boolean blankOrNot = s3.isBlank(); //false
        System.out.println(blankOrNot);
        boolean blankOrNot2 = s4.isBlank(); //true
        System.out.println(blankOrNot2);

        //String comparison:
        //Equals method:
        boolean equalOrNot = s3.equals(s4);//should return false
        System.out.println(equalOrNot);
        //equalsIgnoreCase - if they refer to the same SPELLED word
        boolean equalsCase = s1.equalsIgnoreCase(s3);//should return true
        //Ezra EZRA ezra eZrA EZra
        System.out.println(equalsCase);

        //compareTo:// 0 if the strings are the same, negative if the first one is smaller lexi
        //positive value if the first one is bigger lexicographically:
        int sameOrNot = "Ezra".compareTo("Justice");

        //valueOf: digs deep into the variable and extracts the value:


    }
}
