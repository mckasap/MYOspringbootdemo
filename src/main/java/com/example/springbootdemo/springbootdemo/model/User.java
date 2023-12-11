package com.example.springbootdemo.springbootdemo.model;

import java.util.UUID;

public class User {

    private String userId;
    private String userName;
    private String password;
    private String emailId;
    private String fName;
    private String lName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public User( String userName, String password, String emailId, String fName, String lName) {
        this.userId= UUID.randomUUID().toString();
        this.userName = userName;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.fName = fName;
        this.lName = lName;
    }
}
