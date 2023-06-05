package com.example.demo.controller;

import com.example.demo.exception.DepNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private DepService depService;

    @PostMapping("/deps")
    public  Department createDepartment(@RequestBody Department dep)
    {
        return  depService.createDepartment(dep);

    }
    @GetMapping("/deps")
    public List<Department> getAllDepartments(){

        return depService.getAllDepartmentsList();
    }

    @GetMapping("/deps/{id}")
    public Department getDepartmentById(@PathVariable("id") Long depId) throws DepNotFoundException {

        return depService.getDepartmentbyId(depId);
    }
}
