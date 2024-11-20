package org.ezrawilliams.controller;

import org.ezrawilliams.model.Student;
import org.ezrawilliams.view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController (Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }
    public void setStudentName (String name){
        this.model.setName (name);
    }
    public String getStudentName (){
        return model.getName ();
    }
    public void setStudentRollNo (String rollNo) {
        model.setRollNum(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNum();
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNum() );
    }

}
