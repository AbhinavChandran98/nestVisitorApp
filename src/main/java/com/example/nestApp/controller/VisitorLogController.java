package com.example.nestApp.controller;

import com.example.nestApp.dao.VisitorLogDao;
import com.example.nestApp.model.VisitorLogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
