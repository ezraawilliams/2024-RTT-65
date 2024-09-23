package org.ezrawilliams.introtojavabasics;
/*
Super class, parent class, base class
 */

public class LivingThing {
    //field and method of the parent class:
    /*
    protected mean accessible within the class, the package
    and subclasses outside of the package
     */
    protected String name;


    public LivingThing() {}

    public LivingThing(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat");
        //I cannot do child to parent:
       // display();
    }
}
