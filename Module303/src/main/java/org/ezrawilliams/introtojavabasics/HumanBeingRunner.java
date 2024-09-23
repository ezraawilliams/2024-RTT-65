package org.ezrawilliams.introtojavabasics;

public class HumanBeingRunner {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Create an object of type HumanBeing (sub/child/derived class)
        HumanBeing HObj = new HumanBeing("Mr Best");
        //Access field of the super/parent/base class - LivingThing:
       // HObj.name = "Mr Best";
        HObj.display();

        //Call the method of the superclass using object of subclass type:
        HObj.eat();//The method in the parent(LivingThing) or the method in the child
        HObj.communication();

        //Another object:
        HumanBeing HObj2 = new HumanBeing("Mr Worst");
        HObj2.eat();

        //Static variables belong directly to the class:
        HumanBeing.organizationName= "Per Scholas";
        HObj.display();
        HObj2.display();
        HumanBeing.organizationName="Per Scholas 2.0";
        HObj.display();
        HObj2.display();
    }
}
