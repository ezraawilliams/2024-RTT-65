package org.ezrawilliams.introtojavabasics;

import java.util.*;

public class ArrayManipulationPractice {
    public static void main(String[] args) {
        /* Let us create different types of arrays and print their contents using
        Arrays.toString() */
        /*
        Remember the toString method is used to portray a STRING representation of the
        object (all objects inherit toString from the Object class), not to
        print the elements (arrays contain elements but not all objects do).
         */
        boolean[] boolArr = new boolean[] { true, true, false, true };
        byte[] byteArr = new byte[] { 10, 20, 30 };
        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr = new double[] { 1, 2, 3, 4 };
        float[] floatArr = new float[] { 1, 2, 3, 4 };
        int[] intArr = new int[] { 1, 2, 3, 4 };
        long[] longArr = new long[] { 1, 2, 3, 4 };
        short[] shortArr = new short[] { 1, 2, 3, 4 };
       // System.out.println(boolArr);//printing the array
       System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(longArr));
        System.out.println(Arrays.toString(shortArr));

        //Arrays.fill() - method:
        double[] dValues = new double[100];
        Arrays.fill(dValues, 50.0);	 // set all values to 50.0

        long[] lValues = new long[500];
        Arrays.fill(lValues, 2057);	// set all values to 2057

       // int[] dValues = new int[10];
        Arrays.fill(dValues, 6);   // set all values to 6
        for(double i : dValues) {  // print using loop
            System.out.println(i);
        }

       // long[] lValues2 = new long[10];
        Arrays.fill(lValues, 2057);    // set all values to 2057
        System.out.println(Arrays.toString(lValues));  // print using toString()

        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        // Fill from index 1 to index 4.
        // the twoIndex in all such functions is usually EXCLUSIVE
        // EXCLUSIVE - we mean it is not included
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar)); // print using toString()

        //Arrays.sort() method:
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));


    }
}
