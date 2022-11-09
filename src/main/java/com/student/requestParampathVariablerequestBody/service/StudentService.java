package com.student.requestParampathVariablerequestBody.service;

import com.student.requestParampathVariablerequestBody.model.StudentModel;

import java.util.List;

public interface StudentService {
    public void insertStudent(StudentModel studentModel);
    public List<StudentModel> getAllStudent();
}
