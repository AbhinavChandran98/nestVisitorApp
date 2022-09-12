package com.example.nestApp.controller;

import com.example.nestApp.dao.LeaveDao;
import com.example.nestApp.model.LeaveModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaveController {
    @Autowired
    LeaveDao dao;

   // leave request applying
    @CrossOrigin(origins = "*")
    @PostMapping("/leaveApply")
    public String leaveApply(@RequestBody LeaveModel obj){

        dao.save(obj);
        return "Leave requested";
    }


    //view all request
    @CrossOrigin(origins = "*")
    @PostMapping("/viewallrequest")
    public List<LeaveModel>viewAllRequest(){
        return (List<LeaveModel>) dao.findAll();
    }

    //status update
    @CrossOrigin(origins = "*")
    @PostMapping("/updateRequest")
    public String updateRequest(@RequestBody LeaveModel obj){
        dao.updateRequest(obj.getStatus(),obj.getEmp_Id());
        return "leave status updateds";
    }
}

