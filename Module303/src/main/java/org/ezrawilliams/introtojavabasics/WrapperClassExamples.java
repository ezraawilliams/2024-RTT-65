package org.ezrawilliams.introtojavabasics;
/*
Every primitive has a Wrapper class associated with it
boolean Boolean
char Character
byte Byte
short Short
int Integer
long Long
float Float
double Double
 */

public class WrapperClassExamples {
    public static void main(String[] args) {
        byte b = 100;//primitive version
        Byte bb = 100;//An object of TYPE Byte
        short s = 100;//primitive version
        Short ss = 100;//object of type Sort
        int i = 100;  // primitive data type
        Integer ii = 100;  // literal method
        Integer iii;//1000
                //new Integer(1000);  // new operator
        long l = 100l;
        Long ll = 100l;
        float f = 100.0f;
        Float ff = 21.24f;
        double d = 546.32;
        Double dd = 545.255;
        char ch = 'a';
        Character cha = 'a';
        boolean bo = true;
        Boolean boo = true;

        //Autoboxing:
        int a = 20; //A variable using an inbuilt primitive type
        Integer convertIntoInteger = a; //Integer object

        char c = 'A';
        Character convertIntoCharacter = c;

        double ddd = 562.23;
        Double convertIntToDouble = ddd;

        // ---- UnBoxing Example------
        Integer i2 = 56;
        int ii2 = i2;

        Character c2 = 'a';
        char ch2 = c2;

        Double d2 = 2563.32;
        double dd2 = d2;



    }
}
