package org.ezrawilliams.introtojavabasics2;

import org.ezrawilliams.introtojavabasics.Student;

public class GenericIntImplDriver {
    public static void main(String[] args) {
        ElephantItem<Integer> ObjMove = new ElephantItem<>();
        ObjMove.move(5, "NYC");
        System.out.println( ObjMove.getItemBeingMoved()   + " Item");
        System.out.println(ObjMove.getLocationBeingMovedTo()  +" Location");

        ElephantItem<Student> studentElephantItem = new ElephantItem<>();
        //Student:
        Student student = new Student("Justice","A","Davila",25,"123 ABC Lane",
                123456, 100,"Mrs. Justice");
        studentElephantItem.move(student, "ATL");
        System.out.println(studentElephantItem.getItemBeingMoved() + " Item");
        System.out.println(studentElephantItem.getLocationBeingMovedTo() + " Location");

    }
}
