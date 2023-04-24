package org.example.controller;

import org.example.model.Student;
import org.example.view.StudentView;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String studentName) {
        model.setName(studentName);
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
