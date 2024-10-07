package org.ezrawilliams.introtojavabasics2;

public class NormalClass {
    /*
    Define an anonymous inner class implementing the interface
    I will construct an instance and invoke the method
    This is an anonymous constructor:
    When we need to create simple, one method classes quickly that usually
    do just ONE thing we can create a functional interface
    and then create an anonymous inner class using an anonymous constructor
     */
    Human hObjOne = new Human() {
        @Override
        public void say() {
            System.out.println("I am James");
        }
    };

    //Another anonymous constructor:
    Human hObjTwo = new Human() {

        @Override
        public void say() {
            System.out.println("I am Tony!");
        }
    };

    public static void main(String[] args) {
        NormalClass nc = new NormalClass();
        nc.hObjOne.say();
        nc.hObjTwo.say();
        nc.hObjOne.sleep();
        nc.hObjTwo.sleep();

        //How would I call the communication method?
        Human.communication();
    }
}
