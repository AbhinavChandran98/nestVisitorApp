package com.example.nestApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employeelog")
public class EmployeeLogModel {
    @Id
    @GeneratedValue
    private int id;
    private int emp_id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date employeeLogin;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date employeeLogout;

    public EmployeeLogModel(int id, int emp_id, Date employeeLogin, Date employeeLogout) {
        this.id = id;
        this.emp_id = emp_id;
        this.employeeLogin = employeeLogin;
        this.employeeLogout = employeeLogout;
    }

    public EmployeeLogModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Date getEmployeeLogin() {
        return employeeLogin;
    }

    public void setEmployeeLogin(Date employeeLogin) {
        this.employeeLogin = employeeLogin;
    }

    public Date getEmployeeLogout() {
        return employeeLogout;
    }

    public void setEmployeeLogout(Date employeeLogout) {
        this.employeeLogout = employeeLogout;
    }
}
