package org.ezrawilliams.introtojavabasics2;

public class A {
    String E = "extraction";
    String T = "transformation";
    String L = "loading";
    final void ETL(){
        System.out.println(L+T+E);
    };
}
class B extends A{
  /*  void ETL(){

    }*/
}
