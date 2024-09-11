package org.ezrawilliams.introtojavabasics;

public class StringConversion {
    public static void main(String[] args) {
        String intString = "1";
        int intValue = Integer.parseInt(intString); // parseInt method convert string into primitive data type
        System.out.println(intValue);
        Integer IntWrapper = Integer.valueOf(intString); // valueOf(): convert string into non primitive data type
        System.out.println(IntWrapper);
        String doubleString = "1.0";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);
        Float fwrapper = Float.valueOf(doubleString );
        System.out.println(fwrapper);


    }
}
