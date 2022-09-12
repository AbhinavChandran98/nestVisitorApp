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



}
