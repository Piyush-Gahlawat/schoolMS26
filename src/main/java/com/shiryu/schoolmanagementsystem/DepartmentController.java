package com.shiryu.schoolmanagementsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/departments")
public class DepartmentController {
@GetMapping
    public List<Department> getDepartments(){
        return List.of(
                new Department(1,
                        "Law and Jurisprudence",
                        "This department consists of experts in law and jurisprudence, aimed at teaching students about their legal rights and how to exercise those rights",
                        "Legal Rights I, Legal Rights II, Basic Jurisprudence I, Basic Jurisprudence II, Advanced Law Practices"
                ),
                new Department(2,
                        "Social Sciences",
                        "This department consists of well trained experts of social sciences, aimed at teaching students the basics, intermediate courses of social science",
                        "History I,History II, History III, World History I, World History I, Ancient Civilizations I, Aztec Studies"
                )
        );
    }

}
