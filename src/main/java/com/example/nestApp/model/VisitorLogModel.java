package com.example.nestApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "visitorlog")
public class VisitorLogModel {

    @Id
    @GeneratedValue
    private  int id;

    private String name;
    private String address;
    private String place;
    private String whomtomeet;
    private int mobile;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date loginTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date logoutTime;

    private String visitPurpose;

    public VisitorLogModel(int id, String name, String address, String place, String whomtomeet, int mobile, Date loginTime, Date logoutTime, String visitPurpose) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.place = place;
        this.whomtomeet = whomtomeet;
        this.mobile = mobile;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.visitPurpose = visitPurpose;
    }

    public VisitorLogModel() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWhomtomeet() {
        return whomtomeet;
    }

    public void setWhomtomeet(String whomtomeet) {
        this.whomtomeet = whomtomeet;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getVisitPurpose() {
        return visitPurpose;
    }

    public void setVisitPurpose(String visitPurpose) {
        this.visitPurpose = visitPurpose;
    }
}
