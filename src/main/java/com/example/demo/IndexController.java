package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
public class IndexController {


    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        Employee employee = new Employee();
        employee.setAddress("Delhi");
        employee.setName("Parashar Devashish");
        employee.setId(101L);
        return Arrays.asList(employee);

    }
}
