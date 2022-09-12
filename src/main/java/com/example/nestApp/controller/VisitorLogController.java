package com.example.nestApp.controller;

import com.example.nestApp.dao.VisitorLogDao;
import com.example.nestApp.model.VisitorLogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitorLogController {
    @Autowired
    VisitorLogDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/visitorsignin")
    public String visitorSignIn(@RequestBody VisitorLogModel obj){
        dao.save(obj);
        return "Sign in success";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/visitorlogview")
    public List<VisitorLogModel> visitorLogView(){
        return (List<VisitorLogModel>) dao.findAll();
    }
}
