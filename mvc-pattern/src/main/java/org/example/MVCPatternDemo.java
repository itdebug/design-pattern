package org.example;

import org.example.controller.StudentController;
import org.example.model.Student;
import org.example.view.StudentView;

/**
 * Hello world!
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        System.out.println();
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
