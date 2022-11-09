package com.student.requestParampathVariablerequestBody.controller;


import com.student.requestParampathVariablerequestBody.model.StudentModel;
import com.student.requestParampathVariablerequestBody.payload.request.StudentRequest;
import com.student.requestParampathVariablerequestBody.payload.response.DataResponse;
import com.student.requestParampathVariablerequestBody.service.StudentService;
import com.student.requestParampathVariablerequestBody.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/request-param")
    public ResponseEntity<DataResponse> insertStudentByRequestParam(
            @RequestParam("name") String name,
            @RequestParam("age") int age
            ){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        studentService.insertStudent(studentModel);

        DataResponse dataResponse = new DataResponse();

        dataResponse.setSuccess(true);
        dataResponse.setStatus(200);
        dataResponse.setData(studentService.getAllStudent());
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }

    @GetMapping("/path-variable/{name}/{age}")
    public ResponseEntity<DataResponse> insertStudentByPathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") int age
            ){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        studentService.insertStudent(studentModel);

        DataResponse dataResponse = new DataResponse();

        dataResponse.setSuccess(true);
        dataResponse.setStatus(200);
        dataResponse.setData(studentService.getAllStudent());

        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }

    @PostMapping("/request-body")
    public ResponseEntity<DataResponse> insertStudentByRequesBody(@RequestBody StudentRequest studentRequest) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(studentRequest.getName());
        studentModel.setAge(studentRequest.getAge());
        studentService.insertStudent(studentModel);

        DataResponse dataResponse = new DataResponse();

        dataResponse.setSuccess(true);
        dataResponse.setStatus(200);
        dataResponse.setData(studentService.getAllStudent());

        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }
}
