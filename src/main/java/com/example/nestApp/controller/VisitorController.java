package com.example.nestApp.controller;

import com.example.nestApp.dao.VisitorDao;
import com.example.nestApp.model.VisitorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitorController {
    @Autowired
    VisitorDao dao;

//adding Employee
    @CrossOrigin(origins = "*")
    @PostMapping("/add")
    public String addEmployee(@RequestBody VisitorModel obj){
        dao.save(obj);
        return "employee added";
    }
//delete employee
    @CrossOrigin(origins = "*")
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        dao.deleteById(id);
        return "employee deleted";
    }
//update employee
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
//search employee
    @CrossOrigin(origins = "*")
    @GetMapping("/search")
    public List<VisitorModel> search(@RequestBody VisitorModel obj){
        int id=obj.getId();
        int emp_code=obj.getEmp_code();
        int mobile=obj.getMobile();
        String name= obj.getName();
        String username=obj.getUsername();
        String designation=obj.getDesignation();
        return dao.search(name,id,emp_code,username,designation,mobile);
    }


    //login
    @CrossOrigin(origins = "*")
    @GetMapping("/login")
    public String login(@RequestBody VisitorModel obj){
        String username=obj.getUsername();
        String password= obj.getPassword();
        System.out.println(username+" "+password);
        if(dao.login(username,password).size()>0){
            return "{'status':'success'}";
        }else{
            return "{'status':'failed'}";
        }

    }
}
