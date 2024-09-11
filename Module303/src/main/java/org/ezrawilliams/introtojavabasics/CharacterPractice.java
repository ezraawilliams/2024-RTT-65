package org.ezrawilliams.introtojavabasics;
/*
The Character class is the helper or Wrapper class for the primitive
char type
 */

public class CharacterPractice {
    public static void main(String[] args) {
        //An object of type Character:
        /*
        static means we can use the CLASS NAME directly to access the
        method, or variable - we do not need the object to access it
         */
        Character letter = Character.valueOf('g');
        Character num = '7';
        System.out.println(letter);
        System.out.println(num);

        //Primitive char data type:
        char letter_ch='g';
        System.out.println(letter_ch);
        char num_ch = '7';
        System.out.println(num_ch);

        Character letterA = 'A';
        System.out.println(letterA);
        Character asciNumber = 97;
        System.out.println(asciNumber);

        Character uninumber = '\u0031';
        Character uninumber2 = '\u0032';
        System.out.println(uninumber);
        System.out.println(uninumber2);
        System.out.println("======compareTo========");
        Character Obj1 = '2';
        Character Obj2 = '2';
        int result =    Obj1.compareTo(Obj2);//this should return 0 - equal
        System.out.println(result);
        System.out.println("----equals() -------");
        boolean  result2 =    Obj1.equals(Obj2);
        System.out.println(result2);
        System.out.println("----isletter() -------");
        // isLetter method determines whether the specified char value is letter
        System.out.println(Obj1.isLetter(Obj2));
        System.out.println("----isDigit() -------");
        // isDigit() determine whether the specified char value is a digit
        System.out.println( Obj2.isDigit(Obj1));
        Obj1.valueOf('A');   // Obj1 = 'A'
        System.out.println("----compareTo-------");
        Character a = 'B';
        Character aa = 'B';
        System.out.println(a == aa); //== we are comparing the OBJECT itself
        //equals method can be manipulated to compare the actual VALUES
        /*
        compareTo does more than the equals method especially for things like
        sorting - it gives the numerical order of the characters
         */
        int rs =  a.compareTo(aa);
        System.out.println(rs);





    }
}
