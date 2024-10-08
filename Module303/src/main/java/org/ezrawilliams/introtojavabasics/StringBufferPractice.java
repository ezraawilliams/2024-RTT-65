package org.ezrawilliams.introtojavabasics;
/*
Cousin to the String class
Creates objects but they hold a MUTABLE sequence of characters
Because the Strings are mutable, they can grow and shrink unlike
String objects which are IMMUTABLE
 */

public class StringBufferPractice {
    public static void main(String[] args) {
    /*    StringBuffer str = new StringBuffer("Java Full Stack Developer");
        int len = str.length();
        System.out.println("Length : " + len);
        int cap = str.capacity();//Java allocates a capacity by default of 16
        System.out.println("Capacity : " + cap);
// ----- append()--------------------
        str.append("and Software Eng "); // appends a string in the previously defined string.
        System.out.println(str);
        str.append("Java is my favourite language ");
        str.append("but i love python");
        System.out.println(str);
// ----------- reverse()----------------------
        StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
        System.out.println("Original String: " + stringName);
        stringName.reverse();
        System.out.println("Reversed String: " + stringName);*/

            // ------ insert()----------------
            StringBuffer s = new StringBuffer("Java");
            s.insert(4, "language");
            System.out.println(s);
            // --------- replace()---------
            StringBuffer sT = new StringBuffer("Java");
            sT.replace(0, 2, "Hello");
            System.out.println(sT);

            StringBuffer str = new StringBuffer("Welcome to Java Fullstack ");
            System.out.println("Original string: " + str);
            System.out.println("Substring with start index: " + str.substring(5));
            System.out.println("Substring with start and end index: " + str.substring(5, 10));



        }
}
