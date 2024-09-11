package org.ezrawilliams.introtojavabasics;

import java.util.StringJoiner;

public class StringJoinerExamples {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(", ");
        // passing comma(,) as delimiter
        // ----Adding values to StringJoiner  ----
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("Javascript");
        System.out.println(joinNames);

    }
}
