package com.student.requestParampathVariablerequestBody.repository;

import com.student.requestParampathVariablerequestBody.model.StudentModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    List<StudentModel> students = new ArrayList<>();

    public void insertStudent(StudentModel studentModel) {
        students.add(studentModel);
    }
    public List<StudentModel> getAllStudent() {
        return students;
    }
}
