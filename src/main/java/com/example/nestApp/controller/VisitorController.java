package com.example.nestApp.controller;

import com.example.nestApp.dao.VisitorDao;
import com.example.nestApp.model.VisitorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VisitorController {
    @Autowired
    VisitorDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/add")
    public String addEmployee(@RequestBody VisitorModel obj){
        dao.save(obj);
        return "employee added";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String deleteEmployee(@PathVariable int id){
        dao.deleteById(id);
        return "employee deleted";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/update")
    public String updateEmployee(@RequestBody VisitorModel obj){

        int id=obj.getId();
        int emp_code=obj.getEmp_code();
        int mobile=obj.getMobile();
        String name= obj.getName();
        String password=obj.getPassword();
        String username=obj.getUsername();
        String desination=obj.getDesignation();
        dao.updateEmployee(emp_code,mobile,name,password,username,desination,id);
        return "updated";
    }


}
