package org.ezrawilliams.introtojavabasics;
/*
Constructor - Parent() - Creates a new PARENT OBJECT
Child() - Creates a new CHILD OBJECT
Although we did not explicitly create a constructor, it was created in the
background - a default, no argument constructor.
 */

public class UpcastingDowncastingDriver {
    public static void main(String[] args) {
        /*
        Upcasting:
        Remember, Child() creates a new CHILD OBJECT
        Create a new child and upgrade it to a parent object
         */
        Parent parent = new Child();//A child IS A parent
        parent.name="Java 101";

        //Printing the values from the members (attributes and the methods)
        System.out.println(parent.name);
        parent.parentMethod();//Child method because of overriding

        //Downcasting - implicitly:
       // Child child = new Parent();//A child is a Parent, but a Parent is not a child

        //Downcasting Explicity:
        Child child = (Child) parent;
        child.id=100;
        System.out.println(child.name); //What will be printed here?//Java 101
        System.out.println(child.id);
        child.parentMethod();//What method will be called - parent or child?

    }
}
