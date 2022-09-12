package com.example.nestApp.controller;

import com.example.nestApp.dao.EmployeeLogDao;
import com.example.nestApp.model.EmployeeLogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeLogController {

    @Autowired
    EmployeeLogDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/employeesignin")
    public String employeeSignIn(@RequestBody EmployeeLogModel obj)
    {
        dao.save(obj);
        return "sign in success";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/employeeview")
    public List<EmployeeLogModel> employeeView(){
        return (List<EmployeeLogModel>) dao.findAll();
    }
}
