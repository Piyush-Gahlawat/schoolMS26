package com.shiryu.schoolmanagementsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/teachers")
public class TeacherController {
    @GetMapping
    public List<Teacher> getTeachers(){
        return List.of(
                new Teacher(1,
                        "Dio",
                        1,
                        "2,4,7,8"
                ),
                new Teacher(
                        2,
                        "Jonathan",
                        2,
                        "1,5,7,8,9"
                )
        );
    }
}
