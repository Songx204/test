package com.winterchen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserDomain {
    private int id;
    private String username;
    private String password;
    private int phone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date creacteddatetime;
    private Date updateddatetime;
    private int sourceid;
    private int active;

    public UserDomain() {
    }

    public UserDomain(int id, String username, String password, int phone, Date creacteddatetime, Date updateddatetime, int sourceid, int active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.creacteddatetime = creacteddatetime;
        this.updateddatetime = updateddatetime;
        this.sourceid = sourceid;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getCreacteddatetime() {
        return creacteddatetime;
    }

    public void setCreacteddatetime(Date creacteddatetime) {
        this.creacteddatetime = creacteddatetime;
    }

    public Date getUpdateddatetime() {
        return updateddatetime;
    }

    public void setUpdateddatetime(Date updateddatetime) {
        this.updateddatetime = updateddatetime;
    }

    public int getSourceid() {
        return sourceid;
    }

    public void setSourceid(int sourceid) {
        this.sourceid = sourceid;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}