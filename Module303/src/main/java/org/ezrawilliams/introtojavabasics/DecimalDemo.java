package org.ezrawilliams.introtojavabasics;

import java.text.DecimalFormat;

public class DecimalDemo {
    public static void main(String[] args) {
        String pattern = "####,####.##";
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);

        System.out.println(number);

        System.out.println(numberFormat.format(number));

    }
}
