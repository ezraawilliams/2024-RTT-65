package org.ezrawilliams.introtojavabasics;
/*
If we need an ordered collection of items, may contain duplicates then we definitely need
a list!
 */

import java.util.ArrayList;

public class ListImplementations {
    public static void main(String[] args) {
         /*
    The ArrayList is the most POPULAR implementation of the List interface:
    It is a DYNAMIC array - We can EXTEND and CONTRACT our arraylist as we see fit
    Extends the Iterable interface - we can use an iterable object to run through it
    Implements Collection
    It ALLOWS DUPLICATES and even NULL values     */
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>(24);
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        Student student = new Student("Justice","A","Davila",25,"123 ABC Lane",
                123456, 100,"Mrs. Justice");
        Student student2 = new Student("Erica", "S","Ulysse");
        Student student3 = new Student("Chenaniah","B","Wondercheck");
        Student student4 = new Student("Matt","C","Williams");
        students.add(student);
        students.add(student2);
        System.out.println(students);
        int position = students.indexOf(student);//this method returns the position/index of
        // an element
        System.out.println(position);
        System.out.println(students.contains(student));
        students.remove(student); //remove Justice's object
        System.out.println(students);
        int position2 = students.indexOf(student2);
        students.remove(position2);
        System.out.println(students);
        System.out.println(students.size());//size of the arraylist
       // System.out.println(students.get(position));
        //students.set(2,student3);
        //students.set(3,student4);
        students.add(student3);
        students.add(student4);
        System.out.println(students.isEmpty());
        System.out.println(students);
        //students.sort();
    }


}
