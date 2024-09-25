package org.ezrawilliams.introtojavabasics;
/*
This is the CHILD/SUB/DERIVED class
Default access is also called Package access
 */

public class Child extends Parent {
    int id;

    @Override
    void parentMethod(){
        System.out.println("This is the Method from the child class");
    }
}
