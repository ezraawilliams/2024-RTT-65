package org.ezrawilliams.introtojavabasics2;

import java.util.ArrayList;
import java.util.Collections;
/*
The Collections class is not to be mistaken for the Collection interface
 */

public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);
        System.out.println("Before : " + numbers);
        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers);
        System.out.println("After : " + numbers);
    }

}
