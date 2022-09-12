package com.example.nestApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class VisitorModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int emp_code;
    private int mobile;
    private String username;
    private String password;

    private String designation;


    public VisitorModel(int id, String name, int emp_code, int mobile, String username, String password,String designation) {
        this.id = id;
        this.name = name;
        this.emp_code = emp_code;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
        this.designation=designation;
    }

    public VisitorModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(int emp_code) {
        this.emp_code = emp_code;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
