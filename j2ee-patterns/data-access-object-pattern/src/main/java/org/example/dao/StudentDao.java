package org.example.dao;

import org.example.object.Student;

import java.util.List;

/**
 * 数据访问对象接口
 */
public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
