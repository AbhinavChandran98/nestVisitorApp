package com.example.nestApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "leavetable")
public class LeaveModel {
    @Id
    @GeneratedValue
    private int id;
    private int emp_Id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    private Date dateOfApplication;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date leaveDate;
    private int status;

    public LeaveModel(int id, int emp_Id, Date dateOfApplication, Date leaveDate, int status) {
        this.id = id;
        this.emp_Id = emp_Id;
        this.dateOfApplication = dateOfApplication;
        this.leaveDate = leaveDate;
        this.status = status;
    }

    public LeaveModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public Date getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(Date dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
