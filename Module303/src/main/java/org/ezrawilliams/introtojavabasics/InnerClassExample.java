package org.ezrawilliams.introtojavabasics;

public class InnerClassExample {//Outer class
    int num1 = 100;

     static class InnerClass{ //nested class
        int num2 = 1000;
    }

    class InnerClass2{//Not static - we call it an inner class
         int num3 = 1000;
    }
}
