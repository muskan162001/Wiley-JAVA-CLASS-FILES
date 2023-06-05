package com.example.demo.service;

import com.example.demo.exception.DepNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@Service
public class DepServiceImpl implements DepService{

    @Autowired
    private DepartmentRepo depRepo;

    @Override
    public Department createDepartment( @RequestBody Department dep) {
        return depRepo.save(dep);
    }

    @Override
    public List<Department> getAllDepartmentsList() {
        return depRepo.findAll();
    }

    @Override
    public Department getDepartmentbyId(long departmentId) throws DepNotFoundException {

        Optional<Department> dep =  depRepo.findById(departmentId);
        //System.out.println(dep);

        if (!dep.isPresent())
            throw new DepNotFoundException("Wiley Department not available for id :"+departmentId);

        return dep.get();
    }

    @Override
    public Department updateDepartment(long departmentId, Department dep) {
        return null;
    }

    @Override
    public void delDepartment(long departmentId) {

    }

    @Override
    public Department getDepByName(String depName) {
        return null;
    }
}
