package org.example.conroller;

import org.example.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {

    @GetMapping("getStudent")
  public Student getStudent(){
      Student student=new Student();
      student.setFirstName("menaka");
      student.setLastName("karu");

      return student;
  }

}
