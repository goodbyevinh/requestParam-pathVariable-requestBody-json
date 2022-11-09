package com.student.requestParampathVariablerequestBody.service;

import com.student.requestParampathVariablerequestBody.model.StudentModel;
import com.student.requestParampathVariablerequestBody.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    public void insertStudent(StudentModel studentModel) {
        studentRepository.insertStudent(studentModel);
    }
    public List<StudentModel> getAllStudent() {
        return studentRepository.getAllStudent();
    }
}
