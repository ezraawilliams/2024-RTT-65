package org.ezrawilliams.introtojavabasics;

public class CastingPractice {
    /*
    Casting is when we assign a value of one type to another type
     */
    public static void main(String[] args) {
        /*
        Explicit casting - assign a value of a larger data type within a
        smaller range
        double - float - long - int - short - byte
        (target-type) value
         */
        int x;
        double y = 9.99;
        //we can cast y as an int:
        x = (int)y; //Take the double and CAST it as an integer
        System.out.println(x);

        byte i = 40;
        // No casting needed for below conversion
        short j = i; //automatic promotion //implicit type casting
        int k = j; //automatic promotion
        long l = k;//an int is a long
        float m = l;// a long is a float
        double n = m;// a long is a double
        System.out.println("byte value : "+i);
        System.out.println("short value : "+j);
        System.out.println("int value : "+k);
        System.out.println("long value : "+l);
        System.out.println("float value : "+m);
        System.out.println("double value : "+n);
        float f = 1.5e3f;
        k = (int)f; // Explicit casting - totally legal we are trying to cast
        //a float as an int
        //k = f ;// Not Allowed - narrowing

        byte a = 40, b = 50, c = 100;
        int d = a * b / c;
    }
}
