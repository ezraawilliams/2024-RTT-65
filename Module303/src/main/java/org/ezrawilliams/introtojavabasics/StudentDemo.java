package org.ezrawilliams.introtojavabasics;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();//no-args constructor
        Student s2 = new Student("Justice","A","Davila",25,"123 ABC Lane",
                123456, 100,"Mrs. Justice");
        Student s3;
        s3=new Student("Takeisha","LR","White");
        //Norstar:
        s1.setFirstName("Norstar");
        System.out.println(s1.getFirstName());

    }
}
