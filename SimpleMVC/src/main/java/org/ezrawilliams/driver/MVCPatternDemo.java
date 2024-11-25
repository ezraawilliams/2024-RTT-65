package org.ezrawilliams.driver;

import org.ezrawilliams.controller.StudentController;
import org.ezrawilliams.model.Student;
import org.ezrawilliams.view.StudentView;

public class MVCPatternDemo {
    private static Student retrieveStudentFromDatabase (){
        Student stu =  new Student();
        stu.setName("Robert");
        stu.setRollNum("10");
        return stu;
    }
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        Student model = retrieveStudentFromDatabase() ;
        //Create a view : to write student details on console
        StudentView view =  new StudentView () ;
        StudentController controller = new StudentController(model, view) ;
        controller. updateView();
        //update model data
        controller.setStudentName("John") ;
        controller.updateView();
    }

}