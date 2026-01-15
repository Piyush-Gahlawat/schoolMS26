package com.shiryu.schoolmanagementsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
    return List.of(
            new Student(1,
                    "Randal",
                    "6",
                    "English, Mathematics, Science"
            ),
            new Student(1,
                    "Rachel",
                    "8",
                    "History, Advanced Sciences, Aramaic"
            )
    );
    }
}
