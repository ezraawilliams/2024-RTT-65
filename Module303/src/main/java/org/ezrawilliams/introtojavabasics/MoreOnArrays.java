package org.ezrawilliams.introtojavabasics;
/*
An array contains variables - the array is immutable - the number of elements
cannot be changed. However the values in the array can be changed.
 */

public class MoreOnArrays {
    public static void main(String[] args) {
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
            //sixth iteration:
            //list[5] = 1 + (1/3)
        }
        //to print the array:
        for (int element: list){
            System.out.println(element);
        }



    }
}
