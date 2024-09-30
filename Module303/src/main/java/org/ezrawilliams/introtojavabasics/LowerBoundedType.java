package org.ezrawilliams.introtojavabasics;
/*
For LOWER BOUND we are giving a class that is the LOWER CLASS
and the implementions have to be of classes that are PARENT/SUPER
to that lower class
Integer so the implementations have to be of type SUPER to Integer
Integer, Number, Object
 */

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedType {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            list.add(i); //This adds numbers to the list
        }
    }
    //This is a nested class:
    public static class LowerBoundedTypeDriver {
        public static void main(String[] args) {
            List<Number> numberList = new ArrayList<>();
            addNumbers(numberList);
            List<Integer> numberList2 = new ArrayList<Integer>();
            addNumbers(numberList2);
            List<Object> numberList3 = new ArrayList<>();
            addNumbers(numberList3);
            //This will not work because String is not a super class of Integer:
           /* List<String> numberList4 = new ArrayList<>();
            addNumbers(numberList4);*/
           // List<String> strings = new List<>();
            List<String> strings = new ArrayList<>();

        }
    }
}
