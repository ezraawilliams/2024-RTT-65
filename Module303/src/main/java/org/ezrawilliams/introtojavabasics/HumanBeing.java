package org.ezrawilliams.introtojavabasics;
/*
In Java the extends keyword is used for inheritance
Sub class, child class, derived class
 */

public class HumanBeing  extends LivingThing{

    static String organizationName;

    public HumanBeing(String name){
        super(name);//call the parent constructor and do what it does
    }

    public void display(){
        System.out.println("My name is "+super.name);//access parent class attribute
        super.eat();//Parent to child //access method in parent class
        System.out.println("My name of our organization is "+organizationName);
    }


    //override the eat() method
    /*
    Overriding is also another branch of Polymorphism. And essentially it is
    different from overloading because with overriding the METHOD HEADER, including
    THE METHOD SIGNATURE has to be the EXACT replica of the METHOD HEADER in the parent
    class
     */
    @Override//This is optional but very IMPORTANT
    public void eat(){
        System.out.println("I enjoy eating Pizza with soft drink");
    }

    // Declaring new method in subclass
    public void communication() {
        System.out.println("I can communicate by language");
    }



}
