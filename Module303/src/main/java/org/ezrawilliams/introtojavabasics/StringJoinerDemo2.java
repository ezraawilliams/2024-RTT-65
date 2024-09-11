package org.ezrawilliams.introtojavabasics;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   /* passing comma(,) and square-brackets as delimiter */
        // ----- Adding values to StringJoiner---
        joinNames.add("New York");
        joinNames.add("New Jersey");
        System.out.println(joinNames.toString());

//----  Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
        /* passing colon(:) and square-brackets as delimiter  */

        // ---Adding values to StringJoiner-----
        joinNames2.add("Dallas");
        joinNames2.add("Chicago");
        System.out.println(joinNames2.toString());
        // ---- Merging two StringJoiner  ----
        StringJoiner mergedJoiners = joinNames.merge(joinNames2);
        System.out.println(mergedJoiners.toString());

    }
}
