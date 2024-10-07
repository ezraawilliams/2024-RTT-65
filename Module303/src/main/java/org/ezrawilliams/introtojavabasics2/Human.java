package org.ezrawilliams.introtojavabasics2;
@FunctionalInterface
public interface Human {
    String say(String message);//a single abstract method
/*
We can have in our functional interface any number of default
methods or static methods because the default methods are not abstract
either are the static methods, and they belong automatically to any
implementing classes.
 */
    default void sleep(){
        System.out.println("This is a Default Method");
    }
    static void communication(){
        System.out.println("This is a Static Method");
    }
}
