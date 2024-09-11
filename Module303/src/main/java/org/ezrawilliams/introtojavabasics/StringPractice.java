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
        int intValue = 100;
        /*
        I have an integer, I want to convert it to a String so that I can use it
        as a String. In order to do that I create a String and I call the valueOf method
        to take the integer and convert it to a String.
         */
        String stringOfIntValue = String.valueOf(intValue);

        String myString = "Ezra Williams";
        System.out.println(myString);
        boolean checkForE = myString.startsWith("E");//True
        checkForE = myString.startsWith("e");//False
        boolean checkForS = myString.endsWith("s"); //True

        //indices - 0, 1, 2 - indices are zero-based:
        //indexOf returns the position of the first OCCURRENCE of that character
        int positionOfW = myString.indexOf("W"); //5
        System.out.println(positionOfW);
        int positionOfLastW = myString.lastIndexOf("W");
        System.out.println(positionOfLastW);

        //Sometimes we want to make sure a string contains something:
        boolean containsX = myString.contains("x");
        System.out.println(containsX);

        //Extract a character:
        char characterZ = myString.charAt(1);
        System.out.println(characterZ);

        //Extract a substring: "Ezra Williams"
        String firstName = myString.substring(0,4);//always one more than ending index
        System.out.println(firstName);

        //Conversion methods:
        String ezraLowerCase = myString.toLowerCase();
        System.out.println(ezraLowerCase);

        String ezraUpperCase = myString.toUpperCase();
        System.out.println(ezraUpperCase);

        //Concat - it takes one string and JOINS it to another string:
        String programmer = " Programmer";
        myString = myString.concat(programmer);
        System.out.println(myString);

        //Trim - creates a new String removing white spaces from front and back
        String trimmedS2 = s2.trim();
        System.out.println(trimmedS2);

        //Strip - strips the leading and trailing white spaces:
        String trimmedS22 = s2.strip();
        System.out.println(trimmedS22);

        //Processing methods:
        String perScholas = "Per Scholas";
        String newPerScholas = perScholas.replace('P','M');
        System.out.println(newPerScholas);

        String newPerScholas2 = perScholas.replaceAll("Per","My");
        System.out.println(newPerScholas2);

        //Check to see if some part of the string matches something:
        boolean doesItMatch = perScholas.matches(newPerScholas);
        System.out.println(doesItMatch);

        //Replace All ex:
        String str1 = "aabbaaac";
        String str2 = "Learn223Java55from555perscholas";
        // regex for sequence of digits
        String regex = "\\d+";

        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str1.replaceAll("aa", "zz"));

        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " "));





    }
}
