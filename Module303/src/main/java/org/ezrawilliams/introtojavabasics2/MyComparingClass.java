package org.ezrawilliams.introtojavabasics2;

import org.ezrawilliams.introtojavabasics.Student;

public class MyComparingClass {
    //Implementation - Anonymous Class with anonymous constructor:
    Generic_FunctionInterface<Integer> compareTwoVar = new Generic_FunctionInterface<Integer>() {
        @Override
        public Integer compare(Integer a, Integer b) {
            if(a > b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
    };

    Generic_FunctionInterface<String> stCompare = new Generic_FunctionInterface<String>() {
        public  String compare(String a, String b) {
            if(a.equals(b))
            {
                return "true";
            }
            else
            {
                return "false";
            }
        }
    };

    Generic_FunctionInterface<Student> studentCompare = new Generic_FunctionInterface<Student>() {
        @Override
        public Student compare(Student a, Student b) {
            if (a.equals(b))
                return a;
             else
                 return b;
        }
    };
    public static void main(String[] args) {
        MyComparingClass compareObj = new MyComparingClass();
        int resultInteger =  compareObj.compareTwoVar.compare(55,50);
        System.out.println(resultInteger);

        String resultString = compareObj.stCompare.compare("h", "H");
        System.out.println(resultString);

        Student a = new Student();
        Student b = new Student();

        Student comparedStudent = compareObj.studentCompare.compare(a,b);

    }

}
